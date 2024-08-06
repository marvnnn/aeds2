#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

void mostrarMaioreMenor(int *x, int n) {
    int maior = x[0];
    int menor = x[0];
    for(int i = 0; i < n; i++) {
        if(x[i] > maior) {
            maior = x[i];
        }
        if(x[i] < menor) {
            menor = x[i];
        }
    }
    printf("Maior valor: %d\n", maior);
    printf("Menor valor: %d\n", menor);
}

int main() {
    int *array = NULL;
    int n;
    scanf("%d", &n);
    array = malloc(n * sizeof(int));

    for(int i = 0; i < n; i++) {
        scanf("%d", &array[i]);
    }
    mostrarMaioreMenor(array, n);

    return 0;
}