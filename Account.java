package TD;

public class Account {
  private String id;
  private String name;
  private int balance = 0;

  public Account(String id, String name) {
    this.id = id;
    this.name = name;
  }

  public Account(String id, String name, int balance) {
    this.id = id;
    this.name = name;
    this.balance = balance;
  }

  /**
   * @return String return the id
   */
  public String getId() {
    return id;
  }

  /**
   * @param id the id to set
   */
  public void setId(String id) {
    this.id = id;
  }

  /**
   * @return String return the name
   */
  public String getName() {
    return name;
  }

  /**
   * @param name the name to set
   */
  public void setName(String name) {
    this.name = name;
  }

  /**
   * @return int return the balance
   */
  public int getBalance() {
    return balance;
  }

  /**
   * @param balance the balance to set
   */
  public void setBalance(int balance) {
    this.balance = balance;
  }

  public int credit(int amount) {
    return this.balance + amount;
  }

  public int debit(int amount) {
    if (amount <= balance) {
      balance -= amount;
    } else {
      System.out.println("Amount exceeded balance");
    }
    return balance;
  }

  public int transferTO(Account another, int amount) {
    if (amount <= balance) {
      another.balance += amount;
      balance -= amount;
    } else {
      System.out.println("Account exceeded balance");
    }
    return balance;
  }

  public String toString() {
    return "Account[id = " + getId() + ", name = " + getName() + ", balance = " + getBalance() + " ]";
  }
}