#include <stdio.h>
#include <stdlib.h>

#define max 10

int main(int i, int k, int end_lin, int end_col) 
{
	int matriz[max][max];
	int lin, col;
	
	printf("Insira o numero de linhas:");
	scanf("%d", &lin);
	printf("Insira o numero de colunas: ");
	scanf("%d", &col);
	
	printf("Insira os elementos da matriz: ");
	for(i = 0; i < lin; i++)
	{
		for(k = 0; k < col; k++)
		{
			printf("Informe o elemento [%d][%d]: ", i + 1, k + 1);
			scanf("%d", &matriz[i][k]);
		}
	}
	
	int maior = 0;
	for(i = 0; i < lin; i++)
	{
		for(k = 0; k < col; k++)
		{
			if(matriz[i][k] > maior)
			{
				maior = matriz[i][k];
				end_lin = i;
				end_col = k;
			}
		
		}
	}
	
	int menor = 25000;
	for(k=0;k<col;k++)
	if(matriz[end_lin][k] < menor)
	{
		menor = matriz[end_lin][k];
		end_col = k;
	}
	
	for(i = 0; i < lin; i++)
	{
		for(k = 0; k < col; k++)
		{
			printf("%d", matriz[i][k]);
			printf("\n");
		}
	}
	
	printf("A posicao e valor dominimax e: \n");
	printf("coluna - %d\n", end_col + 1);
	printf("linha - %d\n", end_lin + 1);
	printf("valor - %d\n", matriz[end_lin][end_col]);
	
	return 0;
	
	
