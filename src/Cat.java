public class Cat {
    int age;
    String name;
    String skinColor;

    void eat(String food){
        switch (food) {
            case "fish" -> System.out.println("金喝甲！");
            case "water" -> System.out.println("咕嚕嚕嚕！");
            default -> System.out.println("這是啥？");
        }
    }

    public static void main(String[] args) {
        Cat cat = new Cat();
        System.out.println(cat.name);
        cat.eat("water");
        cat.name = "Wilson";
        System.out.println(cat.name);
    }
}
