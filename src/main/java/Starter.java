import Entity.Book;
import Service.Library;
import Entity.Member;

import java.util.Scanner;

public class Starter {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Library library = new Library();
        Book book1 = new Book(1, "To Kill a Mockingbird");
        Book book2 = new Book(2, "Pride and Prejudice");
        Book book3 = new Book(3, "The Great Gatsby");
        Book book4 = new Book(4, "1984");
        Book book5 = new Book(5, "The Catcher in the Rye");
        Book book6 = new Book(6, "The Lord of the Rings");
        Book book7 = new Book(7, "The Chronicles of Narnia");
        Book book8 = new Book(8, "Harry Potter and the Sorcerer’s Stone");
        Book book9 = new Book(9, "The Hobbit");
        Book book10 = new Book(10, "Moby-Dick");

        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.addBook(book4);
        library.addBook(book5);
        library.addBook(book6);
        library.addBook(book7);
        library.addBook(book8);
        library.addBook(book9);
        library.addBook(book10);

        int choice;
        do {
            System.out.println("\n===== Library Menu =====");
            System.out.println("1. Add Book");
            System.out.println("2. Register Member");
            System.out.println("3. Issue Book");
            System.out.println("4. Return Book");
            System.out.println("5. Show Books");
            System.out.println("6. Show Members");
            System.out.println("7. Delete Book");
            System.out.println("8. Issued Book");
            System.out.println("0. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice){
                case 1:
                    System.out.println("Enter Book name: ");
                    String name = sc.nextLine();
                    Book bookOne = new Book(library.bookCount()+1, name);
                    library.addBook(bookOne);
                    break;
                case 2:
                    System.out.println("Enter Member name: ");
                    String memberName = sc.nextLine();
                    Member memberTwo= new Member(library.memberCount()+1, memberName);
                    library.registeredMember(memberTwo);
                    break;
                case 3:
                    System.out.println("Issue book:\n");
                    library.showBook();
                    System.out.println("Select Book ID");
                    int bookid = sc.nextInt();

                    library.showMember();
                    System.out.println("Select Member ID");
                    int memberid = sc.nextInt();

                    Member memberThree= library.getMemberById(memberid);
                    Book bookThree= library.getBookById(bookid);
                    library.issueBook(bookThree,memberThree);
                    break;
                case 4:
                    System.out.println("Please select book id to return book: ");
                    library.showBook();
                    int returnBookId = sc.nextInt();
                    Book bookFour = library.getBookById(returnBookId);
                    library.returnBook(bookFour);
                    break;
                case 5:
                    library.showBook();
                    break;
                case 6:
                    library.showMember();
                    break;
                case 7:

                        library.showBook();
                    System.out.println("Please select Book Id to delete: ");
                      int idSeven=  sc.nextInt();
                        Book bookSeven = library.getBookById(idSeven);
                        library.removeBook(bookSeven);
                        break;
                case 8:
                    library.getIssuedBook();
                    break;

                default:
                    System.out.println("Please enter correct number!");
                    break;
                case 0:
                    System.out.println("Exiting program...");
            }

        } while (choice!=0);
    }
}
