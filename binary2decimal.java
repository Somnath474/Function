public class binary2decimal {
    public static void bin(int bn) {
      int pow=0;
      int dec=0;
      while(bn>0) {
       int lastdigit=bn%10;
       dec=dec+lastdigit*(int)Math.pow(2,pow);
       pow++;
       bn=bn/10;
      } 
     System.out.println(dec);
    }
    public static void main(String[] args) {
        bin(1000);
    }
}
