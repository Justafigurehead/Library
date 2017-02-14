import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.Before;

public class LibraryTest{

  Library mitchell;
  Book treasureIsland;
  Book crash;
  Book trainspotting;
  Book hobbit;
  Book fishnet;
  Book catInHat;
  Reader reader;

  @Before
  public void before(){
    mitchell = new Library("Mitchell Library");
    treasureIsland = new Book("Treasure Island", "Robert Louis Stevenson");
    crash = new Book("Crash", "J.G. Ballard");
    trainspotting = new Book("Trainspotting", "Irvine Welsh");
    hobbit = new Book("The Hobbit", "Tolkien");
    fishnet = new Book("Fishnet", "Kirsten Innes");
    catInHat = new Book("Cat in the Hat", "Dr Sueuss");
    reader = new Reader("Michaela");
  }


// Test Library class 

  @Test 
  public void hasName(){
    assertEquals("Mitchell Library", mitchell.getName());
  }

  @Test 
  public void checkStockIsEmpty(){
    assertEquals(0, mitchell.stockCount());
  }

  @Test 
  public void addBookToStock(){
    mitchell.addStock(trainspotting);
    assertEquals(1,mitchell.stockCount());
  }

  @Test 
  public void checkIfLibraryGoesOverCapacity(){
    mitchell.addStock(trainspotting);
    mitchell.addStock(crash);
    mitchell.addStock(hobbit);
    mitchell.addStock(fishnet);
    mitchell.addStock(treasureIsland);
    // mitchell.addStock(catInHat);
    assertEquals(true, mitchell.isFull());
  }

  @Test 
  public void checkIfLibraryIsUnderCapacity(){
    mitchell.addStock(trainspotting);
    mitchell.addStock(crash);
    mitchell.addStock(hobbit);
    mitchell.addStock(fishnet);
    // mitchell.addStock(treasureIsland);
    // mitchell.addStock(catInHat);
    assertEquals(false, mitchell.isFull());
  }

  @Test 
  public void checkIfStockStopsAdding(){
    mitchell.addStock(trainspotting);
    mitchell.addStock(crash);
    mitchell.addStock(hobbit);
    mitchell.addStock(fishnet);
    mitchell.addStock(treasureIsland);
    mitchell.addStock(catInHat);
    mitchell.addStock(catInHat);
    mitchell.addStock(catInHat);
    mitchell.addStock(catInHat);
    assertEquals(5, mitchell.stockCount());
  }

// Test Book class - 

  @Test 
  public void getTitle(){
    assertEquals("Crash", crash.getTitle());
  } 

  @Test 
  public void getAuthor(){
    assertEquals("Irvine Welsh", trainspotting.getAuthor());
  }


// Test Reader class

  @Test
  public void getReaderName(){
    assertEquals("Michaela", reader.getName());
  }


}