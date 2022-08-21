package ejercicioTemaCuatro;

public class EjercicioTemaCuatro {

  public static void main(String[] args) {

    SmartPhone smartPhone = new SmartPhone(
        "green",
        10.5,
        100,
        250,
        "apple"
    );

    SmartWatch smartWatch = new SmartWatch(
        "black",
        5.2,
        100,
        "india"
    );

    System.out.println(smartPhone);
    System.out.println(smartWatch);

  }

}
