package ec.edu.espol.Decorator;
import ec.edu.espol.Informe;

public class ColorInforme extends Decorador {
    public ColorInforme(Informe informe) {
        super(informe);
    }

    @Override
    public void personalizarInforme() {
        System.out.println("Aplicando color al informe");
    }
}
