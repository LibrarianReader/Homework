public class Main {
    public static void main(String[] args) {
        
        Book book = new Book(17, "Реинкарнация Безработного");
        book.setPages(10000);
        String info3 = book.toString();
        System.out.println(info3);

        Dog dog = new Dog("Мясо", 5);
        dog.setAge(dog.getAge());
        String info = dog.toString();
        dog.intoHumanAge();
        System.out.println(info);

        Ball ball = new Ball(5000, "Волейбольный");
        ball.setCash(5000);
        String info2 = ball.toString();
        System.out.println(info2);

    }
}