#include <stdio.h>

int main() {

    for(int i = 0; i < (n-1); i++) {
        int menor = i;
        for(int j = (i+1); j < n; j++) {
            if(array[menor] > array[j]) {
                menor = j;
            }
        }
        swap(menor, i);
    }
}