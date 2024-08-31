#include <stdio.h>
#include <stdlib.h>


void gravarArquivo(int n) {
    float valor;
    FILE *arquivo = fopen("arquivo.txt", "w");
    for(int i = 0; i < n; i++) {
        scanf("%f", &valor);
        getchar();
        fprintf(arquivo, "%f\n", valor);
    }
    fclose(arquivo);
}

void lerArquivo(char *fileName) {
    FILE *arquivo = fopen(fileName, "rt");
    fseek(arquivo, 0, SEEK_END);
    int tamanho = ftell(arquivo);
    float valor = 0;  
    for(int i = tamanho - 1; i >= 0; i--) {
        fseek(arquivo, i, SEEK_SET);
        fscanf(arquivo, "%f", &valor);
        printf("%f\n", valor);
    }
    fclose(arquivo);
}

int main() {
    int n;
    scanf("%d", &n);
    getchar();
    gravarArquivo(n);
    lerArquivo("arquivo.txt");

    return 0;
}