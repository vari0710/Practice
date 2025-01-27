public class Practice23 {
    public static void main(String[] args) {
        System.out.print("整数１：");
        int n1 = new java.util.Scanner(System.in).nextInt();
        System.out.print("整数2：");
        int n2 = new java.util.Scanner(System.in).nextInt();
        System.out.print("整数3：");
        int n3 = new java.util.Scanner(System.in).nextInt();
        System.out.print("最大値は" + checkMax(n1, n2, n3) + "です");
    }

    public static int checkMax(int n1, int n2, int n3){
        if(n1 > n2){
            if(n1 > n3){
                return n1;
            }else{
                return n3;
            }

        }else if(n2 > n3){
            return n2;
        }else{
            return n3;
        }
    }
}
