import java.util.*;
public class swap {
    public static void swapp(int a,int b){
        int temp=a;
        a=b;
        b=temp;
        System.out.println("Value of a"+a);
        System.out.println("Value of b"+b);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of a ");
        int a=sc.nextInt();
        System.out.println("Enter the value of b ");
        int b=sc.nextInt();
        swapp(a,b);
        sc.close();
        System.out.println(a +"  "+b);
    }
}
