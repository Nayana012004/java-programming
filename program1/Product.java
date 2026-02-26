class Product{
int pcode; 
String pname;
double price;
Product(int code,String name,double pr){
this.pcode=code;
this.pname=name;
this.price=pr;
}
void display(){
System.out.println("product code:"+pcode);
System.out.println("product name:"+pname);
System.out.println("product price:"+price);
}
public static void main(String[]args){
Product p1=new Product(101,"laptop",45000.0);
Product p2=new Product(102,"smartphone",25000.0);
Product p3=new Product(103,"tablet",30000.0);
Product lowest;
if(p1.price<p2.price&&p1.price<p3.price){
lowest=p1;
}
else if(p2.price<p3.price){
lowest=p2;
}else{
lowest=p3;
}
System.out.println("product with lowest price");
lowest.display();
}}


