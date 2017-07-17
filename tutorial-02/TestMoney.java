/** basic tester for Money class */

public class TestMoney{
  
  public static void main(String[] args){
    
    Money money;
    String actual,expected;
    
    System.out.print("        Money() test : ");
    money = new Money();
    actual = money.getMoney();
    expected = "$0.00";
    System.out.print("expected \"" + expected + "\"   actual output \"" + actual + "\"");
    if( actual.equals(expected) ){
      System.out.println(" pass");
    }else{
      System.out.println(" fail");
    }
    
    System.out.print("Money(int, int) test : ");
    money = new Money(0,0);
    actual = money.getMoney();
    expected = "$0.00";
    System.out.print("expected \"" + expected + "\"   actual output \"" + actual + "\"");
    if( actual.equals(expected) ){
      System.out.println(" pass");
    }else{
      System.out.println(" fail");
    }
 
    System.out.print("Money(int, int) test : ");
    money = new Money(12,7);
    actual = money.getMoney();
    expected = "$12.07";
    System.out.print("expected \"" + expected + "\"   actual output \"" + actual + "\"");
    if( actual.equals(expected) ){
      System.out.println(" pass");
    }else{
      System.out.println(" fail");
    }
    
    System.out.print("Money(int, int) test : ");
    money = new Money(3,4023);
    actual = money.getMoney();
    expected = "$43.23";
    System.out.print("expected \"" + expected + "\"   actual output \"" + actual + "\"");
    if( actual.equals(expected) ){
      System.out.println(" pass");
    }else{
      System.out.println(" fail");
    }
    
    System.out.print("     Money(int) test : ");
    money = new Money(0);
    actual = money.getMoney();
    expected = "$0.00";
    System.out.print("expected \"" + expected + "\"   actual output \"" + actual + "\"");
    if( actual.equals(expected) ){
      System.out.println(" pass");
    }else{
      System.out.println(" fail");
    }
    
    System.out.print("     Money(int) test : ");
    money = new Money(63);
    actual = money.getMoney();
    expected = "$0.63";
    System.out.print("expected \"" + expected + "\"   actual output \"" + actual + "\"");
    if( actual.equals(expected) ){
      System.out.println(" pass");
    }else{
      System.out.println(" fail");
    }
    
    System.out.print("     Money(int) test : ");
    money = new Money(21387);
    actual = money.getMoney();
    expected = "$213.87";
    System.out.print("expected \"" + expected + "\"   actual output \"" + actual + "\"");
    if( actual.equals(expected) ){
      System.out.println(" pass");
    }else{
      System.out.println(" fail");
    }
    
    System.out.print("     Money(int, int).add(int) test : ");
    money = new Money(100, 0);
    money.add(1000);
    actual = money.getMoney();
    expected = "$110.00";
    System.out.print("expected \"" + expected + "\"   actual output \"" + actual + "\"");
    if( actual.equals(expected) ){
      System.out.println(" pass");
    }else{
      System.out.println(" fail");
    }

    System.out.print("     Money(int, int).add(int) test : ");
    money = new Money(100, 0);
    money.add(103);
    actual = money.getMoney();
    expected = "$101.03";
    System.out.print("expected \"" + expected + "\"   actual output \"" + actual + "\"");
    if( actual.equals(expected) ){
      System.out.println(" pass");
    }else{
      System.out.println(" fail");
    }

    System.out.print("     Money(int, int).add(int, int) test : ");
    money = new Money(100, 0);
    money.add(2, 100);
    actual = money.getMoney();
    expected = "$103.00";
    System.out.print("expected \"" + expected + "\"   actual output \"" + actual + "\"");
    if( actual.equals(expected) ){
      System.out.println(" pass");
    }else{
      System.out.println(" fail");
    }
    
    // test when we have more money than we are trying to remove
    System.out.print("     Money(int, int).remove(int) test : ");
    money = new Money(1, 93);
    money.remove(93);
    actual = money.getMoney();
    expected = "$1.00";
    System.out.print("expected \"" + expected + "\"   actual output \"" + actual + "\"");
    if( actual.equals(expected) ){
      System.out.println(" pass");
    }else{
      System.out.println(" fail");
    }
    
    // test when our money is $0.00
    System.out.print("     Money(int, int).remove(int) test : ");
    money = new Money(0, 0);
    money.remove(93);
    actual = money.getMoney();
    expected = "$0.00";
    System.out.print("expected \"" + expected + "\"   actual output \"" + actual + "\"");
    if( actual.equals(expected) ){
      System.out.println(" pass");
    }else{
      System.out.println(" fail");
    }
    
    // test when we have less money than we are trying to remove
    System.out.print("     Money(int, int).remove(int) test : ");
    money = new Money(1, 0);
    money.remove(101);
    actual = money.getMoney();
    expected = "$0.00";
    System.out.print("expected \"" + expected + "\"   actual output \"" + actual + "\"");
    if( actual.equals(expected) ){
      System.out.println(" pass");
    }else{
      System.out.println(" fail");
    }


    
  }
}
