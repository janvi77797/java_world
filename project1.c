#include <stdio.h>
int main(int argc, char const *argv[])
{
    // basic Calculator
    int num1, num2, result;
    char op;
    printf("enter two numbers:");
    scanf("%d %d", &num1, &num2);
    printf("enter operator:");
    scanf(" %c", &op);
    switch (op)
    {
    case '+':
        result = num1 + num2;
        break;
    case '-':
        result = num1 - num2;
        break;
    case '*':
        result = num1 * num2;
        break;
    case '/':
        result = num1 / num2;
        break;
    case '%':
        result = num1 % num2;
        break;

    default:
        printf("invalid operation");

        break;
    }
    printf("the result is:%d",result);
    return 0;
}
