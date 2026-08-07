public abstract class Animal {

    String nombre;

    public abstract String hacerSonido();

    public static void main(String[] args) {
        Animal perro = new Perro("Fido");
        Animal gato = new Gato("Michi");

        System.out.println();

        System.out.println(perro.nombre + " dice: " + perro.hacerSonido());
        System.out.println(gato.nombre + " dice: " + gato.hacerSonido());
    }

}


