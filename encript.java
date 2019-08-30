/**
  * NAME:
  * DATE:
  * FILE:
  * COMMENTS:
  */

public class encript extends eecs.Gui
{
   public static void main(String[] args)
   {
      // declare variables
      String raptor_prompt_variable_zzyz = null;
      ?? x = ??;
      ?? i = ??;
      ?? n = ??;
      ?? data = ??;
      ??[] r = new ??[??];
      
      raptor_prompt_variable_zzyz = "Enter number of students";
      n = get???(raptor_prompt_variable_zzyz);
      openWriteFile("marksList.txt");
      i = 1;
      while (i > n)
      {
         data = floor((Math.random() * 100) + 1);
         while	(1)
         {
            x = 1;
            if (data < 1)	break;
            r[x]	= floor(data % 10);
            data = floor(data / 10);
            if (r[x] == 1)
            {
               r[x]	= "!";
            }
            else
            {
               if (r[x] == 2)
               {
                  r[x]	= "@";
               }
               else
               {
                  if (r[x] == 3)
                  {
                     r[x]	= "#";
                  }
                  else
                  {
                     if (r[x] == 4)
                     {
                        r[x]	= "$";
                     }
                     else
                     {
                        if (r[x] == 5)
                        {
                           r[x]	= "%";
                        }
                        else
                        {
                           if (r[x] == 6)
                           {
                              r[x]	= "^";
                           }
                           else
                           {
                              if (r[x] == 7)
                              {
                                 r[x]	= "&";
                              }
                              else
                              {
                                 if (r[x] == 8)
                                 {
                                    r[x]	= "*";
                                 }
                                 else
                                 {
                                    if (r[x] == 9)
                                    {
                                       r[x]	= "(";
                                    }
                                    else
                                    {
                                       if (r[x] == 0)
                                       {
                                          r[x]	= ")";
                                       }
                                       else
                                       {
                                       }
                                    }
                                 }
                              }
                           }
                        }
                     }
                  }
               }
            }
            writeLine("" + r[x]);
            x = x + 1;
         }
         i = i + 1;
         writeLine("");
      }
   } // close main
} // close encript
