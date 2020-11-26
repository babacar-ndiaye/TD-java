package TD;

public class Rectangle {
  private float lenght = 1.0f;
  private float widht = 1.0f;

  public Rectangle() {
    this.lenght = 1.0f;
    this.widht = 1.0f;

  }

  public Rectangle(float lenght, float widht) {
    this.lenght = lenght;
    this.widht = widht;

  }

  public double getArea() {
    return lenght * widht;
  }

  public double getParameter() {
    return 2 * (lenght + widht);
  }

  /**
   * @return float return the lenght
   */
  public float getLenght() {
    return lenght;
  }

  /**
   * @param lenght the lenght to set
   */
  public void setLenght(float lenght) {
    this.lenght = lenght;
  }

  /**
   * @return float return the widht
   */
  public float getWidht() {
    return widht;
  }

  /**
   * @param widht the widht to set
   */
  public void setWidht(float widht) {
    this.widht = widht;
  }

  public String toString() {
    return lenght + " " + widht;
  }
}