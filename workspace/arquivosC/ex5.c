#include <stdbool.h>
#include <stdlib.h>
#include <stdio.h>

/*
    código isVogal
*/

bool doidao (char c) {
    bool resp = false;
    int v = (int) c;
    if (v == 65 || v == 69 || v == 73 || v == 79 || v == 85 || v == 97 || v == 101 || v ==105 ||v == 111 || v == 117) {
        resp = true; // retorna true caso o caractere seja uma vogal
    }
    return resp;
}

char toUpper(char c) {
    return(c >= 'a' && c <= 'z') ? ((char)(c - 32)) : c; // c esta entre a e z? se sim, retorna a letra maiúscula, se não, só retorna a letra.
}

bool isVogal(char c) {
    c = toUpper(c); // chamada da função para colocar a letra em maiúscula obrigatoriamente
    return(c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U'); // retorna true caso seja vogal
}

bool isLetra(char c) {
    return(c >= 'A' && c <= 'Z' || c >= 'a' && c <= 'z'); // retorna true caso seja letra
}

bool isConsoante(char c){
    return(isLetra(c) == true && isVogal(c) == false); // retorna true caso seja uma letra e não seja uma vogal
}
