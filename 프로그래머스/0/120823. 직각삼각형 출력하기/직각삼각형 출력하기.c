#include <stdio.h>

int main(void) {
    int n;
    scanf("%d", &n);
    
    char star = '*';
    
    for (int i = 1; i <= n; i++) {
        
        for (int j = 1; j <= i; j++) {
            
            printf("%c", star);
            
        }
        
        printf("\n");
        
    }
    
    return 0;
}