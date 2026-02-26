import java.util.Scanner;
public class Symmetric{
int r,c;
int[][] arr;
public void get(){
Scanner sc=new Scanner(System.in);
System.out.println("enter the number of rows");
r=sc.nextInt();
System.out.println("enter the number of column");
c=sc.nextInt();
arr=new int[r][c];
System.out.println("enter the matrix");
for(int i=0;i<r;i++){
for(int j=0;j<c;j++){
arr[i][j]=sc.nextInt();
}
}
}
public void isSym(){
if(r!=c){
System.out.println("this is not symmetric");
return;
}
int flag=0;
for(int i=0;i<r;i++){
for(int j=i+1;j<c;j++){
if(arr[i][j]!=arr[j][i]){
flag=1;
break;
}
}
if(flag==1) break;
}
if(flag==0)
System.out.println("this is symmetric");
else
System.out.println("this is not symmetric");
}
public static void main(String args[]){
Symmetric matrix=new Symmetric();
matrix.get();
matrix.isSym();
}
}

