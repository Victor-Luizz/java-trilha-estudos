import java.util.Scanner;

public class Program {

	public static void main(String [] args ) {
	Scanner sc = new Scanner(System.in);
	double lado1;
	double lado2;
	double lado3;
	
	System.out.println("Informe os valores correspondentes ao lado do triângulo :  ");
	lado1 =sc.nextDouble();
	lado2 =sc.nextDouble();
	lado3 = sc.nextDouble();
	
	if (lado1 ==lado3 && lado1 == lado3) {
		System.out.println("Equilátero");
	}
	else if (lado1 == lado2 && lado1 != lado3) {
		System.out.println("Isósceles");
	}
	else {
		System.out.println("Escaleno");
	}
	
	sc.close();
		
		
		
	}
}
