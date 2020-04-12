import java.util.Scanner;

public class HolaMundo {

	public static void main(String[] args) {
		Calculadora calculo = new Calculadora();
		Scanner teclado = new Scanner(System.in);
		System.out.println("1. Sumar");
		System.out.println("2. Restar");
		System.out.println("0. Terminar");
		Integer opcion = teclado.nextInt();
		
		while(opcion != 0){
			
			switch(opcion) {
			
			case 1: 
				calculo.Sumar();
				break;
			
			case 2: 
				calculo.Restar();
				break;
	
			default:
				System.out.println("No existe esa opcion vuelva a ingresar");
			}
			
			System.out.println("1. Sumar");
			System.out.println("2. Restar");
			System.out.println("0. Terminar");
			opcion = teclado.nextInt();
		}
		
		System.out.println("A salido del programa");
	}
}
