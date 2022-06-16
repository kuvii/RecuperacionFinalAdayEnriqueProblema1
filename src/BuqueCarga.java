import java.util.ArrayList;

public class BuqueCarga {
        String nombre;
        ArrayList<Container> espacioCarga = new ArrayList<>((int) ShipUtils.generarNumeroAleatorio(3));

        public BuqueCarga() {
                this.nombre = ShipUtils.generarNombreBuque();
                load(3);
        }

        public void load(int maxLoad) {
                for (int i = 0; i < ShipUtils.generarNumeroAleatorio(maxLoad); i++) {
                        Container container = new Container(ShipUtils.generarTipoCarga(), (float) ShipUtils.generarNumeroAleatorio(100));
                        espacioCarga.add(container);
                }
        }

        @Override
        public String toString() {
                return "Buque " + nombre + " Carga: " + "\n" +espacioCarga + "\n";
        }
}
