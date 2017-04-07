#include <stdio.h>
#include <stdlib.h>
#include <time.h>

void imprime(int m[][9], int nlin);
int  aceitavel(int m[][9], int lin, int col);
void embaralha(int v[], int tam);
int  tentativa(int m[][9], int lin, int col);

int main()
{
    int m[9][9]={0};    
    
    srand(time(NULL));
    if (tentativa(m,0,0)==1)
       imprime(m,9);    
    system("PAUSE");	
    return 0;
}

int tentativa(int m[][9], int lin, int col)
{
    int aceito= 0, i=0, plin,pcol;
    int seqCand[]= {1,2,3,4,5,6,7,8,9};
    embaralha(seqCand, 9);
    do {
        m[lin][col]= seqCand[i];
        if (aceitavel(m,lin,col)){
            if (lin==8 && col==8)
                aceito=1;
            else {
               if (col<8) { plin=lin; pcol= col+1; }
                  else  { plin=lin+1; pcol= 0; }
               aceito= tentativa(m, plin, pcol);
            }
        }
        if (aceito==0){
           m[lin][col]= 0;
           i++;
        }
    } while (aceito==0 && i<9);
    return aceito;
}



void imprime(int m[][9], int nlin)
{
     int i,j;
     for (i=0; i<nlin; i++){
          if (i%3 == 0) printf("\n");
          for (j=0; j<9; j++){
             if (j%3 == 0) printf("  ");
             printf(" %d ", m[i][j]);
         }
         printf("\n");
     }
}




int  aceitavel(int m[][9], int lin, int col)
{ 
    int i, j, linSub, colSub;

    for (i=0; i<lin; i++)
        if(m[i][col]== m[lin][col]) return 0;
    for (j=0; j<col; j++)
        if(m[lin][j]== m[lin][col]) return 0;
    linSub= lin-lin%3;
    colSub= col-col%3;
    for (i= linSub; i< linSub+3; i++)
        for(j= colSub; j< colSub+3; j++)
           if(m[i][j]== m[lin][col] && (i!=lin && j!=col)) return 0;
    return 1;
}


void embaralha(int v[], int tam)
{ 
     int i,j,k,aux;
     for (k=0; k<100; k++){
         i= rand()%tam;
         j= rand()%tam;
         aux= v[i], v[i]= v[j]; v[j]= aux;
     }
}


