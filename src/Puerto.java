import java.util.ArrayList;

public class Puerto {
    String nombre;
    ArrayList colabuques = new ArrayList(4);

    public Puerto(String nombre) {
        this.nombre = nombre;
        enqueue(4);
    }

    public void enqueue(int maxShips) {
        for (int i = 0; i < maxShips; i++) {
            BuqueCarga buque = new BuqueCarga();
            colabuques.add(buque);
        }
    }

    @Override
    public String toString() {
        return "Puerto " + nombre + " \n" + colabuques ;
    }
}
