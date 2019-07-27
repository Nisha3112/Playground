#include<stdio.h>
int main()
{
  int n,temp1,temp2;
  scanf("%d",&n);
  temp1=n%10;
  temp2=n/100;
  printf("%d",temp1+temp2);
  return 0;
}