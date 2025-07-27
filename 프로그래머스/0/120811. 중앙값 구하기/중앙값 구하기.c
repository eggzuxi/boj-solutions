#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

int compare(int* a, int* b) {
    
    return (*a - *b);
    
}

// array_len은 배열 array의 길이입니다.
int solution(int array[], size_t array_len) {
    int answer = 0;
    
    qsort(array, array_len, sizeof(int), compare);
    
    int idx = array_len / 2;
    answer = array[idx];
    
    return answer;
}