#include <stdio.h>
#include <stdbool.h>

int stringCont(char str[]) { // Função para contar o número de caracteres da string
    int cont = 0;
    for(int i = 0; str[i] != '\0'; i++) {
        cont++;
    }
    return cont;
}

int isPalindromo(char palavra[], int i, int y) { // Função para verificar se uma palavra é palíndromo.
    int resposta = 0; // Inicializa resposta como 0.
    if(i < stringCont(palavra) / 2) { // Caso i seja menor que metade do tamanho da palavra.
        if(palavra[i] != palavra[y]) { // Se palavra na posição i for diferente de palavra na posição y.
            resposta = 1; // Resposta = 1.
            resposta = resposta + isPalindromo(palavra, y, i); // Chama a função recursivamente, passando como parámetro y e i invertidos, para não continuar.
        } else {
            resposta = resposta + isPalindromo(palavra, i + 1, y - 1); // Chama a função recursivamente
        }
    }
    return resposta;
}

bool eIgual(char x[], char y[]) { // Função para comparar duas strings
    bool resposta = false;
    int tam1 = stringCont(x), tam2 = stringCont(y);
    if(tam1 == tam2) {
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
    while(!eIgual(palavra, "FIM")) {
        int resposta = isPalindromo(palavra, 0, stringCont(palavra) - 1); // Chama a função passando como parametro a palavra, a posição do primeiro apontador e do segundo.
        if(resposta >= 1) 
            printf("NAO\n");
        else    
            printf("SIM\n");
        scanf("%[^\n]", palavra);
        getchar();
    }
    return 0;
}