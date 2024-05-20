package pack1;

public class OverridingMain {

	public static void main(String[] args) {
       ParentClass p1=new ParentClass();
       p1.m1();
        ChildClass c1=new ChildClass();
        c1.m1();
        ParentClass p2=new ChildClass();
	    p2.m1();
	}

}
