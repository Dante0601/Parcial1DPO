package TMB;

public class Mujer extends Persona {

	public Mujer(double peso, double edad, double altura) {
		super(peso, edad, altura);
	}

	@Override
	public double CalculoTMB() throws Exception {
		if (this.peso < 40 || this.peso > 80)
			throw new Exception("No cumple con la condicion de peso, el peso debe estar en el ragno de 40 <= peso <= 80");
		else if (this.edad <= 15) {
			throw new Exception("No cumple con la condicion de edad, la edad debe ser mayor a 15");
		}
		else if (this.altura < 140 || this.altura > 180) {
			throw new Exception("No cumple con la condicion de altura, la altura debe estar en el ragno de 140 <= altura <= 180");
		}
		
		else {
			return 447.593 + (9.247*this.peso) + (3.098*this.altura) - (4.33*this.edad);
		}
	}

}
