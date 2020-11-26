package TD;

public class iTime {
  private int hour;
  private int minute;
  private int second;

  public iTime(int hour, int minute, int second) {
    this.hour = hour;
    this.minute = minute;
    this.second = second;
  }

  public void setTime(int hour, int minute, int second) {
    this.hour = hour;
    this.minute = minute;
    this.second = second;
  }

  /**
   * @return int return the hour
   */
  public int getHour() {
    return hour;
  }

  /**
   * @param hour the hour to set
   */
  public void setHour(int hour) {
    this.hour = hour;
  }

  /**
   * @return int return the minute
   */
  public int getMinute() {
    return minute;
  }

  /**
   * @param minute the minute to set
   */
  public void setMinute(int minute) {
    this.minute = minute;
  }

  /**
   * @return int return the second
   */
  public int getSecond() {
    return second;
  }

  /**
   * @param second the second to set
   */
  public void setSecond(int second) {
    this.second = second;
  }

//  public String toString() {
//    return "hh/mm/ss " + hour + minute + second;
//  }

  @Override
  public String toString() {
    return "iTime{" +
            "hour=" + hour +
            ", minute=" + minute +
            ", second=" + second +
            '}';
  }

  public void nextSecond() {
    second++;
    if (second == 60) {
      second = 0;
      minute++;
      if (minute == 60) {
        minute = 0;
        hour++;
        if (hour == 24) {
          hour = 0;
        }
      }
    }
  }

  public iTime previousSecond() {
    if (second == 0) {
      second = 59;
      if (minute == 0) {
        minute = 59;
        if (hour == 0) {
          hour = 23;
        } else {
          hour--;
        }
      } else {
        minute--;
      }
    }else{
    second--;
    }
    return this;
  }
}
