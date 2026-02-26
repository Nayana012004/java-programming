public class area{
public double area(double r){
return Math.PI*r*r;
}
public double area(double l,double w){
return l*w;
}
public double area(int b,int h){
return 0.5*b*h;
}
public int area(int l){
return l*l;
}
public static void main(String[]args){
area obj=new area();
System.out.println("area of circle r=5:"+obj.area(5.0));
System.out.println("area of rectangle(3,4):"+obj.area(3.0,4.0));
System.out.println("area of triangle(4,3):"+obj.area(4,3));
System.out.println("area of square(8):"+obj.area(8));
}
}
