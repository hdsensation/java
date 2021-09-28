import java.util.scanner;
class largenumber{

public static void main(String args[]){

Scanner n=new Scanner(System.in);

int a,b,c;

System.out.println("Enter Values");
System.out.println("Enter Value of A");
a=n.nextInt();
ystem.out.println("Enter Value of B");
b=n.nextInt();
ystem.out.println("Enter Value of C");
c=n.nextInt();

if (a>c && b<a){
System.out.println("A is largest");
}

else if(b>a && c<b){
System.out.println("B is largest");
}

else{
System.out.println("C is largest");
}

}
}