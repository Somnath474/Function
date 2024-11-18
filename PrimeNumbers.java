import java.util.*;

public class PrimeNumbers {
    // Method to check if a number is prime
    public static boolean isPrime(int n) {
        if (n <= 1) return false; // Numbers <= 1 are not prime
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false; // Found a divisor
        }
        return true; // No divisors found
    }

    // Method to print all prime numbers up to n
    public static void primer(int n) {
        System.out.println("Prime numbers up to " + n + ":");
        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println(); // New line after listing primes
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to print all primes up to: ");
        int n = sc.nextInt();
        primer(n); // Call primer with user input
        sc.close();
    }
}

// import java.util.*;
// public class primen {
//     public static void prime(int n) {
//         boolean isprime=true;
//         for(int i=2;i<=Math.sqrt(n);i++){
//             if(n%i==0){
//                 isprime=false;
//                 break;
//             }

//         }
//         if (isprime){
//         System.out.println(n+" This is prime number");
//         }
//         else{
//         System.out.println(n+" This is not a prime number");
//         }
//     }
//     public static void primer(int n) {
//        for(int i=2;i<=n;i++){
//         if(prime(i)){
//             System.out.println(i+ " ");
//         }
        
//        } 
//     }
//     public static void main(String[] args) {
//         Scanner sc=new Scanner (System.in);
//         int n=sc.nextInt();
//         primer(5);
//         sc.close();

//     }
    
// }
