package ec.edu.espol;

public class InformeBase implements Informe {
    private String contenido;

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public InformeBase(String contenido) {
        this.contenido = contenido;
    }
}
