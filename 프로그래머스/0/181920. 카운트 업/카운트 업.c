#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

int* solution(int start_num, int end_num) {
    // return 값은 malloc 등 동적 할당을 사용해주세요. 할당 길이는 상황에 맞게 변경해주세요.
    int len = end_num - start_num + 1;
    int idx = 0;
    int* answer = (int*)malloc(sizeof(int) * len);
    
    for (int i = start_num; i <= end_num; i++) {
        
        answer[idx] = i;
        idx++;
        
    }
    
    return answer;
}