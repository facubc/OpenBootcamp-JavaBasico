package ejercicioTemaCuatro;

public class SmartPhone extends SmartDevice{

  private Integer memory;
  private String trademark;

  public SmartPhone() {
  }

  public SmartPhone(String color, Double size, Integer battery, Integer memory,
      String trademark) {
    super(color, size, battery);
    this.memory = memory;
    this.trademark = trademark;
  }

  public Integer getMemory() {
    return memory;
  }

  public void setMemory(Integer memory) {
    this.memory = memory;
  }

  public String getTrademark() {
    return trademark;
  }

  public void setTrademark(String trademark) {
    this.trademark = trademark;
  }

  @Override
  public String toString() {
    return "SmartPhone{" +
        "memory=" + memory +
        ", trademark='" + trademark + '\'' +
        '}';
  }
}
