#include <stdio.h>

// Product Struct
typedef struct {
  int code;
  char name[256];
  int inventory;
  float price;
} MERCADORIA;

typedef struct {
  int code;
  int qt;
  float price;
} SACOLA;

const int LISTTAM = 2;
const int SACOLATAM = 1;

// Imprime a lista de mercadorias
void printListMercadoria(MERCADORIA *lm, int tam) {
  puts("\nLista das mercadorias informadas: (codigo, nome, estoque, valor)\n");
  for (int i = 0; i < tam; i++) {
    printf("%d, %s, %d, %.2f\n", lm[i].code, lm[i].name, lm[i].inventory, lm[i].price);
  }
  printf("\n");
}

void printListSacola(SACOLA *ls, int tam) {
  puts("\nLista das mercadorias na sacola:\n");
  for (int i = 0; i < tam; i++) {
    printf("Code: %d, Qt: %d, Total: %.2f\n", ls[i].code, ls[i].qt, (ls[i].qt * ls[i].price));
  }
  printf("\n");
}

// Ordena a lista de mercadorias (usando bubblesort :-P)
void orderProductList(MERCADORIA *lm) {
  MERCADORIA aux;

  for (int i = 0; i < LISTTAM; i++) {
    for (int j = 0; j < (LISTTAM - 1); j++) {
      if (lm[j].code > lm[j + 1].code) {
        aux = lm[j];
        lm[j] = lm[j + 1];
        lm[j + 1] = aux;
      }
    }
  }
}

// Calcula e informa o valor total da lista
void calcTotalListPrice(SACOLA *ls) {
  float totalPrice = 0.00;

  for (int i = 0; i < SACOLATAM; i++) {
    totalPrice = totalPrice + (ls[i].price * ls[i].qt);
  }

  printf("Valor total das mercadorias na sacola: %.2f\n", totalPrice);
}

// Cria uma lista de produtos informada pelo usuario
void createMercadoriaList(MERCADORIA *lm) {
  printf("Informe os dados dos produtos: (Tamanho da lista: %d)\n", LISTTAM);
  for (int i = 0; i < LISTTAM; i++) {
    printf("Codigo: ");
    scanf("%d", &lm[i].code);

    printf("Nome: ");
    scanf("%s", lm[i].name);

    printf("Estoque: ");
    scanf("%d", &lm[i].inventory);

    printf("Valor: ");
    scanf("%f", &lm[i].price);
    printf("\n");
  }
}

int findMercadoria(MERCADORIA *lm, int code) {
  for (int i = 0; i < LISTTAM; i++) {
    if (lm[i].code == code) {
      return i;
    }
  }

  return -1;
}

void bayMercadoria(MERCADORIA *lm, SACOLA *sl) {
  puts("Informe os itens que voce deseja comprar:");
  for (int i = 0; i < SACOLATAM; i++) {
    printf("\nCodigo: ");
    scanf("%d", &sl[i].code);

    int mercadoria = findMercadoria(lm, sl[i].code);
    if (mercadoria == -1) {
      puts("\nMercadoria nao existe na lista cadastrada.");
    } else {
      printf("Qt da mercadoria: ");
      scanf("%d", &sl[i].qt);

      if (lm[mercadoria].inventory < sl[i].qt) {
        printf("\nExitem apenas %d unidades da mercadoria (%s) disponiveis\n", lm[mercadoria].inventory, lm[mercadoria].name);
        sl[i].qt = 0;
      } else {
        lm[mercadoria].inventory = lm[mercadoria].inventory - sl[i].qt;
        sl[i].price = lm[mercadoria].price;
      }
    }
  }
}

// Lista gerada hardcode para testar a struct
// obs.: A chamada dela esta comentada no codigo.
void testHardcode() {
  MERCADORIA mList[5];

  mList[0] = (MERCADORIA) {3, "Laranja", 5, 1.10};
  mList[1] = (MERCADORIA) {5, "Leite", 4, 2.90};
  mList[2] = (MERCADORIA) {2, "Ovo", 8, 10.27};
  mList[3] = (MERCADORIA) {1, "Suco Maca", 5, 4.79};
  mList[4] = (MERCADORIA) {4, "Queijo Minas", 9, 4.49};

  SACOLA sacList[SACOLATAM];

  orderProductList(mList);
  printListMercadoria(mList, LISTTAM);

  bayMercadoria(mList, sacList);
  printListSacola(sacList, SACOLATAM);

  calcTotalListPrice(sacList);
}

int main() {
  // Função para teste
  // testHardcode();

  // Função que roda pedindo a inclusão dos produtos
  MERCADORIA mList[LISTTAM];
  createMercadoriaList(mList);
  orderProductList(mList);
  printListMercadoria(mList, LISTTAM);

  SACOLA sacList[SACOLATAM];
  bayMercadoria(mList, sacList);
  printListSacola(sacList, SACOLATAM);

  calcTotalListPrice(sacList);

  return 0;
}
