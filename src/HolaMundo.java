import java.util.Scanner;

public class HolaMundo {

	public static void main(String[] args) {
		Calculadora calculo = new Calculadora();
		Scanner teclado = new Scanner(System.in);
		System.out.println("1. Sumar");
		System.out.println("2. Restar");
		System.out.println("3. Multiplicar");
		System.out.println("4. Dividir");
		System.out.println("5. Potencia");
		System.out.println("6. Factorial");
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
				
			case 3:
				calculo.Multiplicar();
				break;
				
			case 4: 
				calculo.Dividir();
				break;
			
			case 5: 
				calculo.Potencia();
				break;
				
			case 6:
				calculo.Factorial();
				break;
			
			default:
				System.out.println("No existe esa opcion vuelva a ingresar");
			}
			
			System.out.println("1. Sumar");
			System.out.println("2. Restar");
			System.out.println("3. Multiplicar");
			System.out.println("4. Dividir");
			System.out.println("5. Potencia");
			System.out.println("6. Factorial");
			System.out.println("0. Terminar");
			opcion = teclado.nextInt();
		}
		
		System.out.println("A salido del programa");
	}
}
