#include <stdio.h>

void teste(int n) {
    for(int i = n - 1; i > 0; i /= 2) {
        printf("a\n");
    }
    for(int i = n - 1; i > 0; i /= 2) {
        printf("b\n");
        printf("c\n");
        printf("d\n");
        printf("e\n");
        printf("f\n");
    }
}

int main() {
    teste(8);
    return 0;
}