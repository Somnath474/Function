public class product {
    public static int multiply(int a,int b) {
        int mul=a*b;
        return mul;
    }
    public static void main(String[] args) {
        int a=10;
        int b=5;
       int prod= multiply(a,b);
       System.out.println(prod);
       prod=multiply(44, 88);
       System.out.println(prod);

    }
}
