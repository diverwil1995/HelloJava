public class TestIfElse {
    public static void main(String[] args) {
        int age = (int)(100 * Math.random());

        if(age < 18){
            System.out.println("未成年禁止飲酒唷");
        }else if (age > 68) {
            System.out.println("你也快沒了，喝吧!多喝點!！");
        }else {
            System.out.println("喝酒可以，要有酒品！");
        }
    }
}
