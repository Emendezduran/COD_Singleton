package cod_singleton;
//@author emendezduran

public final class Singleton {

    private String nombre;
    private int numero;
    private static byte bandera;
    private static Singleton[] miObjeto = new Singleton[3];

    private Singleton(String nombre, int numero) {

        this.nombre = nombre;
        this.numero = numero;

    }

    public static Singleton getInstance(String nombre, int numero) {
        if (bandera < miObjeto.length) {
            miObjeto[bandera] = new Singleton(nombre, numero);
            bandera++;
        } else {
            return null;
        }
        return miObjeto[bandera - 1];

    }

    public static Singleton ResetInstance(String nombre, int numero, int i) {
        miObjeto[i].setNombre(nombre);
        miObjeto[i].setNumero(numero);
        return miObjeto[i];
    }

    public static Singleton getObject(int i) {
        return miObjeto[i];
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "Singleton {" + "nombre=" + nombre + ", numero=" + numero + '}';
    }


}

 

