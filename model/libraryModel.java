package model;

import java.util.ArrayList;
import java.util.List;

public class libraryModel {
    private List<bookModel> books;  
    private List<patronModel> patrons;  
    

    public libraryModel() {
        books = new ArrayList<>(); // Initialize items list  
        patrons = new ArrayList<>(); // Initialize items list  
       
    }

    public void getBook(String filter) {
        for  (bookModel book : books) { 
            if (book.title == filter || book.author == filter || book.ISBN == filter) {
                System.out.println("Your Book:");
                System.out.println("title:" + book.title);
                System.out.println("author:" + book.author);
                System.out.println("ISBN:" + book.ISBN);
                System.out.println("Number of copies :" + book.copiesNum);
                return;
            }
        }
        System.out.println("Book not found in inventory."); // Handle item not found  
        return;
    }

    public void addBook(String title, String author, String ISBN, int copiesNum, String status) {
        bookModel book = new bookModel(title, author, ISBN, copiesNum, status);
        books.add(book);
    }

    public void removeBookCopy(String bookTitle, int numCopiesToRemove) {  
        for (bookModel book : books) {  
            if (book.getTitle().equals(bookTitle)) { 
                if (book.getCopiesNum() == 1){
                    books.remove(book);
                    return;
                }

                int copiesNum = book.getCopiesNum() - numCopiesToRemove;

                book.setCopiesNum(copiesNum); // Attempt to remove the specified quantity  
                return;  
            }  
        }  
        System.out.println("Book not found in inventory."); // Handle item not found  
    } 

    public void displayBooks() {  
        System.out.println("Current Inventory:");  
        for (bookModel book : books) {  
            System.out.println("Title: " + book.getTitle() + " - Author: " + book.getAuthor() + " - ISBN: " + book.getISBN() + " - Number of copies: " + book.getCopiesNum() + " - Status: " + book.getStatus()); // Display item details  
        }  
    }
  

    public void registerPatron(String name, String ID, String email, String phone) {
        patronModel patron = new patronModel(name, ID, email, phone);
        patrons.add(patron);
    }
}
