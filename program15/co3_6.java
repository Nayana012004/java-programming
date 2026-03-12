import java.util.Scanner;
interface shape{
double area();
double perimeter();
}
class circle implements shape{
double radius;
circle(double radius){
this.radius=radius;
}
public double area(){
return Math.PI*radius*radius;
}
public double perimeter(){
return 2*Math.PI*radius;
}
}
class rectangle implements shape{
double length;
double width;
rectangle(double length,double width){
this.length=length;
this.width=width;
}
public double area(){
return length*width;
}
public double perimeter(){
return 2*(length+width);
}
}
public class co3_6{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
int choice;
while(true){
System.out.println("\n menu");
System.out.println("1.calculate area and perimeter of the circle");
System.out.println("2.calculate area and perimeter of rectangle");
System.out.println("3.exit");
System.out.println("enter your choice:");
choice=sc.nextInt();
switch(choice){
case 1:
System.out.print("enter the radius:");
double radius=sc.nextDouble();
circle circle=new circle(radius);
System.out.println("area of circle:"+circle.area());
System.out.println("perimeter of circle:"+circle.perimeter());
break;
case 2:
System.out.print("enter length of the rectangle:");
double length=sc.nextDouble();
System.out.print("enter width of the rectangle:");
double width=sc.nextDouble();
rectangle rectangle=new rectangle(length,width);
System.out.println("area of a rectangle:"+rectangle.area());
System.out.println("perimeter of rectangle:"+rectangle.perimeter());
break;
case 3:
System.out.println("exiting program");
return;
default:
System.out.println("invalid choice please try again");
}
}
}
}
