import { describe, it, expect } from "vitest";
import antlr4 from "antlr4";
import VRLexer from "./VRLexer";
import VRParser, { ExpressionContext } from "./VRParser";
import { DoctoVis } from "./DoctoVis";

describe("VRVisitor", () => {
  const defaultDoctor = { doctorsExperience: 20 };

  [
    { rule: `"hello" = "hello"`, expected: true },
    { rule: `"hello" = "giraffe"`, expected: false },
  ].forEach(({ rule, expected }) => {
    it(`String comparison for rule: ${rule}`, () => {
      const tree = antlrHarness(rule);
      const result = new DoctoVis(defaultDoctor).visit(tree);

      expect(result.result).toBe(expected);
    });
  });

  [
    { rule: `ISNUMBER(123)`, expected: true },
    { rule: `ISNUMBER("abc")`, expected: false },
  ].forEach(({ rule, expected }) => {
    it(`Is number rule: ${rule}`, () => {
      const tree = antlrHarness(rule);
      const result = new DoctoVis(defaultDoctor).visit(tree);

      expect(result.result).toBe(expected);
    });
  });

  [
    {
      rule: `ISNUMBER('doctorsExperience') = ISNUMBER("abc")`,
      expected: false,
    },
  ].forEach(({ rule, expected }) => {
    it(`Both number or neither: ${rule}`, () => {
      const tree = antlrHarness(rule);
      const result = new DoctoVis(defaultDoctor).visit(tree);

      expect(result.result).toBe(expected);
    });
  });

  function antlrHarness(rule: string): ExpressionContext {
    const chars = new antlr4.CharStream(rule);
    const lexer = new VRLexer(chars);
    const tokens = new antlr4.CommonTokenStream(lexer);
    const parser = new VRParser(tokens);
    return parser.expression();
  }
});
