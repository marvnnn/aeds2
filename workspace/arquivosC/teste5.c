#include <stdio.h>

void teste(int n) {
    for(int i = 0; i < n; i++) {
        for(int j = 0; j < n; j++) {
            for(int k = 0; k < n; k++) {
                for(int l = 0; l < n; l++) {
                    printf("a\n");
                    printf("b\n");
                    printf("c\n");
                    printf("d\n");
                    printf("e\n");
                    printf("f\n");
                    printf("g\n");
                    printf("h\n");
                    printf("i\n");
                }
            }
        }
    }
    for(int i = 0; i < n; i++){
        for(int j = 0; j < n; j++) {
            printf("j\n");
        }
    }
    for(int i = 1; i < n; i = i + 2) {
        printf("k\n");  
    }
        
}

int main() {
    teste(4);
    return 0;
}