public class ShipUtils {
    private static final String []NOMBRES_BARCOS = {
            "Titanic",
            "Juan Sebastián ElCano",
            "Rainbow Warrior",
            "La Niña",
            "La Pinta",
            "La Santa María",
            "Lusitania",
            "Enterprise",
            "La Perla Negra"
    };

    public static final String []TIPOS_CARGA = {
            "Petróleo",
            "Cereales",
            "Componentes electrónicos",
            "Acero",
            "Cemento",
            "Oro",
            "Piedras preciosas",
            "Especias"
    };

    public static String generarNombreBuque() {
        return NOMBRES_BARCOS[(int) (Math.random() * NOMBRES_BARCOS.length)];
    }

    public static String generarTipoCarga() {
        return TIPOS_CARGA[(int) (Math.random() * TIPOS_CARGA.length)];
    }

    public static double generarNumeroAleatorio(int valorMaximo) {
        return (Math.random() * valorMaximo) + 1.0f;
    }
}
