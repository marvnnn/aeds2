#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

bool contemNoArray(int x, int *y, int n) {
    int j = n/2;
    for(int i = 0; i < n; i++) {
        if(y[j] == x) {
            return 1;
        }
        else if(y[j] < x) {
            j++;
        }
        else {
            j--;
        }
    }
    return 0;
}

int main() {
    int *array = NULL;
    int n;
    scanf("%d", &n);
    array = malloc(n * sizeof(int));

    for(int i = 0; i < n; i++) {
        scanf("%d", &array[i]);
    }
    int numBusca;
    scanf("%d", &numBusca);

    bool resposta = contemNoArray(numBusca, array, n);

    printf("%d\n", resposta);

    return 0;
}