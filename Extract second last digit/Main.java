#include<stdio.h>
int main()
{
  int n,t1,t2;
  scanf("%d",&n);
  t1=n%100;
  t2=t1/10;
  printf("%d",t2);
  return 0;
}