package ec.edu.espol.Decorator;
import ec.edu.espol.Informe;

public class FuenteInforme extends Decorador {
    public FuenteInforme(Informe informe) {
        super(informe);
    }

    @Override
    public void personalizarInforme() {
        System.out.println("Aplicando fuente al informe");
    }
}