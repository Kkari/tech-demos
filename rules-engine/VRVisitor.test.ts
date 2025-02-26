import { describe, it, expect } from "vitest";
import antlr4 from "antlr4";
import VRLexer from "./VRLexer";
import VRParser, { ExpressionContext } from "./VRParser";
import { DoctoVis } from "./DoctoVis";

describe("VRVisitor", () => {
  const defaultDoctor = { doctorsExperience: 20 };

  const testCases = [
    { rule: `"hello" = "hello"`, expected: true },
    { rule: `"hello" = "giraffe"`, expected: false },
  ];

  testCases.forEach(({ rule, expected }) => {
    it(`String comparison for rule: ${rule}`, () => {
      const tree = antlrHarness(rule);
      const result = new DoctoVis(defaultDoctor).visit(tree);

      expect(result.result).toBe(expected);
    });
  });

  it.skip("Integer comparison with column reference ", () => {
    const rule = "'doctorsExperience' > 19";
    const trueContext = { doctorsExperience: 20 };
    const falseContext = { doctorsExperience: 18 };
    const tree = antlrHarness(rule);
    const result = new DoctoVis().visit(tree);

    expect(result).toBe(true); // Adjust the expected result based on your VRVisitor implementation
  });

  function antlrHarness(rule: string): ExpressionContext {
    const chars = new antlr4.CharStream(rule);
    const lexer = new VRLexer(chars);
    const tokens = new antlr4.CommonTokenStream(lexer);
    const parser = new VRParser(tokens);
    return parser.expression();
  }
});
