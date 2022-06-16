public class Container {
    String tipoCarga;
    float peso;

    public Container(String tipoCarga, float peso) {
        this.tipoCarga = tipoCarga;
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "Container " +
                "tipoCarga='" + tipoCarga + '\'' +
                " peso= " + peso + "\n";
    }
}
