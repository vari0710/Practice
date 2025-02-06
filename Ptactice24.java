

public class Ptactice24 {
    static void entryStudent(){
        String n = inputName();
        int a = inputAge();
        
        System.out.println("登録しました");
        System.out.println("氏名：" + n + "、年齢" + a);
    }

    static String inputName(){
        String name;
        System.out.print("氏名：");
        name = new java.util.Scanner(System.in).nextLine();
        return name;
    }
    static int inputAge(){
        int age;
        System.out.print("年齢：");
        age = new java.util.Scanner(System.in).nextInt();
        return age;
    }

    public static void main(String[] args){
        System.out.println("学生情報登録");
        entryStudent();
    }
}
