package ec.edu.espol.Decorator;
import ec.edu.espol.Informe;

public abstract class Decorador implements Informe {
    protected Informe informe;

    public Decorador(Informe informe) {
        this.informe = informe;
    }

    public abstract void personalizarInforme();
}