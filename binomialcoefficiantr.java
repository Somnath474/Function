public class binomialcoefficiantr {
   public static int factorial(int n){
    int fact=1;
    for(int i=1;i<=n;i++){
        fact*=i;
    }
    return fact;
   } 
   public static int binomo (int a,int b){
    int m=factorial(a);
    int n=factorial(b);
   int  c=factorial(a-b);
    return m/(n*c);
   }
   public static void main(String[] args) {
    System.out.println(binomo(5,2));
   }
}
