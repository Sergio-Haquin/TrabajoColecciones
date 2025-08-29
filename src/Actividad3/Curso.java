package Actividad3;

public class Curso {
    private String docente;
    private String nombre;

    public Curso (String docente, String nombre) {
        this.docente = docente;
        this.nombre = nombre;
    }

    public String getDocente() {
        return docente;
    }

    public void setDocente(String docente) {
        this.docente = docente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Curso{" +
                ", docente='" + docente + '\'' +
                ", nombre='" + nombre + '\'' +
                '}';
    }


}
