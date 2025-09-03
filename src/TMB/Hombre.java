package TMB;

public class Hombre extends Persona {

	public Hombre(double peso, double edad, double altura) {
		super(peso, edad, altura);
	}

	@Override
	public double CalculoTMB() throws Exception {
		if (this.peso < 60 || this.peso > 110)
			throw new Exception("No cumple con la condicion de peso, el peso debe estar en el ragno de 60 <= peso <= 110");
		else if (this.edad <= 15) {
			throw new Exception("No cumple con la condicion de edad, la edad debe ser mayor a 15");
		}
		else if (this.altura < 160 || this.altura > 195) {
			throw new Exception("No cumple con la condicion de altura, la altura debe estar en el ragno de 160 <= altura <= 195");
		}
		
		else {
			return 88.362 + (13.397*this.peso) + (4.799*this.altura) - (5.677*this.edad);
		}

	}

}
