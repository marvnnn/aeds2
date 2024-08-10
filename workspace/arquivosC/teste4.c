#include <stdio.h>

void teste(int n) {
    for(int i = 0; i < n; i++){
        for(int j = 0; j < n; j++) {
            for(int x = 0; x < n; x++){
                printf("a\n");
                printf("b\n");
            }
        }
    }
    for(int i = 0; i < 5; i++) {
        printf("c\n");
    }
}

int main() {
    teste(2);
    return 0;
}