#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>
#include <string.h>

// 파라미터로 주어지는 문자열은 const로 주어집니다. 변경하려면 문자열을 복사해서 사용하세요.
char* solution(const char* my_string, int num1, int num2) {
    // return 값은 malloc 등 동적 할당을 사용해주세요. 할당 길이는 상황에 맞게 변경해주세요.
    int len = strlen(my_string);
    char* answer = (char*)malloc(len + 1);
    
    int i;
    for (i = 0; i < len; i++) {
        
        char current = my_string[i];
        char first = my_string[num1];
        char second = my_string[num2];
        
        if (i == num1) {
            answer[i] = second;
        } else if (i == num2) {
            answer[i] = first;
        } else {
            answer[i] = current;
        }
        
    }
    
    answer[i] = '\0';
    
    return answer;
}