public class Demo5 {
    public static void main(String[] args) {
         /*
            Nested Loops
            Via + / \

            + + + + + 
            + / + \ +
            + + + + +
            + \ + / +
            + + + + +

           */

           int row=5;
           int i=1;

           while(i<=5)
           {
            int x=1;
            while(x<=row)
            {
                if(i==2 && (x==2||x==4))
                {

                    if(x==2) System.out.print("/ ");
                    else System.out.print("\\ ");
                   x++;
                   
                   
                }

                 if(i==4 && (x==2||x==4))
                {

                    if(x==2) System.out.print("\\ ");
                    else System.out.print("/ ");
                   x++;
                   
                   
                }
                System.out.print("+ ");
                x++;
            }
            System.out.println();
            i++;
           }

    }
}
