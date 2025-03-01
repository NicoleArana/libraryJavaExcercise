package model;
public class librarianModel {

    private String name;
    private libraryModel library;


    public librarianModel(String name, libraryModel library) {
        this.name = name;
        this.library = library;
    }

   public void addBook(String title, String author, String ISBN, int copiesNum, String status) {
        library.addBook(title, author, ISBN, copiesNum, status);
    }
    
}
