public class Dog {
    private String name;
    private int age;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }
    // конструктор, если хочет проверить цену с помощью setter
    public Dog( String name) {
        this.name = name;
    }


    public void setName(String name) {
        if (this.name.equals("")) {
            System.out.println("Имя есть у каждой собаки");
        }
        this.name = name;
    }

    public void setAge(int age) {
        if (this.age < 0) {
            System.out.println("Собаки не может быть столько лет");
        }
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String toString(){
        return "Имя: " + getName() + "\nВозраст: " + getAge();
    }

    public void intoHumanAge(){
        System.out.println(this.name + "\nВозраст в человеческих годах: " + this.age * 7 );
    }
}