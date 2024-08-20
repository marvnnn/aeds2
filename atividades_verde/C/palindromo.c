#include <stdio.h>
#include <stdbool.h>

int stringCont(char str[]) { // Função para contar o número de caracteres da string
    int cont = 0;
    for(int i = 0; str[i] != '\0'; i++) {
        cont++;
    }
    return cont;
}

bool simOuNao(char palavra[]) { // Função para determinar se a palavra é palindromo ou não
    bool resposta = true;
    int y = stringCont(palavra) - 1;
    int tam = stringCont(palavra);
    
    for(int i = 0; i < tam / 2; i++) {
        if(palavra[i] != palavra[y]) {
            resposta = false;
            i = y;
        }
        y--;
    }
    return resposta;
}

bool eIgual(char x[], char y[]) { // Função para verificar se uma string é igual a outra.
    bool resposta = false;
    int tam1 = stringCont(x), tam2 = stringCont(y);
    if(tam2 == tam1) {
        resposta = true;
        for(int i = 0; i < tam1; i++) {
            if(x[i] != y[i]) {
                resposta = false;
                i = tam1;
            }
        }
    }
    return resposta;
}

int main() {
    char palavra[500];
    scanf("%[^\n]", palavra);
    getchar();
    bool resposta;
    while(!eIgual(palavra, "FIM")) {
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