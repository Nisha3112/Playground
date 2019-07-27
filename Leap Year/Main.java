#include<stdio.h>
int main()
{
  //Type your code here
  int yr;
  scanf("%d",&yr);
  if(yr%100==0)
  {
    if(yr%400==0)
      printf("LEAP YEAR");
    else
      printf("NOT LEAP YEAR");
  }
  else if(yr%4==0)
  {
    printf("LEAP YEAR");
  }
  else
  {
    printf("NOT LEAP YEAR");
  }
  return 0;
}