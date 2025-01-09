public class Practice21 {
    public static void printSquare(int side){
        //文字”＋”を並べて一辺の長さｎの正方形を表示

        for(int i = 1; i  <= side; i++){
            for(int j = 1; j <= side; j++){
                System.out.print("+");
            }

            System.out.println();
        }
    }

    public static void printSquare(int hight, int width){
        for(int i = 1; i <= hight; i++){
            for(int j = 1; j <= width; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args){
        System.out.println("正方形を表示します");
        System.out.print("一辺は:");
        int s = new java.util.Scanner(System.in).nextInt();
        printSquare(s);

        System.out.println("長方形を表示します。");
        System.out.print("高さは:");
        int h = new java.util.Scanner(System.in).nextInt();
        System.out.print("横幅は:");
        int w = new java.util.Scanner(System.in).nextInt();
        printSquare(h,w);
    }


}
