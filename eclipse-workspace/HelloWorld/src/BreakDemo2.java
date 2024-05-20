
public class BreakDemo2 {

	public static void main(String[] args) {

  int i=20;
  l1:
  {
	  System.out.println("Hello");
	  if(i==10)
		  break l1;
	  System.out.println("Hi");
  }
  System.out.println("end");
  

	}

}
