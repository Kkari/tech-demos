import {
  EqExpContext,
  IsNumberExpContext,
  StrExpContext,
  IntegerExpContext,
  ColExpContext,
} from "./VRParser";
import VRVisitor from "./VRVisitor";

type Doctor = {
  doctorsExperience: number;
};

type ValidationResult = {
  result: boolean;
  value: string | number | boolean;
};

export class DoctoVis extends VRVisitor<ValidationResult> {
  constructor(private doctor: Doctor) {
    super();
  }

  visitEqExp = (ctx: EqExpContext): ValidationResult => {
    const value =
      this.visit(ctx.children![0]).value === this.visit(ctx.children![2]).value;
    return { result: value, value };
  };

  visitStrExp = (ctx: StrExpContext): ValidationResult => {
    return {
      result: true,
      value: ctx.getChild(0).toString(),
    };
  };

  visitIntegerExp = (ctx: IntegerExpContext): ValidationResult => {
    return {
      result: true,
      value: Number(ctx.getChild(0).toString()),
    };
  };

  visitIsNumberExp = (ctx: IsNumberExpContext): ValidationResult => {
    const child = this.visit(ctx.children![1]);
    console.log(child);
    const value = !isNaN(Number(child.value));
    return { result: value, value };
  };

  visitColExp = (ctx: ColExpContext): ValidationResult => {
    const varName = ctx.getChild(0).toString().replace(/^'|'$/g, "");
    const value = this.doctor[varName];
    return { result: true, value };
  };
}
