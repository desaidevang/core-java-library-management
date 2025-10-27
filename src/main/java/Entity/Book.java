package Entity;

import java.sql.Time;
import java.time.LocalDate;

public class Book {
    private int id;
    private String name;
    private LocalDate time;
    public boolean bookAvailable = true;
    private Member issuedTo;
    Book(){

    }

    public Member getIssuedTo() {
        return issuedTo;
    }

    public void setIssuedTo(Member issuedTo) {
        this.issuedTo = issuedTo;
    }

    public Book(int id, String name) {
        this.id = id;
        this.name = name;
        this.time = LocalDate.now();
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public LocalDate getTime() {
        return time;
    }





}
