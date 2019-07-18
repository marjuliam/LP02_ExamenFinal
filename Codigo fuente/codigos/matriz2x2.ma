programa main{
 vec c 4;
 vec a 4;
 vec b 4;

 vec temp1 3;
 vec temp2 3;
 vec temp3 3;
 vec temp4 3;

 a_1=1;a_2=2;
 a_3=3;a_4=4;

 b_1=1;b_2=2;
 b_3=3;b_4=4;

 temp1_1=(a_1*b_1);
 temp1_2=(a_2*b_3);
 temp1_3=(temp1_1+temp1_2);

 temp2_1=(a_1*b_2);
 temp2_2=(a_2*b_4);
 temp2_3=(temp2_1+temp2_2);
 
 temp3_1=(a_3*b_1);
 temp3_2=(a_4*b_3);
 temp3_3=(temp3_1+temp3_2);
 
 temp4_1=(a_3*b_2);
 temp4_2=(a_4*b_4);
 temp4_3=(temp4_1+temp4_2);

 c_1=temp1_3;
 c_2=temp2_3;
 c_3=temp3_3;
 c_4=temp4_3;
}
