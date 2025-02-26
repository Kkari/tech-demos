(Don't forget to delete content from the lexer tab)
http://lab.antlr.org/

Demo expression:
'doctorExperience' > 5 AND 'uni' IN LIST("accredited_universities")

Imagine something more complicated to parse:
('salaryExpectations' < TO_EUR(SALARY('yearsOfExperience')) + 1000) OR (... AND ...)

Generate code:
antlr -visitor -no-listener -Dlanguage=TypeScript VR.g4
