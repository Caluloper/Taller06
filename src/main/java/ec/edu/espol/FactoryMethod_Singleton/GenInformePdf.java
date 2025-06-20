package ec.edu.espol.FactoryMethod_Singleton;
import ec.edu.espol.Informe;
import ec.edu.espol.InformePdf;

public class GenInformePdf extends GeneradorInformes {
    @Override
    public Informe generarInforme(String contenido) {
        return new InformePdf(contenido);
    }
}
