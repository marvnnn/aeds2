#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

void mostrarMaioreMenor(int *x, int n) {
    int temp;
    for(int i = 0; i < n; i++) {
        for(int y = 0; y < n; y++) {
            if(x[i] < x[i+1]) {
                temp = x[i+1];
                x[i+1] = x[i];
                x[i] = temp;
            }
        }
    }
    int maior = x[0];
    int menor = x[n-1];
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