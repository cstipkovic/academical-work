package Figuras;

public class Quadrado extends Figura {
	double lado;
    
	Quadrado(String corPreenchimento, int espessuraLinha, String corLinha, double lado) {
		super(corPreenchimento, espessuraLinha, corLinha);
		this.lado = lado;
    }
    
	Quadrado(double lado) {
		super("azul", 2, "verde");
		this.lado = lado;
	}
    
	double calculaArea() {
		return lado * lado;
	}
    
	double calculaPerimetro() {
		return 4 * lado;
	}
    
	public String toString () {
		String dados = (
                "lado = "+ this.lado + 
                " cor preenchimento " + this.corPreenchimento + 
                " espessura " + this.espessuraLinha + 
                " e cor da Linha " + this.corLinha
        );
		return dados;
	}
}
