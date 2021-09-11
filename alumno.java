package tarea8;
/**
 *
 * @author galva
 */
class alumno {

    private String nombre, carne;
    private int edad;

    public alumno(String carne, String nombre, int edad) {
        this.carne = carne;
        this.nombre = nombre;
        this.edad = edad;
    }

    public int getEdad() {
        return edad;
    }
}
