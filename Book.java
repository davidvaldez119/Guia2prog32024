public class Book {

    private String title;
    private Double price;
    private Integer stock;
    private   author author;
    private   author author1;
    public author getAuthor1() {
        return author1;
    }

    public void setAuthor1(author author1) {
        this.author1 = author1;
    }


    public author getAuthor() {
        return author;
    }

    public void setAuthor(author author) {
        this.author = author;
    }




    public Book(String title, Double price, Integer stock, author author ) {

        this.author=author;
        this.price=price;
        this.stock=stock;
        this.title=title;
    }




    public Integer getStock() {
        return stock;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }



    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", price=" + price +
                ", stock=" + stock +
                ", author=" + author +
                ", author1=" + author1 +
                '}';
    }
}
