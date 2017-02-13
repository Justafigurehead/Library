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

// Cannot return a string here though ...but it's working back to the checkStockCacpacity which can call a string. 
  public int stockCount(){
    this.checkStockCapacity();
    return stock.size();
  }

  public void addStock(Book book){
    stock.add(book);
  }

// Attempt one
  public String checkStockCapacity(){
      if (this.stockCount() >= 4){
         System.out.println("Unable to add more books.");
      }
    }
  


}