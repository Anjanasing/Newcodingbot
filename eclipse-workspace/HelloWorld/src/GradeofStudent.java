
public class GradeofStudent {
  public static void main(String[]args) {
int h =45;
int e =10;
int sc =45;
int sst =77;
 char grade ='A';
 double per =0.0;
 per =(h+e+sc+sst)/4;
   if(per>=85)
	   grade ='A';
   else if(per>=70)
	   grade ='B';
   else if(per>=55)
	   grade ='C';
   else if(per>=40)
	   grade ='D';
   else 
	   grade ='E';
   System.out.println(grade);
  }
}
   
