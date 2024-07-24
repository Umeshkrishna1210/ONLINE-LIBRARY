package com.company;

// you have to implement a library using java class library
// Methods : addBook, issueBook, returnBook, showAvailableBooks
// properties : Array to store the available books
// Array to store the issued books

class library{

    public String [] books = new String[500];
    public String [] bookissu = new String[500];
//    String [] books = {"The power of subconscious mind", "Atomic Habits", "GRE verbal reasoning", "GRE quantitative reasoning"};
    public void addBook(String yourbook) {

        for(int i=0; i<books.length; i++){
            if(books[i]==null){
                books[i]=yourbook;
                break;
            }
        }
    }
    public void issueBook(String bookiss) {
        //to eliminate issued book from available books
        for(int i=0; i<books.length; i++){
            if(books[i]==bookiss){
                books[i]=null;
            }
        }

        //to add in bookissu array
        for(int i=0; i< bookissu.length;i++){
            if(bookissu[i]==null){
                bookissu[i]=bookiss;
                break;
            }
        }


    }

    public void issuedBooks(){
        for(String element : bookissu){
            if(element==null){
                continue;
            }
            else{
                System.out.println(element);
            }
        }
    }
    public void returnBook(String ReturnBook){
        //for removing in issued books
        for(int i=0; i< bookissu.length;i++){
            if(bookissu[i]==ReturnBook){
                bookissu[i]=null;
            }
        }

        //for adding in available books in books array
        addBook(ReturnBook);
    }
    public void showAvailableBooks(){
        for(int i=0; i<books.length; i++){
            if(books[i]==null){
                continue;
            }
            else{
                System.out.println(books[i]);
            }
        }

    }
}
public class CWH_ch10_51_Exercise4_OnlineLibrary {
    public static void main(String[] args){
        library l = new library();
        System.out.println("------------Available books :-------------------");
        l.addBook("kungfu");
        l.addBook("subconscious mind");
        l.addBook("pancreas");
        l.addBook("karate");
        l.showAvailableBooks();

        System.out.println("---------------Available books after issuing : --------------------");
        l.issueBook("kungfu");
        l.issueBook("pancreas");
        l.showAvailableBooks();

        System.out.println("-----------------Isuued book-------------------:");
        l.issuedBooks();

        System.out.println("-----------------After returning the book : -----------------");
        l.returnBook("kungfu");
        System.out.println("---Available books after returning-----");
        l.showAvailableBooks();
        System.out.println("---issued books after returning----");
        l.issuedBooks();




    }
}
