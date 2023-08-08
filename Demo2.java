public class Demo2 {
    public static void main(String[] args) {
        /*
            Single Loop, Nested Loops
            Via +

            + + + + + + +
            + + +   + + +
            + +       + +
            +           +

          */


          int rows=5;
          int x=1;
          while(x<rows)
          {

            int z=1;
            while(z<=7)
            {
                if(x==2 && z==4)
                {
                    int a=0;
                    while(a<1)
                    {

                        System.out.print("  ");
                        a++;
                        
                    }
                    z++;
                }
                
                 if(x==3 && z==3)
                {
                    int a=0;
                    while(a<3)
                    {

                        System.out.print("  ");
                        a++;
                        
                    }
                    z=6;
                }
                  if(x==4 && z==2)
                {
                    int a=0;
                    while(a<5)
                    {

                        System.out.print("  ");
                        a++;
                        
                    }
                    z=7;
                }
                System.out.print("+ ");
                z++;

            }
            System.out.println();
            x++;
            
          }


          
       
            
        }
        

          

    }

