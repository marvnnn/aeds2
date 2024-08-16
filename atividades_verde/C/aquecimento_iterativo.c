#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <stdbool.h>

int numMaiusc(char x[]) {
    int contador = 0;
    for(int i = 0; i < strlen(x); i++) {
        if(x[i] >= 'A' && x[i] <= 'Z') {
            contador++;
        }
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
        int resposta = numMaiusc(palavra);
        printf("%d\n", resposta);
        scanf("%[^\n]", palavra);
        getchar();
    }
    return 0;
}