import java.util.Scanner;
class Employee{
int id;
String name;
int sal;
String address;
Employee(int id,String name,int sal,String address){
this.id=id;
this.name=name;
this.sal=sal;
this.address=address;
}
public void display(){
System.out.println("employee id:"+this.id);
System.out.println("employee name:"+this.name);
System.out.println("employee salary:"+this.sal);
System.out.println("employee address:"+this.address);
}
}
class teacher extends Employee{
String dept;
String sub;
teacher(int id,String name,int sal,String address,String dept,String sub){
super(id,name,sal,address);
this.dept=dept;
this.sub=sub;
}
public void display(){
super.display();
System.out.println("department:"+this.dept);
System.out.println("subject:"+this.sub);
}
} 
public class co3_2{
public static void main (String[]args){
Scanner sc=new Scanner(System.in);
System.out.print("enter number of teachers:");
int n=sc.nextInt();
teacher[]t=new teacher[n];
for(int i=0;i<n;i++){
System.out.println("enter details for teacher"+(i+1)+":");
System.out.print("ID:");
int id=sc.nextInt();
sc.nextLine();
System.out.print("name:");
String name=sc.nextLine();
System.out.print("salary:");
int sal=sc.nextInt();
sc.nextLine();
System.out.print("address:");
String address=sc.nextLine();
System.out.print("department:");
String dept=sc.nextLine();
System.out.print("subject:");
String sub=sc.nextLine();
t[i]=new teacher(id,name,sal,address,dept,sub);
}
System.out.println("\nteacher details:\n");
for(int i=0;i<n;i++){
t[i].display();
}
}
}
