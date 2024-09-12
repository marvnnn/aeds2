#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <stdbool.h>

int numMaiusc(char x[]) { // Função para contar o número de letras maiúsculas dado uma string.
    int contador = 0; // Inicializa o contador com 0.
    for(int i = 0; i < strlen(x); i++) { // Percorrer todos os caracteres da string de um em um.
        if(x[i] >= 'A' && x[i] <= 'Z') { // Caso seja maior ou igual a 'A' e menor igual a 'Z', contador recebe uma unidade.
            contador++;
        }
    }
    return contador; // Retorna quantas letras foram computadas.
}
bool eIgual(char x[], char y[]) { // Função para verificar se uma string é igual a outra.
    bool resposta = false; // Inicializa resposta como false.
    if(strlen(x) == strlen(y)) { // Caso o tamanho da string "x" seja igual ao tamanho da string "z".
        resposta = true; // Faz com que a resposta se torne verdadeira.
        for(int i = 0; i < strlen(x); i++) { // Testa letra por letra pra ver se é igual.
            if(x[i] != y[i]) { // Caso encontre alguma letra que não seja igual.
                resposta = false; 
                i = strlen(x); // Parámetro de parada, similar ao break.
            }
        }
    }
    return resposta; // Retorna resposta.
}
int main() {
    char palavra[500]; 
    scanf("%[^\n]", palavra); // Scaneia o input e armazena na variável palavra.
    getchar(); // Limpar o buffer.
    while(!eIgual(palavra, "FIM")) { // Enquanto palavra não for igual a "FIM".
        int resposta = numMaiusc(palavra); // Armazena o retorno da função "numMaiusc" na variável resposta.
        printf("%d\n", resposta); // Printa a resposta na tela.
        scanf("%[^\n]", palavra); // Scaneia a próxima palavra, armazenando-a na variável palavra.
        getchar(); // Limpar o buffer.
    }
    return 0;
}