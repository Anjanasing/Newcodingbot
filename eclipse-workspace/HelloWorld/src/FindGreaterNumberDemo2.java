
public class FindGreaterNumberDemo2 {

	public static void main(String[] args) {
		FindGreaterNumberDemo2 test=new FindGreaterNumberDemo2();
		test.findGreater(10,20,30);
	}

		public void findGreater(int a,int b,int c) { 
			if(a>b) { 
				if(a>c) { 
					System.out.println("a is a greater number");
				}else { 
					
				
					System.out.println("c is a greater number");
				}
			}else if(b>c) {
						System.out.println("b is a greater number");
			}else {
							System.out.println("c is a greater number");
						
			}
		}
}
						
					
					
			


	


