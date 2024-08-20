#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <stdbool.h>

int numMaiusc(char palavra[], int i) { // Função para contar o número de letras maiúsculas dado uma string.
    int contador = 0; // Inicializa o contador com 0.
    if(i < strlen(palavra)) { // Caso i seja menor que o tamanho da palavra.
        if(palavra[i] >= 'A' && palavra[i] <= 'Z') // Caso palavra na posição i seja maior ou igual a "A" e menor ou igual a "Z".
            contador++; // Incrementa em um o contador.
        contador = contador + numMaiusc(palavra, i+1); // Chama a função recursivamente, armazenando seu retorno na variável contador.   
    }
    return contador; // Retorna contador.
}

bool eIgual(char x[], char y[]) { // Função para verificar se uma string é igual a outra.
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
    return resposta; // Retorna false ou true.
}

int main() {
    char palavra[500];
    scanf("%[^\n]", palavra); // Scaneia a palavra armazenando-a na variável palavra.
    getchar(); // Limpa o buffer.
    while(!eIgual(palavra, "FIM")) { // Enquanto não for igual.
        int resposta = numMaiusc(palavra, 0); // Armazena o retorno da função na variável resposta, mandando a palavra e 0 como parámetros.
        printf("%d\n", resposta); // Mostra a resposta.
        scanf("%[^\n]", palavra); // Scaneia a próxima palavra.
        getchar(); // Limpa o buffer.
    }
    return 0;
}