class Cpu {
int price;
public Cpu(int p){
this.price=p;
}
void display(){
System.out.println("Price of CPU: "+this.price);
}
class Processor{
int cores;
String manufacture;
Processor(int core,String manf){
this.cores=core;
this.manufacture=manf;
}
void display(){
System.out.println("No of cores: "+this.cores);
System.out.println("Processor manufacture: "+this.manufacture);
}
}
static class Ram{
int memory;
String manufacture;
Ram(int n,String m){
this.memory=n;
this.manufacture=m;
}
void display(){
System.out.println("Memory size: "+this.memory);
System.out.println("Memory manufacture: "+this.manufacture);
}
}
public static void main(String[] args){
Cpu intel=new Cpu(23000);
Cpu.Processor p=intel.new Processor(8,"Intel");
Cpu.Ram r=new Cpu.Ram(16,"Corsair");
intel.display();
p.display();
r.display();
}
}

