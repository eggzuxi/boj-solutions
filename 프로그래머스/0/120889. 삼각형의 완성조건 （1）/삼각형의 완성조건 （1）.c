#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>
#define Max(a, b) ((a) > (b) ? (a) : (b))

// sides_len은 배열 sides의 길이입니다.
int solution(int sides[], size_t sides_len) {
    int answer = 0;
    int max = 0, sum = 0;
    
    max = Max(sides[0], Max(sides[1], sides[2]));
    
    for (int i = 0; i < sides_len; i++) {
        sum += sides[i];
    }
    
    sum -= max;
    
    if (max < sum) {
        answer = 1;
    } else {
        answer = 2;
    }
    
    return answer;
}