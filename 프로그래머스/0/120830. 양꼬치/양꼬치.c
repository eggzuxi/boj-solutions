#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

int solution(int n, int k) {
    int answer = 0;
    
    if (n < 10) {
        answer = n * 12000 + k * 2000;
    } else {
        int welcomeDrink = n / 10;
        if (k - welcomeDrink > 0) {
            answer = n * 12000 + (k - welcomeDrink) * 2000;
        } else if (k - welcomeDrink == 0) {
            answer = n * 12000;
        }
    }
    
    return answer;
}