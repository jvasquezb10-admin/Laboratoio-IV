public class Gato extends Animal {

    public Gato(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String hacerSonido() {
        return "Miau";
    }
}
