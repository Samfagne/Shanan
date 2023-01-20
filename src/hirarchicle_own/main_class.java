package hirarchicle_own;

public class main_class {//blc
	public static void main(String[]arg) {
		art a1 = new art();
		a1.age();
		a1.BA();
		a1.MA();
		a1.rollno();
		System.out.println("print all a1");
		System.out.println("a1");
		
	engg e= new engg();
	e.age();
    e.rollno();
    e.electrical();
    e.mechanical();
    e.cs();
	System.out.println("print all e");
	System.out.println("e");
	 medical m = new medical();
	 m.age();
	 m.bams();
	 m.bds();
	 m.rollno();
	 System.out.println("print all m");
		System.out.println("m");
}
}
