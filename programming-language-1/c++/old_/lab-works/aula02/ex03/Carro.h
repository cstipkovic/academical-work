class Carro {
	private:
	    int kilometragem;
	    float qtCombustivelNoTanque;

	public:
		Carro();
		int GetAutonomiaTanque();
		float GetCombustivelNoTanque();
		void SetCombustivelNoTanque(float);
		int GetKilometragem();
		void SetKilometragem(int);
		bool AbastecerCarro(int);
		void MoverCarro(int);
};
