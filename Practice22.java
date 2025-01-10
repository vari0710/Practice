import java.lang.constant.DynamicCallSiteDesc;

public class Practice22 {
    public static double power(double real_num , int num){
        double tmp = 1.0;

        for(int i = 0; i < num; i++){
            tmp *= real_num;
        }
        return tmp;
    }

    public static void main(String[] args){
        System.out.println("aのb乗を求めます");
        System.out.print("実数a:");
        double a = new java.util.Scanner(System.in).nextDouble();
        System.out.print("整数b:");
        int b = new java.util.Scanner(System.in).nextInt();
        double result = power(a, b);
        System.out.println(a + "の" + b + "乗は" + result);
    }
}
