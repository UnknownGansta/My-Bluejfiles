import java.util.Scanner;
public class Question_10
{
    static void main()
    {
        Scanner sc=new Scanner(System.in);
        int x,y,z,m;
        m=0;
        for(x=1;x<=9;x+=2)
        {
            for(y=x;y<=9;y+=2)
            {
                System.out.print(y);
            }
            for(z=1;z<=m;z+=2)
            {
                System.out.print(z);
            }
            m=x;    
            System.out.println();
        }
    }
}