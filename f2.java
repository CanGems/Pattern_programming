class f2{

    public static void main(String[] args) {
        f3 f =new f3();
        f4 s= new f4();
        f5 t = new f5();
    }
}
class f3{

    public f3(){
        for(int i=1;i<=4;i++)
        {
            for (int j=3; j>=i;j--)
            {
                System.out.print(" ");
            }
            for (int k=1;k<=i;k++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("--------------f3-------------");
    }
}

class f4{

    public f4(){
        for (int i=1;i<=4;i++)
        {
            for (int j=1;j<=i;j++){
                System.out.print(" ");
            }
            for (int k=4;k>=i;k--)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("---------------f4------------");
    }
        
}
class f5{
    public f5(){
        for (int l=1;l<=4;l++)
        {
            for(int m=3; m>=l;m--)
            {
                System.out.print(" ");
            }
            for(int n=1; n<=l; n++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i=1;i<=4;i++)
        {
            for (int j=1;j<=i;j++){
                System.out.print(" ");
            }
            for (int k=3;k>=i;k--)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("-----------f5-----------");
    }
}