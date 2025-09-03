package TMB;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Persona p;
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese los siguientes Datos: ");
		System.out.println("Peso (kilos): ");
		double peso = sc.nextDouble();
		System.out.println("Altura (centimetros): ");
		double altura = sc.nextDouble();
		System.out.println("Edad (años): ");
		double edad = sc.nextDouble();
		System.out.println("Genero (0 para Hombre o 1 para Mujer): ");
		int genero = sc.nextInt();
		
		sc.close();
		
		if (genero == 1) {
			p = new Mujer(peso,edad,altura);
		} else {
			p = new Hombre(peso,edad,altura);
		}
		try {
			double tmb = p.CalculoTMB();
			System.out.println("Tu tasa metabolica basal (TMB) es: " + tmb);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
	}
}



