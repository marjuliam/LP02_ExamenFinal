
 ;declaracion de vector 
 c_11: equ 32768
 c_21: equ 32770
 c_31: equ 32772
 c_41: equ 32774
 c_51: equ 32776
 c_61: equ 32778
 c_71: equ 32780
 c_81: equ 32782
 c_91: equ 32784
 ;declaracion de vector 
 a_11: equ 32786
 a_21: equ 32788
 a_31: equ 32790
 a_41: equ 32792
 a_51: equ 32794
 a_61: equ 32796
 a_71: equ 32798
 a_81: equ 32800
 a_91: equ 32802
 ;declaracion de vector 
 b_11: equ 32804
 b_21: equ 32806
 b_31: equ 32808
 b_41: equ 32810
 b_51: equ 32812
 b_61: equ 32814
 b_71: equ 32816
 b_81: equ 32818
 b_91: equ 32820
 ;declaracion de vector 
 temp1_11: equ 32822
 temp1_21: equ 32824
 temp1_31: equ 32826
 temp1_41: equ 32828
 ;declaracion de vector 
 temp2_11: equ 32830
 temp2_21: equ 32832
 temp2_31: equ 32834
 temp2_41: equ 32836
 ;declaracion de vector 
 temp3_11: equ 32838
 temp3_21: equ 32840
 temp3_31: equ 32842
 temp3_41: equ 32844
 ;declaracion de vector 
 temp4_11: equ 32846
 temp4_21: equ 32848
 temp4_31: equ 32850
 temp4_41: equ 32852
 ;declaracion de vector 
 temp5_11: equ 32854
 temp5_21: equ 32856
 temp5_31: equ 32858
 temp5_41: equ 32860
 ;declaracion de vector 
 temp6_11: equ 32862
 temp6_21: equ 32864
 temp6_31: equ 32866
 temp6_41: equ 32868
 ;declaracion de vector 
 temp7_11: equ 32870
 temp7_21: equ 32872
 temp7_31: equ 32874
 temp7_41: equ 32876
 ;declaracion de vector 
 temp8_11: equ 32878
 temp8_21: equ 32880
 temp8_31: equ 32882
 temp8_41: equ 32884
 ;declaracion de vector 
 temp9_11: equ 32886
 temp9_21: equ 32888
 temp9_31: equ 32890
 temp9_41: equ 32892
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
 LD A,5
 LD (a_51),A
 ;asignar valor a variable
 LD A,6
 LD (a_61),A
 ;asignar valor a variable
 LD A,7
 LD (a_71),A
 ;asignar valor a variable
 LD A,8
 LD (a_81),A
 ;asignar valor a variable
 LD A,9
 LD (a_91),A
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
 ;asignar valor a variable
 LD A,5
 LD (b_51),A
 ;asignar valor a variable
 LD A,6
 LD (b_61),A
 ;asignar valor a variable
 LD A,7
 LD (b_71),A
 ;asignar valor a variable
 LD A,8
 LD (b_81),A
 ;asignar valor a variable
 LD A,9
 LD (b_91),A
 ;multiplicar (a_11)*(b_11)
 LD A,(b_11)
 LD C,A
 LD A,(a_11)
 LD B,A
 LD A,0
 ADD A,C
 DJNZ $-1
 LD (temp1_11),A
 ;multiplicar (a_21)*(b_41)
 LD A,(b_41)
 LD C,A
 LD A,(a_21)
 LD B,A
 LD A,0
 ADD A,C
 DJNZ $-1
 LD (temp1_21),A
 ;multiplicar (a_31)*(b_71)
 LD A,(b_71)
 LD C,A
 LD A,(a_31)
 LD B,A
 LD A,0
 ADD A,C
 DJNZ $-1
 LD (temp1_31),A
 ;sumar (temp1_11)+(temp1_21)
 LD A,(temp1_21)
 LD B,A
 LD A,(temp1_11)
 ADD A,B
 LD (temp1_41),A
 ;sumar (temp1_41)+(temp1_31)
 LD A,(temp1_31)
 LD B,A
 LD A,(temp1_41)
 ADD A,B
 LD (temp1_41),A
 ;multiplicar (a_11)*(b_21)
 LD A,(b_21)
 LD C,A
 LD A,(a_11)
 LD B,A
 LD A,0
 ADD A,C
 DJNZ $-1
 LD (temp2_11),A
 ;multiplicar (a_21)*(b_51)
 LD A,(b_51)
 LD C,A
 LD A,(a_21)
 LD B,A
 LD A,0
 ADD A,C
 DJNZ $-1
 LD (temp2_21),A
 ;multiplicar (a_31)*(b_81)
 LD A,(b_81)
 LD C,A
 LD A,(a_31)
 LD B,A
 LD A,0
 ADD A,C
 DJNZ $-1
 LD (temp2_31),A
 ;sumar (temp2_11)+(temp2_21)
 LD A,(temp2_21)
 LD B,A
 LD A,(temp2_11)
 ADD A,B
 LD (temp2_41),A
 ;sumar (temp2_41)+(temp2_31)
 LD A,(temp2_31)
 LD B,A
 LD A,(temp2_41)
 ADD A,B
 LD (temp2_41),A
 ;multiplicar (a_11)*(b_31)
 LD A,(b_31)
 LD C,A
 LD A,(a_11)
 LD B,A
 LD A,0
 ADD A,C
 DJNZ $-1
 LD (temp3_11),A
 ;multiplicar (a_21)*(b_61)
 LD A,(b_61)
 LD C,A
 LD A,(a_21)
 LD B,A
 LD A,0
 ADD A,C
 DJNZ $-1
 LD (temp3_21),A
 ;multiplicar (a_31)*(b_91)
 LD A,(b_91)
 LD C,A
 LD A,(a_31)
 LD B,A
 LD A,0
 ADD A,C
 DJNZ $-1
 LD (temp3_31),A
 ;sumar (temp3_11)+(temp3_21)
 LD A,(temp3_21)
 LD B,A
 LD A,(temp3_11)
 ADD A,B
 LD (temp3_41),A
 ;sumar (temp3_41)+(temp3_31)
 LD A,(temp3_31)
 LD B,A
 LD A,(temp3_41)
 ADD A,B
 LD (temp3_41),A
 ;multiplicar (a_41)*(b_11)
 LD A,(b_11)
 LD C,A
 LD A,(a_41)
 LD B,A
 LD A,0
 ADD A,C
 DJNZ $-1
 LD (temp4_11),A
 ;multiplicar (a_51)*(b_41)
 LD A,(b_41)
 LD C,A
 LD A,(a_51)
 LD B,A
 LD A,0
 ADD A,C
 DJNZ $-1
 LD (temp4_21),A
 ;multiplicar (a_61)*(b_71)
 LD A,(b_71)
 LD C,A
 LD A,(a_61)
 LD B,A
 LD A,0
 ADD A,C
 DJNZ $-1
 LD (temp4_31),A
 ;sumar (temp4_11)+(temp4_21)
 LD A,(temp4_21)
 LD B,A
 LD A,(temp4_11)
 ADD A,B
 LD (temp4_41),A
 ;sumar (temp4_41)+(temp4_31)
 LD A,(temp4_31)
 LD B,A
 LD A,(temp4_41)
 ADD A,B
 LD (temp4_41),A
 ;multiplicar (a_41)*(b_21)
 LD A,(b_21)
 LD C,A
 LD A,(a_41)
 LD B,A
 LD A,0
 ADD A,C
 DJNZ $-1
 LD (temp5_11),A
 ;multiplicar (a_51)*(b_51)
 LD A,(b_51)
 LD C,A
 LD A,(a_51)
 LD B,A
 LD A,0
 ADD A,C
 DJNZ $-1
 LD (temp5_21),A
 ;multiplicar (a_61)*(b_81)
 LD A,(b_81)
 LD C,A
 LD A,(a_61)
 LD B,A
 LD A,0
 ADD A,C
 DJNZ $-1
 LD (temp5_31),A
 ;sumar (temp5_11)+(temp5_21)
 LD A,(temp5_21)
 LD B,A
 LD A,(temp5_11)
 ADD A,B
 LD (temp5_41),A
 ;sumar (temp5_41)+(temp5_31)
 LD A,(temp5_31)
 LD B,A
 LD A,(temp5_41)
 ADD A,B
 LD (temp5_41),A
 ;multiplicar (a_41)*(b_31)
 LD A,(b_31)
 LD C,A
 LD A,(a_41)
 LD B,A
 LD A,0
 ADD A,C
 DJNZ $-1
 LD (temp6_11),A
 ;multiplicar (a_51)*(b_61)
 LD A,(b_61)
 LD C,A
 LD A,(a_51)
 LD B,A
 LD A,0
 ADD A,C
 DJNZ $-1
 LD (temp6_21),A
 ;multiplicar (a_61)*(b_91)
 LD A,(b_91)
 LD C,A
 LD A,(a_61)
 LD B,A
 LD A,0
 ADD A,C
 DJNZ $-1
 LD (temp6_31),A
 ;sumar (temp6_11)+(temp6_21)
 LD A,(temp6_21)
 LD B,A
 LD A,(temp6_11)
 ADD A,B
 LD (temp6_41),A
 ;sumar (temp6_41)+(temp6_31)
 LD A,(temp6_31)
 LD B,A
 LD A,(temp6_41)
 ADD A,B
 LD (temp6_41),A
 ;multiplicar (a_71)*(b_11)
 LD A,(b_11)
 LD C,A
 LD A,(a_71)
 LD B,A
 LD A,0
 ADD A,C
 DJNZ $-1
 LD (temp7_11),A
 ;multiplicar (a_81)*(b_41)
 LD A,(b_41)
 LD C,A
 LD A,(a_81)
 LD B,A
 LD A,0
 ADD A,C
 DJNZ $-1
 LD (temp7_21),A
 ;multiplicar (a_91)*(b_71)
 LD A,(b_71)
 LD C,A
 LD A,(a_91)
 LD B,A
 LD A,0
 ADD A,C
 DJNZ $-1
 LD (temp7_31),A
 ;sumar (temp7_11)+(temp7_21)
 LD A,(temp7_21)
 LD B,A
 LD A,(temp7_11)
 ADD A,B
 LD (temp7_41),A
 ;sumar (temp7_41)+(temp7_31)
 LD A,(temp7_31)
 LD B,A
 LD A,(temp7_41)
 ADD A,B
 LD (temp7_41),A
 ;multiplicar (a_71)*(b_21)
 LD A,(b_21)
 LD C,A
 LD A,(a_71)
 LD B,A
 LD A,0
 ADD A,C
 DJNZ $-1
 LD (temp8_11),A
 ;multiplicar (a_81)*(b_51)
 LD A,(b_51)
 LD C,A
 LD A,(a_81)
 LD B,A
 LD A,0
 ADD A,C
 DJNZ $-1
 LD (temp8_21),A
 ;multiplicar (a_91)*(b_81)
 LD A,(b_81)
 LD C,A
 LD A,(a_91)
 LD B,A
 LD A,0
 ADD A,C
 DJNZ $-1
 LD (temp8_31),A
 ;sumar (temp8_11)+(temp8_21)
 LD A,(temp8_21)
 LD B,A
 LD A,(temp8_11)
 ADD A,B
 LD (temp8_41),A
 ;sumar (temp8_41)+(temp8_31)
 LD A,(temp8_31)
 LD B,A
 LD A,(temp8_41)
 ADD A,B
 LD (temp8_41),A
 ;multiplicar (a_71)*(b_31)
 LD A,(b_31)
 LD C,A
 LD A,(a_71)
 LD B,A
 LD A,0
 ADD A,C
 DJNZ $-1
 LD (temp9_11),A
 ;multiplicar (a_81)*(b_61)
 LD A,(b_61)
 LD C,A
 LD A,(a_81)
 LD B,A
 LD A,0
 ADD A,C
 DJNZ $-1
 LD (temp9_21),A
 ;multiplicar (a_91)*(b_91)
 LD A,(b_91)
 LD C,A
 LD A,(a_91)
 LD B,A
 LD A,0
 ADD A,C
 DJNZ $-1
 LD (temp9_31),A
 ;sumar (temp9_11)+(temp9_21)
 LD A,(temp9_21)
 LD B,A
 LD A,(temp9_11)
 ADD A,B
 LD (temp9_41),A
 ;sumar (temp9_41)+(temp9_31)
 LD A,(temp9_31)
 LD B,A
 LD A,(temp9_41)
 ADD A,B
 LD (temp9_41),A
 ;asignar variable a otra variable
 LD A,(temp1_41)
 LD (c_11),A
 ;asignar variable a otra variable
 LD A,(temp2_41)
 LD (c_21),A
 ;asignar variable a otra variable
 LD A,(temp3_41)
 LD (c_31),A
 ;asignar variable a otra variable
 LD A,(temp4_41)
 LD (c_41),A
 ;asignar variable a otra variable
 LD A,(temp5_41)
 LD (c_51),A
 ;asignar variable a otra variable
 LD A,(temp6_41)
 LD (c_61),A
 ;asignar variable a otra variable
 LD A,(temp7_41)
 LD (c_71),A
 ;asignar variable a otra variable
 LD A,(temp8_41)
 LD (c_81),A
 ;asignar variable a otra variable
 LD A,(temp9_41)
 LD (c_91),A