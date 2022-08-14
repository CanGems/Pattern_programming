class p1{
     public static void main(String[] args) {
        p1 p= new p1();
        p.show();
        p.s1();

     }

    public p1(){
        for (int i=1; i<=4;i++)
        {
            for (int j=3;j>=i;j--)
            {
                System.out.print(" ");
            }
            for (int k=1; k<=i; k++)
            {
                System.out.print(" *");
            }
            System.out.println();
        }
        System.out.println("-------------------------");
    }

       public void show(){
              
              for(int l=1; l<=4;l++)
              {
                
                for (int m=4;m>=l;m--)
                {
                    if(m>l)
                      System.out.print(" ");
                    else
                      System.out.print(" *");
                }
                System.out.println();
              }
              System.out.println("---------------------");
       }

       void s1(){
         for (int n=1; n<=4; n++)
         {
            for (int b=1; b<=(n*2);b++)
            {
                if(b>1 && b<(n*2)-1)
                   System.out.print(" ");
                else
                   System.out.print("*");
            }
            System.out.println();
         }
       }
              
             

        
    } 
