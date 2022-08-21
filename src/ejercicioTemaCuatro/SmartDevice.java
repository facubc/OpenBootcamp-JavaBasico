package ejercicioTemaCuatro;

public class SmartDevice {

  private String color;
  private Double size;
  private Integer battery;

  public SmartDevice() {
  }

  public SmartDevice(String color, Double size, Integer battery) {
    this.color = color;
    this.size = size;
    this.battery = battery;
  }

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public Double getSize() {
    return size;
  }

  public void setSize(Double size) {
    this.size = size;
  }

  public Integer getBattery() {
    return battery;
  }

  public void setBattery(Integer battery) {
    this.battery = battery;
  }

  @Override
  public String toString() {
    return "SmartDevice{" +
        "color='" + color + '\'' +
        ", size=" + size +
        ", battery=" + battery +
        '}';
  }
}
