#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <stdbool.h>

int numMaiusc(char palavra[], int i) {
    int contador = 0;
    if(i < strlen(palavra)) {
        if(palavra[i] >= 'A' && palavra[i] <= 'Z')
            contador++;
        contador = contador + numMaiusc(palavra, i+1);    
    }
    return contador;
}

bool eIgual(char x[], char y[]) {
    bool resposta = false;
    if(strlen(x) == strlen(y)) {
        resposta = true;
        for(int i = 0; i < strlen(x); i++) {
            if(x[i] != y[i]) {
                resposta = false;
                i = strlen(x);
            }
        }
    }
    return resposta;
}

int main() {
    char palavra[500];
    scanf("%[^\n]", palavra);
    getchar();
    while(!eIgual(palavra, "FIM")) {
        int resposta = numMaiusc(palavra, 0);
        printf("%d\n", resposta);
        scanf("%[^\n]", palavra);
        getchar();
    }

    return 0;
}