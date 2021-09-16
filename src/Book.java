public class Book {
    private int pages;
    private String name;

    public Book(int pages, String name) {
        this.pages = pages;
        this.name = name;
    }

    public Book(String name) {
        this.name = name;
    }


    public void setPages(int pages) {
        if (this.pages <=0) {
            System.out.println("так мало страниц не бывает");
        } else {
            this.pages = pages;
        }

    }
    public void setName(String name) {
        if (this.name == "") {
            System.out.println("Книга без названия не бывает");
        } else {
            this.name = name;
        }

    }
    public int getPages() {
        return pages;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        return "Количество страниц: " + this.pages + " \nНазвание книги: " + this.name;
    }
}