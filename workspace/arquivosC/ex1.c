#include <stdio.h>
#include <stdlib.h>
#include <stdbool.h>

bool contemNoArray(int x, int *y, int n) {
    for(int i = 0; i < n; i++) {
        if(y[i] == x) {
            return true;
            break;
        }
    }
    return false;
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