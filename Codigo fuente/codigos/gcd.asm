 ;declaracion de variable 
 a1: equ 32768
 ;declaracion de variable 
 b1: equ 32770
 ;asignar valor a variable
 LD A,88
 LD (a1),A
 ;asignar valor a variable
 LD A,99
 LD (b1),A
 While1:
 LD A,(b1)
 LD B,A
 LD A,(a1)
 SUB B
 JP Z, EndWhile1
 If1:
 LD A,(a1)
 LD B,A
 LD A,(b1)
 SUB B
 JP NC, Else1
 Then1:
 ;restar (a1)-(b1)
 LD A,(b1)
 LD B,A
 LD A,(a1)
 SUB B
 LD (a1),A
 jp Endif1
 Else1:
 ;restar (b1)-(a1)
 LD A,(a1)
 LD B,A
 LD A,(b1)
 SUB B
 LD (b1),A
 Endif1:
 JP While1
 EndWhile1:
