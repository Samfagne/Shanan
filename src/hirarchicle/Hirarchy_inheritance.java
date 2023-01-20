package hirarchicle;

public class Hirarchy_inheritance {//ulc
public static void main(String[] args) {
	son1 s1= new son1();
	s1.car();
	s1.home();
	s1.money();
	s1.secBike();
	System.out.println("prperties of son1");
	System.out.println("s1");
	son2 s2 = new son2();
		s2.car();
	s2.home();
	s2.money();
	s2.secLaptop();
	System.out.println("properties of son2");
	System.out.println("s2");
	son3 s3 = new son3();
	s3.car();
	s3.home();
	s3.money();
	s3.secMobile();
	System.out.println("properties of son3");
}


}
