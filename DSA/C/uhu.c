#include <stdio.h>

int main() {
    char str[] = "university";
    int len = sizeof(str) / sizeof(str[0]);
    for (int i = 0; i < len - 1; i++) {
        for (int j = 0; j <= i; j++) {
            printf("%c", str[j]);
        }
        printf("\n");
    }
    return 0;
}