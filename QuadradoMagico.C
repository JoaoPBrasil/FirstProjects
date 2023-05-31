#include <stdio.h>

int main(void) {
	int n, i, j;
	
	printf("Insira os valores da matriz: ");
	scanf("%i", &n);
	
	int mat[n][n];
	
	for (i = 0; i < n; i++) {
		for (j = 0; j < n; j++) 
		{
			printf("Informe os valores da matriz: ");
			scanf("%i", &mat[i][j]);
		}
	}
	
	for (i = 0; i < n; i++) {
		for (j = 0; j < n; j++) {
			printf("%i ", mat[i][j]);
		}
		printf("\n");
	}

	int somaDP = 0, somaDS = 0;
	
	int vetL[n];
	for (i = 0; i < n; i++) {
		vetL[i] = 0;
		for (j = 0; j < n; j++) {
			vetL[i] += mat[i][j];
		}
	}

	int vetC[n];
	for (j = 0; j < n; j++) {
		vetC[j] = 0;
		for (i = 0; i < n; i++) {
			vetC[j] += mat[i][j];
		}
	}

	int testaL = 1, testaC = 1;
	for (i = 1; i <  n; i++) {
		if (vetL[i] != vetL[i-1]) {
			testaL = 0;
			break;
		} else if (vetC[i] != vetC[i-1]) {
			testaC = 0;
			break;
		}
	}
	
	if (testaL && testaC && somaDP == somaDS && somaDP == vetL[0]) {
		printf("\ne um Quadrado magico!");
	} else {
		printf("\nnao e um Quadrado magico!");
	}

	return 0;
}

