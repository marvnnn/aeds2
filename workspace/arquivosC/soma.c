#include <stdio.h>

int soma(int x, int y) {
    int result = 0;
    if(y > 0) {
        result = x + soma(x, y - 1);
    }
    return result;
}

int main() {

    printf("%i\n", soma(5, 13));
    return 0;
}