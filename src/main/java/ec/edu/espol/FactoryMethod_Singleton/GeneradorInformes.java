package ec.edu.espol.FactoryMethod_Singleton;
import ec.edu.espol.Informe;

public abstract class GeneradorInformes {
    private static GeneradorInformes generador;

    protected GeneradorInformes() {
    }

    public static GeneradorInformes getGenerador() {
        return generador;
    }

    public abstract Informe generarInforme(String contenido);
}
