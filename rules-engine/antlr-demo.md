(Don't forget to delete content from the lexer tab)
http://lab.antlr.org/

Demo expression:
'doctorExperience' > 5 AND 'uni' IN LIST("accredited_universities")

Imagine something more complicated to parse:
('salaryExpectations' < TO_EUR(LIST("salary_bands", 'yearsOfExperience')) + 1000) OR (LOWER_CASE('degree') IN ["phd", "md"])

Generate code:
antlr -visitor -no-listener -Dlanguage=TypeScript VR.g4
