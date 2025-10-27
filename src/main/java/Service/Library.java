package Service;

import Entity.Book;
import Entity.Member;
import Repo.BookRepository;
import Repo.MemberRepository;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books = new ArrayList<>();
    private List<Member> members = new ArrayList<>();
    private List<Book> issuedBooks = new ArrayList<>();

    BookRepository bookRepository = new BookRepository();
    MemberRepository memberRepository  = new MemberRepository();
    public void addBook(Book book){
        if ( book.getId() !=0 && book.getName() != null){
            this.books.add(book);
            bookRepository.addBook(book);
            System.out.println("Book added successfully! -> "+book.getName());
        }else {
            System.out.println("Please enter all details");
        }

    }

    public void registeredMember(Member member){
        if ( member.getId() !=0 && member.getName() != null){
            this.members.add(member);
            memberRepository.addMember(member);
            System.out.println("Member added successfully! -> "+member.getName());
        }else {
            System.out.println("Please enter all details!");
        }
    }

    public void issueBook(Book book, Member member){
        if ( book.getId() !=0 && member.getId() != 0) {
            if (bookRepository.findBook(book.getId())){
                if (book.bookAvailable==true){
                    book.bookAvailable=false;
                    book.setIssuedTo(member);
                    System.out.println(bookRepository.getBookNameById(book.getId())+" is Issued to: "+memberRepository.getMemberNameById(member.getId()));
                }else {
                    System.out.println("Book is not available!");
                }
            }else {
                System.out.println("Book not found");
            }


        }else {
            System.out.println("Please enter correct details!");
        }


    }
    public void returnBook(Book book){
        if ( book.getId() !=0) {
            if (bookRepository.findBook(book.getId())){
                if (book.bookAvailable==false){
                    book.bookAvailable=true;
                    System.out.println("Book returned successfully!");
                }else {
                    System.out.println("Book is not issued to anyone!");
                }
            }else {
                System.out.println("Book not found");
            }


        }else {
            System.out.println("Please enter correct details!");
        }


    }

    public void removeBook(Book book){
        if (bookRepository.findBook(book.getId())){
            books.remove(book);
            bookRepository.Remove(book);
            System.out.println("Book removed successfully! -> "+book.getName());
        }else {
            System.out.println("Book not found");
        }
    }
    public void getIssuedBook(){
        for (Book b : books){
            if (b.bookAvailable==false){
                issuedBooks.add(b);
            }
        }
        if (issuedBooks.size() ==0){
            System.out.println("No books found!");
        }
        System.out.println("=".repeat(30)+"ISSUED BOOKS"+ "=".repeat(30));
        for (Book ib : issuedBooks){
            System.out.println("ID: " + ib.getId() + " NAME: " + ib.getName() + " ISSUED TO: "+ib.getIssuedTo().getName());
        }
    }
    public void showBook(){
        bookRepository.FindAll();
    }    public void showMember(){
        memberRepository.FindAll();
    }

    public int bookCount(){
        return bookRepository.bookCount();
    }    public int memberCount(){
        return memberRepository.memberCount();
    }

    public Book getBookById(int id){
      return   bookRepository.getBookById(id);
    }
    public Member getMemberById(int id){
      return   memberRepository.getMemberById(id);
    }

}
