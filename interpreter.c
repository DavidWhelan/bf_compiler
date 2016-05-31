#include <stdio.h>
int main(int argc, char** argv)
{
  char input[4096] = {0};
  char tape [30000] = { 0 };
  char* ptr = tape;
  puts("BF Interpreter 1.0");
  puts("Press Ctrl + c to Exit\n");

  while(1)
  {
    fputs("BF> ", stdout);
    fgets(input, 4096, stdin);
    int track = 0;

    for(int i = 0; i<4096; i++)
    {
      //Check for well formed input
      if(input[i] == '[')
      {
        track++;
      }
      else if(input[i] == ']')
      {
        track--;
      }
    }

    //check to see how many missing brackets
    if(track<0)
    {
      fputs("You are missing a [\n", stdout);
      continue;
    }
    else if(track>0)
    {
      fputs("Your are missing a ]\n", stdout);
      continue;
    }

    
  }
  return 0;
}
