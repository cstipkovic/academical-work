package Figuras;

public class Triangulo extends Figura {
	double base;
	double altura;

	Triangulo(String corPreenchimento, int espessuraLinha, String corLinha, double base, double altura) {
		super(corPreenchimento, espessuraLinha, corLinha);
		this.base = base;
		this.altura = altura;
	}
    
	Triangulo(double base, double altura) {
		super("verde", 1, "amarelo");
		this.base = base;
		this.altura = altura;
    }
	
	double calculaArea() {
		return base * altura / 2.0; 
	}
    
	double calculaPerimetro() {
		return 3 * base;
	}
    
	public String toString () {
		String dados = (
                "base = " + this.base + 
                " altura = " + this.altura + 
                " cor preenchimento " + this.corPreenchimento + 
                " espessura " + this.espessuraLinha + 
                " e cor da Linha " + this.corLinha
        );
		return dados;
	} 
}
