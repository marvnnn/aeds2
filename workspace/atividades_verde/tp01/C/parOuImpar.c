#include <stdio.h>

void parOuImpar(int x) {
    if(x % 2 == 0) {
        printf("P\n");
    }
    else {
        printf("I\n");
    }
}

int main() {
    int num;
    do
    {   
        scanf("%d", &num);
        if(num != 0) {
            parOuImpar(num);
        }
    } while (num != 0);
    
    return 0;
}