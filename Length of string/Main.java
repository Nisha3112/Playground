#include<stdio.h>
int main()
{
  char str[100];
  int len=0,i;
  scanf("%[^\n]s",str);
  for(i=0;str[i]!='\0';i++)
  {
    len++;
  }
  printf("%d",i);
  return 0;
}