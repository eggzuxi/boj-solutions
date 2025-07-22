#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

int solution(int n) {
    int answer = 0;
    
    while (n != 0) {
        
        int num = n % 10;
        answer += num;
        n /= 10;
        
    }
    
    return answer;
}