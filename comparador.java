package tarea8;
/**
 *
 * @author galva
 */

class comparador {

    private int edad;
    private double precio;

    public comparador() {
        this.edad = 0;
        this.precio = 0;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public boolean igualQueP(Object pr) {
        producto pro = (producto) pr;
        return this.precio == pro.getPrecio();
    }

    public boolean menorQueP(Object pr) {
        producto pro = (producto) pr;
        return pro.getPrecio() < this.precio;
    }

    public boolean mayorQueP(Object pr) {
        producto pro = (producto) pr;
        return pro.getPrecio() > this.precio;
    }

    public boolean mayorIgualQueP(Object pr) {
        producto pro = (producto) pr;
        return pro.getPrecio() >= this.precio;
    }

    public boolean menorIgualQueP(Object pr) {
        producto pro = (producto) pr;
        return pro.getPrecio() <= this.precio;
    }

    public boolean igualQueA(Object al) {
        alumno a = (alumno) al;
        return this.edad == a.getEdad();
    }

    public boolean menorQueA(Object al) {
        alumno a = (alumno) al;
        return a.getEdad() < this.edad;
    }

    public boolean mayorQueA(Object al) {
        alumno a = (alumno) al;
        return a.getEdad() > this.edad;
    }

    public boolean mayorIgualQueA(Object al) {
        alumno a = (alumno) al;
        return a.getEdad() >= this.edad;
    }

    public boolean menorIgualQueA(Object al) {
        alumno a = (alumno) al;
        return a.getEdad() <= this.edad;
    }
}