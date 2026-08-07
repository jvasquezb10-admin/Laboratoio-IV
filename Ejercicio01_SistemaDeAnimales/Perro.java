public class Perro extends Animal {

    public Perro(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String hacerSonido() {
        return "Guau";
    }
}
