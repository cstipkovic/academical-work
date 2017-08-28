#include <stdio.h>

// Product Struct
typedef struct {
  int code;
  char name[256];
  int inventory;
  float price;
} MERCADORIA;

const int LISTTAM = 2;

// Imprimi a lista de mercadorias
void printListMercadoria(MERCADORIA lm[]) {
  puts("Lista das mercadorias informadas: (codigo, nome, estoque, valor)\n");
  for (int i = 0; i < LISTTAM; i++) {
    printf("%d, %s, %d, %.2f\n", lm[i].code, lm[i].name, lm[i].inventory, lm[i].price);
  }
  printf("\n");
}

// Ordena a lista de mercadorias (usando bubblesort :-P)
void orderProductList(MERCADORIA lm[]) {
  MERCADORIA tmpList[LISTTAM];

  for (int i = 0; i < LISTTAM; i++) {
    for (int j = 0; j < LISTTAM; j++) {
      if (lm[j].code == (i + 1)) {
        tmpList[i] = lm[j];
      }
    }
  }

  printListMercadoria(tmpList);
}

// Calcula e informa o valor total da lista
void calcTotalListPrice(MERCADORIA p[]) {
  float totalPrice = 0.00;

  for (int i = 0; i < LISTTAM; i++) {
    totalPrice = totalPrice + p[i].price;
  }

  printf("Valor total dos produtos da lista: %.2f\n", totalPrice);
}

// Cria uma lista de produtos informada pelo usuario
void createMercadoriaList() {
  MERCADORIA mList[LISTTAM];

  printf("Informe os dados dos produtos: (Tamanho da lista: %d)\n", LISTTAM);
  for (int i = 0; i < LISTTAM; i++) {
    printf("Codigo: ");
    scanf("%d", &mList[i].code);

    printf("Nome: ");
    scanf("%s", mList[i].name);

    printf("Estoque: ");
    scanf("%d", &mList[i].inventory);

    printf("Valor: ");
    scanf("%f", &mList[i].price);
    printf("\n");
  }

  // Imprime a lista criada
  printListMercadoria(mList);

  // Informa o valor total da lista
  calcTotalListPrice(mList);
}

void bayMercadoria() {
  
}

// Lista gerada hardcode para testar a struct
// obs.: A chamada dela esta comentada no codigo.
void listGeneratedHardcode() {
  MERCADORIA mList[5];

  mList[0] = (MERCADORIA) {3, "Laranja", 5, 1.10};
  mList[1] = (MERCADORIA) {5, "Leite", 4, 2.90};
  mList[2] = (MERCADORIA) {2, "Ovo", 8, 10.27};
  mList[3] = (MERCADORIA) {1, "Suco Maca", 5, 4.79};
  mList[4] = (MERCADORIA) {4, "Queijo Minas", 9, 4.49};

  printListMercadoria(mList);
}

int main() {
  // listGeneratedHardcode();
  // printListMercadoria(mList);
  // orderProductList(mList);
  createMercadoriaList();

  return 0;
}
