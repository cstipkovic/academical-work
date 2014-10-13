package Figuras;

public abstract class Figura {
	static String corPreenchimento;
	static int espessuraLinha;
	static String corLinha;
    
	Figura(String corPreenchimento, int espessuraLinha, String corLinha) {
		this.corPreenchimento = corPreenchimento;
		this.espessuraLinha = espessuraLinha;
		this.corLinha = corLinha;
	}
    
	double calculaArea() {
		return 0;	
	}
    
	double calculaPerimetro() {
		return 0;	
	}
}
