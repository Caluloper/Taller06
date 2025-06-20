package ec.edu.espol.Decorator;
import ec.edu.espol.Informe;

public class EstiloInforme extends Decorador {
    public EstiloInforme(Informe informe) {
        super(informe);
    }

    @Override
    public void personalizarInforme() {
        System.out.println("Aplicando estilo al informe");
    }
}