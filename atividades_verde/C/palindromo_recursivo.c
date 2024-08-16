#include <stdio.h>
#include <stdbool.h>
#include <string.h>

int isPalindromo(char palavra[], int i, int y) {
    int resposta = 0;
    if(i < strlen(palavra) / 2) {
        if(palavra[i] != palavra[y]) {
            resposta = 1;
            resposta = resposta + isPalindromo(palavra, y, i);
        }
        resposta = resposta + isPalindromo(palavra, i + 1, y - 1);
    }

    return resposta;
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
        int resposta = isPalindromo(palavra, 0, strlen(palavra) - 1);
        if(resposta >= 1) 
            printf("NAO\n");
        else    
            printf("SIM\n");
        scanf("%[^\n]", palavra);
        getchar();
    }
    return 0;
}