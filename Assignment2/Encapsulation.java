package Assignment2;

public class Encapsulation {
public static void main(String[] args) {
	Bean e=new Bean();
	e.setName("Pavan");
	e.setId(4);
    Bean []g=new Bean[3];
    g[0]=e;
    g[1]=e;
    g[2]=e;
    for(Bean value:g) {
    	System.out.println("name -->"+value.getName()+" ID -->"+value.getId());
    }
}
}
class Bean{
private int a;
private String c;
void setId(int a) {
	this.a=a;
}
void setName(String c) {
	this.c=c;
}
int getId() {
	return a;
}
String getName() {
	return c;
}
}