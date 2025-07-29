#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>
#include <string.h>
#include <ctype.h>

// 파라미터로 주어지는 문자열은 const로 주어집니다. 변경하려면 문자열을 복사해서 사용하세요.
int solution(const char* my_string) {
    int len = strlen(my_string);
    int answer = 0;
    
    for (int i = 0; i < len; i++) {
        
        char current = my_string[i];
        if (isdigit(current)) answer += current - '0';
        
    }
    
    return answer;
}