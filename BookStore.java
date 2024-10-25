package bookstore;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Scanner;

public class JdbcMain {
    public static void main(String[] args) throws SQLException {
        Connection con = JDBCutility.getConnection();
        Scanner sc = new Scanner(System.in);
        int n;

        do {
            n = menu();
            switch (n) {
                case 1:
                    System.out.println("Adding book to database");
                    System.out.print("Enter the book id: ");
                    int id = sc.nextInt();
                    sc.nextLine(); 
                    System.out.print("Enter the book name: ");
                    String bookname = sc.nextLine();
                    System.out.print("Enter the author name: ");
                    String author = sc.nextLine();
                    System.out.print("Enter the price: ");
                    double price = sc.nextDouble();
                    addbook.insertvalues(con, id, bookname, author, price);
                    System.out.println("Done");
                    break;
                case 2:
                    System.out.println("Enter the id to delete the book: ");
                    int book_id = sc.nextInt();
                    DeleteBook.deleteBook(con, book_id);
                    System.out.println("Book deleted");
                    break;
                case 3:
                    System.out.println("Update the book");
                    System.out.println("Enter the id to update the book: ");
                    int book_id1 = sc.nextInt();
                    System.out.println("Enter the the new price for  book: ");
                    
                    double newprice = sc.nextDouble();
                    UpdateBook.updateBook(con, newprice, book_id1);
                    break;
                case 4:
                    System.out.println("Reading the book...");
                    ReadBook.readBook(con);
                    break;
                case 5:
                    System.out.println("Exiting...");
                    break;
                    
                default:
                    System.out.println("Invalid operation.");
                    break;
            }
        } while (n != 5);

        sc.close();
    }

    public static int menu() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the operations");
        System.out.println("1) Add book");
        System.out.println("2) Delete book");
        System.out.println("3) Update book");
        System.out.println("4) Display book");
        System.out.println("5) Exit");
        System.out.println("Enter number to perform the operation: ");
        return sc.nextInt();
    }
}
