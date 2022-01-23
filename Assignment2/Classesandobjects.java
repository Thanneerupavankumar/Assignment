package Assignment2;

public class Classesandobjects {
	int r;
	void main() {
		double pi=3.14;
		double area=pi*r*r;
		System.out.println(area);
	}
public static void main(String[] args) {
	Classesandobjects c=new Classesandobjects();
	Classesandobjects f=new Classesandobjects();
	Classesandobjects g=new Classesandobjects();
	Classesandobjects c1=new Classesandobjects();
	c.r=6;
    c.main();
	f.r=5;
	f.main();
	g.r=8;
	g.main();
	c1.r=9;
	c1.main();
}
}
