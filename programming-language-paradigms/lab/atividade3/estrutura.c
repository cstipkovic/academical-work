#include <stdio.h>

// Product Struct
typedef struct {
  int id;
  char name[256];
  float price;
} product;

const int LISTTAM = 2;

// Imprimi a lista de produtos
void printListProducts(product p[]) {
  printf("Lista dos produtos informados: (codigo, nome, valor)\n");
  for (int i = 0; i < LISTTAM; i++) {
    printf("%d, %s, %.2f\n", p[i].id, p[i].name, p[i].price);
  }
  printf("\n");
}

// Ordena a litade produtos (usando bubblesort :-P)
void orderProductList(product p[]) {
  product tmpList[LISTTAM];

  for (int i = 0; i < LISTTAM; i++) {
    for (int j = 0; j < LISTTAM; j++) {
      if (p[j].id == (i + 1)) {
        tmpList[i] = p[j];
      }
    }
  }

  printListProducts(tmpList);
}

// Calcula e informa o valor total da lista
void calcTotalListPrice(product p[]) {
  float totalPrice = 0.00;

  for (int i = 0; i < LISTTAM; i++) {
    totalPrice = totalPrice + p[i].price;
  }

  printf("Valor total dos produtos da lista: %.2f\n", totalPrice);
}

// Cria uma lista de produtos informada pelo usuario
void createProductList() {
  product pList[LISTTAM];

  printf("Informe os dados dos produtos: (Tamanho da lista: %d)\n", LISTTAM);
  for (int i = 0; i < LISTTAM; i++) {
    printf("Codigo: ");
    scanf("%d", &pList[i].id);

    printf("Nome: ");
    scanf("%s", pList[i].name);

    printf("Valor: ");
    scanf("%f", &pList[i].price);
    printf("\n");
  }

  // Imprime a lista criada
  printListProducts(pList);

  // Informa o valor total da lista
  calcTotalListPrice(pList);
}

// Lista gerada hardcode para testar a struct
// obs.: A chamada dela esta comentada no codigo.
void listGeneratedHardcode() {
  product pList[5];

  pList[0] = (product) {3, "Laranja", 1.10};
  pList[1] = (product) {5, "Leite", 2.90};
  pList[2] = (product) {2, "Ovo", 10.27};
  pList[3] = (product) {1, "Suco Maca", 4.79};
  pList[4] = (product) {4, "Queijo Minas", 4.49};

  printListProducts(pList);
}

int main() {
  // listGeneratedHardcode();
  // printListProducts(pList);
  // orderProductList(pList);
  createProductList();

  return 0;
}
