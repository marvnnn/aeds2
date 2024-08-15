#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int numMaiusc(char palavra[], int i) {
    int contador = 0;
    if(i < strlen(palavra)) {
        if(palavra[i] >= 'A' && palavra[i] <= 'Z')
            contador++;
        return contador + numMaiusc(palavra, i+1);    
    }
    return contador;
}

int main() {
    char palavra[500];
    scanf("%[^\n]", palavra);
    getchar();
    while(strcmp(palavra, "FIM")) {
        int resposta = numMaiusc(palavra, 0);
        printf("%d\n", resposta);
        scanf("%[^\n]", palavra);
        getchar();
    }

    return 0;
}