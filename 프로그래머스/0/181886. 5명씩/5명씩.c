#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

// names_len은 배열 names의 길이입니다.
// 파라미터로 주어지는 문자열은 const로 주어집니다. 변경하려면 문자열을 복사해서 사용하세요.
char** solution(const char* names[], size_t names_len) {
    // return 값은 malloc 등 동적 할당을 사용해주세요. 할당 길이는 상황에 맞게 변경해주세요.
    int len = (names_len + 4) / 5;
    char** answer = (char**)malloc(sizeof(char*) * len);
    int idx = 0;
    
    for (int i = 0; i < names_len; i++) {

        if (i % 5 == 0) {
            answer[idx] = (char*)names[i];
            idx++;
        }
        
    }
    
    return answer;
}