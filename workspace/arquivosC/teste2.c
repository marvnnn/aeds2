#include <stdio.h>

void teste(int n) {
    for(int i = 0; i < n; i++) {
        printf("a\n");
        printf("b\n");
        printf("c\n");
        printf("d\n");
        printf("e\n");
    }
    for(int i = 0; i < n; i++) {
        for(int j = 0; j < n; j++) {
            for(int x = 0; x < n; x++) {
                printf("f\n");
                printf("g\n");
                printf("h\n");
                printf("i\n");
            }
        }
    }
}

int main() {

    teste(1);
    return 0;
}