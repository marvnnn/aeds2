#include <stdio.h>
#include <time.h>

int stringCont(char *str) { // Função para contar o número de caracteres da string
    int cont = 0;
    for(int i = 0; str[i] != '\0'; i++) {
        cont++;
    }
    return cont;
}
char gerarLetra() {
    srand(4);
    return 'a' + abs(rand() % 26);
}
int eIgual(char *x, char *y) { // Função para verificar se uma string é igual a outra.
    int resposta = 0;
    int tam1 = stringCont(x), tam2 = stringCont(y);
    if(tam2 == tam1) {
        resposta = 1;
        for(int i = 0; i < tam1; i++) {
            if(x[i] != y[i]) {
                resposta = 0;
                i = tam1;
            }
        }
    }
    return resposta;
}
char *alteracaoRecursivo(char *x, int i, char pLetra, char sLetra) {
    int tam = stringCont(x);
    if(i < tam) {
        if(x[i] == pLetra) {
            x[i] = sLetra;
        }
        alteracaoRecursivo(x, i+1, pLetra, sLetra);
    }
    return x;
}

int main() {

    char *palavra = malloc(100 * sizeof(char));
    scanf("%[^\n]", palavra);
    getchar();
    while (!eIgual(palavra, "FIM")) {
        char pLetra = gerarLetra();
        char sLetra = gerarLetra();
        palavra = alteracaoRecursivo(palavra, 0, pLetra, sLetra);
        printf("%s\n", palavra);
        scanf("%[^\n]", palavra);
        getchar();
    }
    
    return 0;
}