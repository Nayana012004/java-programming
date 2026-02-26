import java.util.Scanner;
class Matrix{
public static void main(String[]args)
{
Scanner sc=new
Scanner(System.in);
int r,c;
System.out.println("enter rows and columns :");
r=sc.nextInt();
c=sc.nextInt();
int[][] a=new int[r][c];
int[][] b=new int[r][c];
int[][] d=new int[r][c];
System.out.println("enter first matrix");
for(int i=0;i<r;i++)
for(int j=0;j<c;j++)
a[i][j]=sc.nextInt();

System.out.println("enter second matrix");
for(int i=0;i<r;i++)
for(int j=0;j<c;j++)
b[i][j]=sc.nextInt();

System.out.println("sum of matrices:");
for(int i=0;i<r;i++){
for(int j=0;j<c;j++){
System.out.print(a[i][j]+b[i][j]+d[i][j]+" ");
}
System.out.println();
}
}
}


