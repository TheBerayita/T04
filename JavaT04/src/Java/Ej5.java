package Java;

public class Ej5 {

	public static void main(String[] args) {
		int a = 1,b=2,c=3,d=4;
		System.out.println("a"+a+" b"+b+" c"+c+" d"+d);
		b=c;
		c=a;
		a=d;
		d=b;
		System.out.println("a"+a+" b"+b+" c"+c+" d"+d);

	}

}
