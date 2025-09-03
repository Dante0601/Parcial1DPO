package TMB;

public abstract class Persona {

	protected double peso;
	protected double edad;
	protected double altura;
	
	public Persona(double peso, double edad, double altura) {
		this.peso = peso;
		this.edad = edad;
		this.altura = altura;
	}
	
	public abstract double CalculoTMB() throws Exception;
}
