#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>
#include <math.h>

int solution(int n) {
    int answer = 0;
    
    if (sqrt(n) == (int)sqrt(n)) {
        answer = 1;
    } else {
        answer = 2;
    }
    
    return answer;
}