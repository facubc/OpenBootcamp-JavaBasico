package ejercicioTemaCuatro;

public class SmartWatch extends SmartDevice{

  private String made;

  public SmartWatch() {
  }

  public SmartWatch(String color, Double size, Integer battery, String made) {
    super(color, size, battery);
    this.made = made;
  }

  public String getMade() {
    return made;
  }

  public void setMade(String made) {
    this.made = made;
  }

  @Override
  public String toString() {
    return "SmartWatch{" +
        "made='" + made + '\'' +
        '}';
  }
}
