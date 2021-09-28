class largest{

public static void main(String args[]){

int s[]={10,20,40,80,160,30};
 int large=0;

for (int i=0;i<s.length;i++){
if (s[i]>large){
large=s[i];
}
}
System.out.println("largest is :"+large);
}
}