#include<stdio.h>
int main()   
{  
    float radius, area;  
  int dia;
    scanf("%d", & dia);  
  radius=(float)dia/2;
    area = 3.14* radius * radius;  
    printf("%0.2f", area);  
    return 0;  
}  