import java.util.Scanner;

class digitcount{

public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int num;

System.out.println("Enter digits :");
num=sc.nextInt();

int count=(num+"").legth();
System.out.println(count);

}
}
