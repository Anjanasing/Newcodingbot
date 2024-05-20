package pack1;

public class FinalVariale {
	final int number=50;
	
	public void m1() {
		final int number=60;
		
	}

	public static void main(String[] args) {
		FinalVariale obj=new FinalVariale();
		obj.m1();
		System.out.println(obj.number);

	}

}
