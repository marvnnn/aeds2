#include <stdio.h>

void teste(int n) {
    for(int i = 0; i < n; i++) {
        printf("a\n");
        printf("b\n");
        printf("c\n");
    }
    for(int i = 0; i < n; i++) {
        for(int j = 0; j < n; j++){
            printf("d\n");
            printf("e\n");
        }
    }
}

int main() {

    teste(2);
    return 0;
}