package TD;

public class pEmployee {
  private int id;
  private int salary;
  private String firstName;
  private String lastName;

  public Employee(int id,String firstName,String lastName,int salary) {
    this.id = id;
    this.firstName = firstName;
    this.lastName = lastName;
    this.salary = salary;
  }

  /**
   * @return int return the id
   */
  public int getId() {
    return id;
  }

  /**
   * @param id the id to set
   */
  public void setId(int id) {
    this.id = id;
  }

  /**
   * @return int return the salary
   */
  public int getSalary() {
    return salary;
  }

  /**
   * @param salary the salary to set
   */
  public void setSalary(int salary) {
    this.salary = salary;
  }

  /**
   * @return String return the firstName
   */
  public String getFirstName() {
    return firstName;
  }

  /**
   * @param firstName the firstName to set
   */
  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  /**
   * @return String return the lastName
   */
  public String getLastName() {
    return lastName;
  }

  /**
   * @param lastName the lastName to set
   */
  public void setLastName(String lastName) {
    this.lastName = lastName;
  }
  public int  getAnnualSalary() {
    return salary*12;
  }
  public int  raiseSalary(int percent ) {
    return salary*(1 + percent/100);
  }
  public String toString() {
    return "Employee[ id = " + getId()+ ", name = " +getFirstName()+ " " +getLastName()+ ", salary = " +getSalary()+ " ]";
  }
 }
