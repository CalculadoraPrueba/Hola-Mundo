import java.util.Scanner;

public class Calculadora {
	
	Scanner teclado = new Scanner(System.in);
	
	public void Sumar() {
		System.out.println("Ingrese el primer numero a sumar: ");
		Integer numero1 = teclado.nextInt();
		System.out.println("Ingrese el segundo numero a sumar: ");
		Integer numero2= teclado.nextInt();
		Integer resultado = numero1 + numero2;
		System.out.println(numero1 + " + " + numero2 + "= " + resultado);
	}
}
	
		
	
