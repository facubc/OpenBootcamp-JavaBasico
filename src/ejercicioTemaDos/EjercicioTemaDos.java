package ejercicioTemaDos;

public class EjercicioTemaDos {

  public static void main(String[] args) {

    System.out.println(addIVA(10));

  }

  static double addIVA (double precio){
    return precio += precio * 0.21;
  }

}
