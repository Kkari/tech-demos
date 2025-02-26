import { EqExpContext, StrExpContext } from "./VRParser";
import VRVisitor from "./VRVisitor";

type Doctor = {
  doctorsExperience: number;
};

type ValidationResult = {
  result: boolean;
  value: string | number | boolean;
};

export class DoctoVis extends VRVisitor<ValidationResult> {
  // constructor with Doctor type
  constructor(private doctor: Doctor) {
    super();
  }

  visitEqExp = (ctx: EqExpContext): ValidationResult => {
    const res =
      this.visit(ctx.children![0]).value === this.visit(ctx.children![2]).value;
    return {
      result: res,
      value: res,
    };
  };

  visitStrExp = (ctx: StrExpContext): ValidationResult => {
    return {
      result: true,
      value: ctx.getChild(0).toString(),
    };
  };
}
