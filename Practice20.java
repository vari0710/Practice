public class Practice20{
    public static void main(String[] args){
        System.out.println("1つ目の長方形の表示");

        //printRectangelの呼び出し
        printRectangle();
        
        System.out.println("2つ目の長方形の表示");

        //prinRectangelの呼び出し
        printRectangle();
    }

    public static void printRectangle(){
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 4; j++){
                System.out.print("*");
            }

            System.out.println();
        }

        System.out.println();
    }
}