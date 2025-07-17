import java,util.List;

public class Book{
    private final int bookId;
    private final String title;
    private final  List<String> authors;
    private final  List<String> tags;//hold genres 


    public Book(String title, List<String> authors, List<String> tags){
        this.title = title;
        this.authors = authors;
        this.tags = tags;
        this.bookId= bookId;
    }
    //getters for title, author, and gere
    public String getTitle(){
        return title;
    }
    public String getAuthor(){
        return author;
    }
    public String getTags(){
        return tags;
    }
    @Override
    //display book info in a readable format
    public String toString(){
        return "'" + title + "' by " + String.join(", ", authors) + " [" + String.join(", ", tags) + "]";
    }
}