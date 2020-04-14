import java.util.Scanner;

import com.sun.net.httpserver.Authenticator.Result;

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
	
	public void Restar() {
		System.out.println("Ingrese un numero");
		Integer numero1 = teclado.nextInt();
		System.out.println("Ingrese el segundo numero: ");
		Integer numero2 = teclado.nextInt();
		Integer resultado = numero1 - numero2;
		System.out.println(numero1 + " - " + numero2 + "= " + resultado);
	}
	
	public void Multiplicar() {
            System.out.println("Ingrese un numero");
            Integer numero1 = teclado.nextInt();
            System.out.println("Ingrese el segundo numero: ");
            Integer numero2 = teclado.nextInt();
            Integer resultado = numero1 * numero2;
            System.out.println(numero1 + "*"+ numero2 + "=" + resultado);
	}
	
	public void Dividir() {
		System.out.println("Ingrese un numero");
        Double numero1 = teclado.nextDouble();
        System.out.println("Ingrese el segundo numero: ");
        Double numero2 = teclado.nextDouble();
        if(numero2==0) {
        	System.out.println("No se puede dividir por 0");
        }
        else {
        	Double resultado = numero1 / numero2;
        	System.out.println(numero1 + " / " + numero2 + "= " +resultado);
        }
	}
}
	
		
	
