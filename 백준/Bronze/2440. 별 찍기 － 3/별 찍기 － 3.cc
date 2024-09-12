#include <stdio.h>
int main() {

    int num;
    scanf("%d", &num);
    for (int i = num; i > 0; i--) {

        for (int k = i; k > 0; k--) {
            printf("*");
        }
        printf("\n");
    }

}
