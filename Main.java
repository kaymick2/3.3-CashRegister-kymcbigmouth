class Main {
  public static void main(String[] args) {
    CashRegister hybee = new CashRegister();
    //buying things
    hybee.recordPurchase(10);
    hybee.recordPurchase(50);
    hybee.recordPurchase(2.75);
    //using WePay
    hybee.weixinPay(75);
    //calculating change
    System.out.println("Your change is: $" + hybee.giveChange());
    //resetting to 0
    hybee.reset();
    hybee.recordPurchase(102.75);
    hybee.weixinPay(50);
    //outputs a negative
    System.out.println("Your change is: $" + hybee.giveChange());
    System.out.println("You don't have enough money!");
    hybee.reset();
    System.out.println();
    System.out.println("**************************");
    System.out.println();
    // day 2
    hybee.recordPurchase(27.83);
    System.out.printf("Your total of $ %.2f", hybee.total());
    //applying tax
    System.out.printf(" will become $%.2f" , hybee.communism());
    System.out.println(" after sales tax.");
    hybee.weixinPay(40);
    System.out.println("WePay Approved- $40");
    System.out.printf("Your change is $%.2f" , hybee.giveChange());
    System.out.println(".");
    hybee.reset();
    hybee.recordPurchase(5);
    hybee.recordPurchase(5);
    hybee.recordPurchase(3.20);
    System.out.print("Your total with tax is $");
    System.out.printf(" %.2f", hybee.communism());
    System.out.println();
    hybee.weixinPay(15);
    System.out.print("Thank you! Your change is $");
    System.out.printf("%.2f", hybee.giveChange());
  }
}