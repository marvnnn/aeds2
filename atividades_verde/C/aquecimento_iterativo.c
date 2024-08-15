#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int numMaiusc(char x[]) {
    int contador = 0;
    for(int i = 0; i < strlen(x); i++) {
        if(x[i] >= 'A' && x[i] <= 'Z') {
            contador++;
        }
    }
    return contador;
}

int main() {
    char palavra[500];
    scanf("%[^\n]", palavra);
    getchar();
    while(strcmp(palavra, "FIM")) {
        int resposta = numMaiusc(palavra);
        printf("%d\n", resposta);
        scanf("%[^\n]", palavra);
        getchar();
    }
    return 0;
}