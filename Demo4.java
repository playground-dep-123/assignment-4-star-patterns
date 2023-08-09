public class Demo4 {
    public static void main(String[] args) {
        /* 
            Nested Loops
            Via + / \


            + + + + + +
            + + / \ + +
            + / / \ \ +
            + \ \ / / +
            + + \ / + +
            + + + + + +
          */


          int rows=4;
          int x=1;
          while(x<rows)
          {

            int z=1;
            while(z<=6)
            {
                if(x==2 && z==3)
                {
                    int a=0;
                    while(a<2)
                    {
                        if(a==0)
                        {
                            System.out.print("/ ");
                        }
                        else if(a==1) System.out.print("\\ ");

                        
                        a++;
                        
                    }
                    z=5;
                }
                
                 if(x==3 && z==2)
                {
                    int a=0;
                    while(a<4)
                    {
                        if(a==0||a==1)System.out.print("/ ");
                        else System.out.print("\\ ");

                        
                        a++;
                        
                    }
                    z=6;
                }
              
                System.out.print("+ ");
                z++;

            }
            System.out.println();
            x++;
            
          }

        

          /* Second Part*/


          int k=4;
          int l=1;
          while(l<k)
          {

            int m=1;
            while(m<=6)
            {
                if(l==1 && m==2)
                {
                    int a=0;
                    while(a<4)
                    {
                        if(a==0||a==1) System.out.print("\\ ");
                        else System.out.print("/ ");

                       
                        a++;
                        
                    }
                    m=6;
                }
                
                 if(l==2 && m==3)
                {
                    int a=0;
                    while(a<2)
                    {
                        if(a==0)System.out.print("\\ ");
                        else System.out.print("/ ");
                        
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
