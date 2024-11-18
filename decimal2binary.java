public class decimal2binary {
    public static void dec(int dn) {
        int pow=0;
        int binnum=0;
        while(dn>0){
            int rem=dn%2;
            binnum=binnum+(rem*(int)Math.pow(10,pow));
            pow++;
            dn=dn/2;
        }
        System.out.println(binnum);
    }
    public static void main(String[] args) {
       dec(13);
    }
}
