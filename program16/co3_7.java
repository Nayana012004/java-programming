import java.util.*;
interface Bill {
void calculate();
}
class Product implements Bill {
int productId;
String name;
int quantity;
float unitPrice;
float total;
void getData() {
Scanner sc=new Scanner(System.in);
System.out.println("enter productId");
productId=sc.nextInt();
sc.nextLine();
System.out.print("enter name");
name=sc.nextLine();
System.out.print("enter quantity");
quantity=sc.nextInt();
System.out.print("enter unitPrice");
unitPrice=sc.nextFloat();
}
public void calculate() {
total=quantity*unitPrice;
}
void display() {
System.out.println(productId+"\t"+name+"\t"+quantity+"\t"+unitPrice+"\t"+total);
}
float getTotal() {
return total;
}
}
public class co3_7 {
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("enter order number:");
int orderNo=sc.nextInt();
System.out.println("enter number of products:");
int n=sc.nextInt();
Product[] product=new Product[n];
float netAmount=0;
System.out.println("\n enter product details:\n");
for(int i=0;i<n;i++) {
product[i]=new Product();
product[i].getData();
product[i].calculate();
netAmount+=product[i].getTotal();
System.out.println();
}
System.out.println("\n order no:"+orderNo);
System.out.println("\n date:"+java.time.LocalDate.now());
System.out.println("-------------------");
System.out.println("product\tname\tquantity\tunitPrice\ttotal");
System.out.println("----------------------");
for(Product p:product) {
p.display();
}
System.out.println("---------------");
System.out.printf("%40s%-10.2f\n","net.Amount",netAmount);
}
}
