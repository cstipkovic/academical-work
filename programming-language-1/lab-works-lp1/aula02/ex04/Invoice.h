#include <iostream>

using namespace std;

class Invoice {
	private:
		int ID, qtItem;
		float preco, total;
		string descricao;

	public:
		Invoice();

		int GetID();
		void SetID(int);

		int GetQtItem();
		void SetQtItem(int);

		float GetPreco();
		void SetPreco(float);

		string GetDescricao();
		void SetDescricao(string);

		double GetInvoiceAmount();
};
