public class p1average {
    public static float averages(int a,int b,int c) {
       float average=(a+b+c)/3f;
       return average;
    }
    public static void main(String[] args) {
        float res=averages(5,9,6);
        System.out.println(res);
    }
}
