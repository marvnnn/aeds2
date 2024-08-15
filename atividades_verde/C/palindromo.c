#include <stdio.h>
#include <stdlib.h>
#include <stdbool.h>
#include <string.h>

bool simOuNao(char palavra[]) {
    bool resposta = true;
    int y = strlen(palavra) - 1;
    
    for(int i = 0; i < strlen(palavra) / 2; i++) {
        if(palavra[i] != palavra[y]) {
            resposta = false;
            i = y;
        }
        y--;
    }
    return resposta;
}

int main() {
    char palavra[500];
    scanf("%[^\n]", palavra);
    getchar();
    bool resposta;
    while(strcmp(palavra, "FIM")) {
        resposta = simOuNao(palavra);
        if(resposta) {
            printf("SIM\n");
        }
        else {
            printf("NAO\n");
        }
        scanf("%[^\n]", palavra);
        getchar();
    }
    return 0;
}