package ejercicioTemaTres;

public class EjercicioTemaTres {

  public static void main(String[] args) {

    String[] palabras = {"silla","termo","lapiz"};
    String concatenacion = "";

    for (int i = 0; i< palabras.length; i++){
      concatenacion += palabras[i];
    }

    System.out.println(concatenacion);

  }


}
