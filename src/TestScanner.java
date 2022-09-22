import java.util.Scanner;

public class TestScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("請輸入名字");
        String name = scanner.nextLine();
        System.out.println("請輸入年齡");
        int age = scanner.nextInt();

        System.out.println("#################");
        System.out.println("哇！沒想到" + name + "你已經" + age + "歲了！");
    }
}
