class f1 {
    public f1(){
        int i=1; int j=1;
        for( i= 1; i<=4; i++)
        {
            for( j=1; j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("-------------f1-----------");
    }
    public static void main(String[] args) {
     f1 q = new f1();
     f2 f = new f2();
     f3 s= new f3();
     f4 t = new f4();
     
    }
}

class f2{
    
      public f2(){
        for(int i=1; i<=4;i++)
        {
            for (int j=4; j>=i;j--)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("-----------f2----------");
      }  
        
    }

class f3 {
     
    public f3()
    {
        for (int i=1;i<=4;i++)
        {
            for (int j=1; j<=4;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("-------------f3--------------");
    }
}

class f4{

    public f4(){
         
        for (int i=1; i<=4;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i=1;i<=4; i++)
        {
            for (int j=3;j>=i; j--)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("-----------f4-------------");
    }   
}

