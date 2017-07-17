/**
 * A Money object models money as dollars and cents
 **/
 
public class Money{
  
  /* attributes */ 
  private int dollars = -1;
  private int cents = -1;

  
  public Money(){
    // create an object with zero dollars and cents.
    this.dollars = 0;
    this.cents = 0;
  }
  
  public Money(int c){
    // create an object with c cents
    // (adjusting dollars and cents so that 0<=cents<=99)
    this();
    if (c < 100) {
      this.cents = c;
    } else {
      this.dollars = c / 100; 
      this.cents = c % 100;
    }
  }
  
  public Money(int d, int c){
    // create an object with d dollars and c cents
    // (adjusting dollars and cents so that 0<=cents<=99)
    this(c);
    this.dollars += d;  
  }
  
  /** 
   * Returns a String representation of the value of the current object. 
   * 
   * @return The value of the current object is returned as the <code>String</code>"$D.cc"
   * where D is the number of dollars and cc is the cents of the value.  Uses the <code>format()</code>
   * method from the <code>String</code> class to ensure that the cents are displayed properly (2 spaces
   * with leading zeros if needed).
   **/
  public String getMoney(){
    return "$" + String.format("%01d", dollars) + "." + String.format("%02d", cents);
  }

  public void add(int c) {
    this.cents += c;
    if (this.cents >= 100) {
    this.dollars += (this.cents / 100);
    this.cents %= 100; 
 }
  }
  
  public void add(int d, int c) {
    this.dollars += d;
    add(c); 
  }

  public int remove(int c) {
    // the current value in cents
    int current_value = (this.dollars * 100) + this.cents;
    if (current_value > 0) {
      // if we have enough money to remove from
      if (current_value > c) {
        current_value -= c;
        this.dollars = current_value / 100;
        this.cents = current_value % 100;
        return c;
      // the max we can remove is our current value
      } else { 
        this.dollars -= current_value / 100;
        this.cents -= current_value % 100;
        return current_value;
      }
      
    } else {
      // money is $0.00
      return current_value;
    }
  }

}
