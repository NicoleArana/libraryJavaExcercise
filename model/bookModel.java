package model;
public class bookModel {

    public String title;
    public String author;
    public String ISBN;
    public Integer copiesNum;
    public String status;
    
    public bookModel(String title, String author, String ISBN, Integer copiesNum, String status) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
        this.copiesNum = copiesNum;
        this.status = status;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setCopiesNum(Integer copiesNum) {
        this.copiesNum = copiesNum;
    }


    public Integer getCopiesNum() {
        return copiesNum;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }
    
}
