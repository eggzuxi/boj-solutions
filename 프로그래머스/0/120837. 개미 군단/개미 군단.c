#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

int solution(int hp) {
    int answer = 0;
    
    if (hp % 5 != 0) {
        answer += hp / 5;
        hp = hp % 5;
        
        if (hp % 3 != 0) {
            
            answer += hp / 3;
            hp = hp % 3;
            answer += hp;
            
        } else {
            answer += hp / 3;
        }
        
    } else {
        answer += hp / 5;
    }
    
    return answer;
}