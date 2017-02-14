import java.util.ArrayList;

public class Library{

  private String name;
  private ArrayList<Book> stock;

  public Library(String name){
    this.name = name;
    this.stock = new ArrayList<Book>();
  }

  public String getName(){
    return this.name;
  }

  public int stockCount(){
    return stock.size();
  }

  public void addStock(Book book){
    if (this.isFull() == false){
       stock.add(book);
   }
  }

// Attempt one - not very usable returning a string. System.out and if statement throws out errors. See Attempt 2 as a passing if loop, But again string statement makes it harder to work with and we don't really need to return something to the screen as we need to pass it to another function anyway.
  // public String checkStockCapacity(){
  //     if (this.stockCount() >= 4){
  //        System.out.println("Unable to add more books.");
  //     }
  //   }
 
 // Attempt two - 
  // public String checkStockCapacity(){
  //   if (this.stockCount() >= 4){
  //     return "Unable to add more books.";
  //    }
  //   return "Add more.";
  // }

// Attempt three - the long-ish way. 
  // public boolean isFull(){
  //   int shelves = this.stockCount();
  //   return shelves >= 5;
  // }

  // Daniel's demo in class of isFull
  public boolean isFull(){
    return this.stockCount() >= 5;
  }

}