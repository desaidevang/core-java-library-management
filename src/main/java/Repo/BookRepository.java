package Repo;

import Entity.Book;

import java.util.ArrayList;

public class BookRepository {
    private ArrayList<Book> books = new ArrayList<>();
    public void addBook(Book book) {
        books.add(book);
    }


    public void FindAll(){
        System.out.println("=".repeat(30)+ "BOOK LIST "+ "=".repeat(30));
      for (Book b : books){
          System.out.println("ID: " + b.getId() + " NAME: "+b.getName());
      }
    }
    public void Remove(Book bookRemove){
        books.remove(bookRemove);
    }
    public int bookCount(){
       return books.size();
    }
    public String getBookNameById(int id) {
        for (Book b : books) {
            if (b.getId() == id) {
                return b.getName();
            }
        }
        return null; // not found
    }

    public boolean findBook(int id){
        for (Book b: books){

            if (b.getId() == id){

                return true;

            }

        }
return  false;
    }

    public Book getBookById(int id){
        for (Book b: books){
            if (id == b.getId()){
                return b;
            }
        }
        return  null;
    }
}
