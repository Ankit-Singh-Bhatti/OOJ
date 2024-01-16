import java.util.Scanner;
class Book{
    String name,author;
    int price,num_pages;
    Scanner in=new Scanner(System.in);
    Book(String name,String author,int price, int num_pages){
        this.name=name;
        this.author=author;
        this.price=price;
        this.num_pages=num_pages;

    }
    void getd(){
        System.out.println("enter the name of the book:");
        name=in.nextLine();
        System.out.println("enter the name of the author:");
        author=in.nextLine();
        System.out.println("enter the price of the book");
        price=in.nextInt();
        System.out.println("enter the number of pages in the book:");
        num_pages=in.nextInt();
    }
    void display(){
        System.out.println("name of the book:"+ name);
        System.out.println("name of the author:"+ author);
        System.out.println("price of the book:"+ price);
        System.out.println("no. of pages in the book:"+ num_pages);
    }
    public String toString(){
        String name,author,price,num_pages;
        name="book name:"+this.name+"\n";
        author="author name:"+this.author+"\n";
        price="book price:"+this.price+"\n";
        num_pages="number of pages in the book"+this.num_pages+"\n";
        return name+author+price+num_pages;

    }
}
public class lab3{
    public static void main(String args[]){
        int n;
        Book b[];
        Scanner in=new Scanner(System.in);
        System.out.println("enter the total number of books:");
        n=in.nextInt();
        b=new Book[n];
        for(int i=0;i<n;i++){
            System.out.println("\nEnter details for Book " + (i + 1) + ":");
            System.out.println("Name: ");
            String name = in.next();
            System.out.println("Author: ");
            String author = in.next();
            System.out.println("Price: inr");
            int price = in.nextInt();
            System.out.println("Number of Pages: ");
            int num_pages = in.nextInt();
            b[i]=new Book(name,author,price,num_pages);
        }
        System.out.println("\n\n\n");
        for(int i=0;i<n;i++){
            System.out.println("Book details:"+(i+1));
            System.out.println("book name:"+b[i].name);
            System.out.println("author name:"+b[i].author);
            System.out.println("book price:"+b[i].price);
            System.out.println("number of pages in the book:"+b[i].num_pages);
            System.out.println("\n");

    }
}
}