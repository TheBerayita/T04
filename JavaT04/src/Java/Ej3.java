package Java;

public class Ej3 {
	public static void main(String[] args) {
		int x = 4,y = 5;
		double n=3, m=3.2;
		
		int suma = x + y;
        int resta = x - y;
        int multiplicar = x * y;
        int dividir = x / y;
        int modulo = x % y;
        
        double sumadbl = n + m;
        double restadbl = n - m;
        double multiplicardbl = n * m;
        double dividirdbl = n / m;
        double modulodbl = n % m;
        
        double sumaxn = x+n;
        double dividiryn=y/n;
        double moduloym=y%m;
        
        int x2 = x*2,y2=y*2;
        double n2=n*2,m2=m*2;
        
        double sumaTotal=x+y+n+m;
        
        System.out.println("Suma: "+suma+",Resta: "+resta+",Multiplicacion: "+multiplicar+",Dividir: "+dividir+",Modulo: "+modulo);
        System.out.println("Suma: "+sumadbl+",Resta: "+restadbl+",Multiplicacion: "+multiplicardbl+",Dividir: "+dividirdbl+",Modulo: "+modulodbl);
        System.out.println("Suma xn:"+sumaxn+",Dividiryn:"+ dividiryn+",Modulo: "+moduloym);
        System.out.println("Dobles: "+x2+","+y2+","+n2+","+m2);
        System.out.println("Suma total: "+sumaTotal);
	}
}
