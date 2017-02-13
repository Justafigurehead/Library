import java.util.ArrayList;

public class Reader{

  private String name;
  private ArrayList<Book> toRead;

  public Reader(String name){
    this.name = name;
    this.toRead = new ArrayList<Book>();
  }

  public String getName(){
    return this.name;
  }
}