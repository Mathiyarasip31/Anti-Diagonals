import java.util.Scanner;

public class AntiDiagonals {

    static void Diagonal(int array[][],int n,int m)
    {
        for (int i=0;i<m;i++)
        {
            int x=0,y=i;
            while (x<m && y>=0)
            {
                System.out.print(array[x][y]+" ");
                x++;
                y--;
            }
            System.out.println();
        }
        for (int i=0;i<n;i++)
        {
            int x=i,y=m-1;
            while (x<n && y>=0)
            {
                System.out.print(array[x][y]+" ");
                x++;
                y--;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter number of rows");
        int n=scanner.nextInt();
        System.out.println("Enter number of columns");
        int m=scanner.nextInt();
        System.out.println("Enter elements");
        int array[][]=new int[n][m];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                array[i][j]=scanner.nextInt();
            }
        }
        Diagonal(array,n,m);
    }

}
