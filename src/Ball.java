public class Ball {
    private int cash;
    private String color;

    public Ball(int cash, String color) {
        this.cash = cash;
        this.color = color;
    }
    public Ball(String color) {
        this.color = color;
    }
    public void setCash(int cash) {
        if (this.cash <= 50) {
            System.out.println("Мяч не может так дешево стоить");
        } else {
            this.cash = cash;
        }

    }
    public void setColor(String color) {
        this.color = color;
    }

    public int getCash() {
        return cash;
    }

    public String getColor() {
        return color;
    }

    public String toString() {
        return "Цена мяча: " + this.cash + " \nЦвет мяча: " + this.color;
    }
}