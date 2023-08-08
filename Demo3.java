public class Demo3 {
    public static void main(String[] args) {
        
         /*
            Nested Loops
            Via + (Space)


            + + + + + + +
            + + +   + + +
            + +       + +
            +           +
            + +       + +
            + + +   + + +
            + + + + + + +
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

          /* Second Part*/


          int k=5;
          int l=1;
          while(l<k)
          {

            int m=1;
            while(m<=7)
            {
                if(l==1 && m==2)
                {
                    int a=0;
                    while(a<5)
                    {

                        System.out.print("  ");
                        a++;
                        
                    }
                    m=7;
                }
                
                 if(l==2 && m==3)
                {
                    int a=0;
                    while(a<3)
                    {

                        System.out.print("  ");
                        a++;
                        
                    }
                    m=6;
                }
                  if(l==3 && m==4)
                {
                    int a=0;
                    while(a<1)
                    {

                        System.out.print("  ");
                        a++;
                        
                    }
                    m=5;
                }
                System.out.print("+ ");
                m++;

            }
            System.out.println();
            l++;
            
          }

         


    }
}
