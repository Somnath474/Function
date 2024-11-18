public class p3palindrome {
    public static void palindrome(int n) {
        int rev=0;
        int normal=n;
        while(n>0){
            int ld=n%10;
                rev=rev*10+ld;
                n=n/10;
        } 
        if(normal==rev) {
            System.out.println("This is palindrome number");
        }
        else{
            System.out.println("This is not a palindrome number");
        }
    }
    public static void main(String[] args) {
        palindrome(456);
    }

}
