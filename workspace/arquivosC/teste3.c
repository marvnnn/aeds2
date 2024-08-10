#include <stdio.h>

void teste(int n) {
    for(int i = n - 1; i > 0; i /= 2) {
        printf("a\n");
    }
    printf("b\n");
}

int main() {

    teste(8);
    return 0;
}