package Figuras;

public class Circulo extends Figura {
	double raio;
	
	Circulo(String corPreenchimento, int espessuraLinha, String corLinha, double raio) {
		super("verde", 1, "vermelho");
		this.raio = raio;
	}
	
	Circulo(double raio) {
		super(corPreenchimento, espessuraLinha, corLinha);
		this.raio = raio;
	}

	double calculaArea() {
		return raio * raio * Math.PI;
	}
    
	double calculaPerimetro() {
		return 2 * Math.PI * raio;
	}
	
	public String toString () {
		String dados = (
                "raio = " + this.raio + 
                " cor preenchimento " + corPreenchimento + 
                " espessura " + espessuraLinha + 
                " e cor da Linha "+ corLinha
        );
		return dados;
	}

}
