public class Book {
    String name;
    String authorBook;
    int yearСreation;
    public Book (String name,String authorBook,int yearСreation){
        this.name=name;
        this.authorBook=authorBook;
        this.yearСreation=yearСreation;
}
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getAuthorBook(){
        return authorBook;
    }
    public void setAuthorBook(String authorBook){
        this.authorBook=authorBook;
    }
    public int getYearСreation(){
        return yearСreation;
    }

    public void setyearСreation(int yearСreation){
        this.yearСreation=yearСreation;
    }
}