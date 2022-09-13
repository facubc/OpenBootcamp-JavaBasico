package ejercicioTemaCinco;

public class CocheCrudImpl implements ICocheCrud {

  @Override
  public void save() {
    System.out.println("save");
  }

  @Override
  public void finAll() {
    System.out.println("findAll");
  }

  @Override
  public void delete() {
    System.out.println("delete");
  }
}
