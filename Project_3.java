package myProjects;

class Library{
    String [] books;
    int No_of_books;
     Library(){
        this.books=new String[50];
        this.No_of_books=0;
    }
    void addBook(String book){
         this.books[No_of_books]=book;
         No_of_books++;
        System.out.println(book+" has been added!");
    }
    void showAvailableBooks(){
        System.out.println("Available books are:");
         for(String book: this.books){
             if(book==null){
                 continue;
             }
             System.out.println("*"+book);
         }
    }
    void issueBook(String book){
         for(int i=0; i<this.books.length; i++){
             if(this.books[i] != null && this.books[i].equals(book)){
                 System.out.println(book+" has been issued");
                 this.books[i]=null;
                 return;
             }
         }
        System.out.println("book is not available");
    }
    void returnBook(String book){
         addBook(book);
    }
}
public class ForPractise {
    public static void main(String[] args) {
        Library l=new Library();

     l.addBook("dsa");
     l.addBook("c++");
     l.addBook("java");
     l.addBook("sql");
     l.addBook("linux");
     l.showAvailableBooks();
        l.issueBook("sql");
        l.showAvailableBooks();
        l.returnBook("sql");
        l.showAvailableBooks();
        }
    }

output:
dsa has been added!
c++ has been added!
java has been added!
sql has been added!
linux has been added!
Available books are:
*dsa
*c++
*java
*sql
*linux
sql has been issued
Available books are:
*dsa
*c++
*java
*linux
sql has been added!
Available books are:
*dsa
*c++
*java
*linux
*sql

