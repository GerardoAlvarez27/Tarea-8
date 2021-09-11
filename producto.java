package tarea8;
/**
 *
 * @author galva
 */

class producto {

    private int key;
    private String nombre;
    private double precio;

    public producto(int key, String nombre, double precio) {
        this.key = key;
        this.nombre = nombre;
        this.precio = precio;

    }

    public double getPrecio() {
        return precio;

    }
}
