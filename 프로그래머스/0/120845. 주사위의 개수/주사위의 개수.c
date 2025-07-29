#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

// box_len은 배열 box의 길이입니다.
int solution(int box[], size_t box_len, int n) {
    int answer = 0;
    
    int length = box[0], width = box[1], height = box[2];
    
    answer = (length / n) * (width / n) * (height / n);
    
    return answer;
}