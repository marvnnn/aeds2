#include <stdio.h>

int stringCont(char *str) { // Função para contar o número de caracteres da string
    int cont = 0;
    for(int i = 0; str[i] != '\0'; i++) {
        cont++;
    }
    return cont;
}
char toLowerCase(char c) {
    if(c >= 'A' && c <= 'Z') {
        c = (char)((int)c + 32);
    }
    return c;
}
int justReal(char *str, int i) {

}
int justInt(char *str, int i) {

}
int justConsoante(char *str, int i) {

}
int justVogal(char *str, int i) {
    int tam = stringCont(str);
    int resposta = 0;
    if(i < tam) {
        char c = toLowerCase(str[i]);
        if(!(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == ' ')) {
            resposta = 1 + justVogal(str, tam);
        }
        else {
            resposta = resposta + justVogal(str, i+1);
        }
    }
    return resposta;
}
int stringComp(char *x, char *y) { // Função para verificar se uma string é igual a outra.
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

int main() {
    int x = justVogal("au aa", 0);
    printf("%d\n", x);

    return 0;
}