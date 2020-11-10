public class CashRegister {

  //initialises variables
  private double purchase = 0;
  private double payment = 0;
  private double total = 0;
// call this with recordPurchase(amount) to ring up items.
  public double recordPurchase(double amount) {
    purchase = purchase + amount;
    return purchase;
  }

//returns total amount due. use with a print command.
  public double total() {
    total = purchase;
    return total;
  }

//payment method. call with amount as an explicit parameter. This method can be duplicated with a different name for other payment methods, such as PayPal, LINEPay, WU, or Suica.
  public double weixinPay(double howMoney) {
    payment = howMoney;
    return payment;
  }
  //adds tax. replace 1.06 with whatever the sales tax is in your state if required. Remove if you're being shady.
  public double communism() {
    double tax= total *1.06;
    return tax;
  }
  //gives change. used with the print method.
  public double giveChange() {
    double change =  payment - purchase;
    return change;

  }
//resets everything to zero after you're done with a transaction.
  public void reset() {
    purchase = 0;
    payment = 0;
  }
}