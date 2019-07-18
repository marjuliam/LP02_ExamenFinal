
 ;declaracion de vector 
 c_11: equ 32768
 c_21: equ 32770
 c_31: equ 32772
 c_41: equ 32774
 ;declaracion de vector 
 a_11: equ 32776
 a_21: equ 32778
 a_31: equ 32780
 a_41: equ 32782
 ;declaracion de vector 
 b_11: equ 32784
 b_21: equ 32786
 b_31: equ 32788
 b_41: equ 32790
 ;declaracion de vector 
 temp1_11: equ 32792
 temp1_21: equ 32794
 temp1_31: equ 32796
 ;declaracion de vector 
 temp2_11: equ 32798
 temp2_21: equ 32800
 temp2_31: equ 32802
 ;declaracion de vector 
 temp3_11: equ 32804
 temp3_21: equ 32806
 temp3_31: equ 32808
 ;declaracion de vector 
 temp4_11: equ 32810
 temp4_21: equ 32812
 temp4_31: equ 32814
 ;asignar valor a variable
 LD A,1
 LD (a_11),A
 ;asignar valor a variable
 LD A,2
 LD (a_21),A
 ;asignar valor a variable
 LD A,3
 LD (a_31),A
 ;asignar valor a variable
 LD A,4
 LD (a_41),A
 ;asignar valor a variable
 LD A,1
 LD (b_11),A
 ;asignar valor a variable
 LD A,2
 LD (b_21),A
 ;asignar valor a variable
 LD A,3
 LD (b_31),A
 ;asignar valor a variable
 LD A,4
 LD (b_41),A
 ;multiplicar (a_11)*(b_11)
 LD A,(b_11)
 LD C,A
 LD A,(a_11)
 LD B,A
 LD A,0
 ADD A,C
 DJNZ $-1
 LD (temp1_11),A
 ;multiplicar (a_21)*(b_31)
 LD A,(b_31)
 LD C,A
 LD A,(a_21)
 LD B,A
 LD A,0
 ADD A,C
 DJNZ $-1
 LD (temp1_21),A
 ;sumar (temp1_11)+(temp1_21)
 LD A,(temp1_21)
 LD B,A
 LD A,(temp1_11)
 ADD A,B
 LD (temp1_31),A
 ;multiplicar (a_11)*(b_21)
 LD A,(b_21)
 LD C,A
 LD A,(a_11)
 LD B,A
 LD A,0
 ADD A,C
 DJNZ $-1
 LD (temp2_11),A
 ;multiplicar (a_21)*(b_41)
 LD A,(b_41)
 LD C,A
 LD A,(a_21)
 LD B,A
 LD A,0
 ADD A,C
 DJNZ $-1
 LD (temp2_21),A
 ;sumar (temp2_11)+(temp2_21)
 LD A,(temp2_21)
 LD B,A
 LD A,(temp2_11)
 ADD A,B
 LD (temp2_31),A
 ;multiplicar (a_31)*(b_11)
 LD A,(b_11)
 LD C,A
 LD A,(a_31)
 LD B,A
 LD A,0
 ADD A,C
 DJNZ $-1
 LD (temp3_11),A
 ;multiplicar (a_41)*(b_31)
 LD A,(b_31)
 LD C,A
 LD A,(a_41)
 LD B,A
 LD A,0
 ADD A,C
 DJNZ $-1
 LD (temp3_21),A
 ;sumar (temp3_11)+(temp3_21)
 LD A,(temp3_21)
 LD B,A
 LD A,(temp3_11)
 ADD A,B
 LD (temp3_31),A
 ;multiplicar (a_31)*(b_21)
 LD A,(b_21)
 LD C,A
 LD A,(a_31)
 LD B,A
 LD A,0
 ADD A,C
 DJNZ $-1
 LD (temp4_11),A
 ;multiplicar (a_41)*(b_41)
 LD A,(b_41)
 LD C,A
 LD A,(a_41)
 LD B,A
 LD A,0
 ADD A,C
 DJNZ $-1
 LD (temp4_21),A
 ;sumar (temp4_11)+(temp4_21)
 LD A,(temp4_21)
 LD B,A
 LD A,(temp4_11)
 ADD A,B
 LD (temp4_31),A
 ;asignar variable a otra variable
 LD A,(temp1_31)
 LD (c_11),A
 ;asignar variable a otra variable
 LD A,(temp2_31)
 LD (c_21),A
 ;asignar variable a otra variable
 LD A,(temp3_31)
 LD (c_31),A
 ;asignar variable a otra variable
 LD A,(temp4_31)
 LD (c_41),A