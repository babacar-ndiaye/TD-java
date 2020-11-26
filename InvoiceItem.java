package TD;

public class InvoiceItem {
  private String id;
  private String desc;
  private int qty;
  private double unitPrice;

  public InvoiceItem(String id, String desc, int qty, double unitPrice) {
    this.id = id;
    this.desc = desc;
    this.qty = qty;
    this.unitPrice = unitPrice;
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
   * @return String return the desc
   */
  public String getDesc() {
    return desc;
  }

  /**
   * @param desc the desc to set
   */
  public void setDesc(String desc) {
    this.desc = desc;
  }

  /**
   * @return int return the qty
   */
  public int getQty() {
    return qty;
  }

  /**
   * @param qty the qty to set
   */
  public void setQty(int qty) {
    this.qty = qty;
  }

  /**
   * @return double return the unitPrice
   */
  public double getUnitPrice() {
    return unitPrice;
  }

  /**
   * @param unitPrice the unitPrice to set
   */
  public void setUnitPrice(double unitPrice) {
    this.unitPrice = unitPrice;
  }

  public double getTotal() {
    return unitPrice * qty;
  }
 public String toString() {
   return "InvoiceItem[ id = "+getId()+",desc = "+getDesc()+",qty = "+getQty()+",unitPrice= "+getUnitPrice()+" ]";
 }
}
