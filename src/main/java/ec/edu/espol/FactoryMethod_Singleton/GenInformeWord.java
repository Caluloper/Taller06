package ec.edu.espol.FactoryMethod_Singleton;
import ec.edu.espol.Informe;
import ec.edu.espol.InformeWord;

public class GenInformeWord extends GeneradorInformes {
    @Override
    public Informe generarInforme(String contenido) {
        return new InformeWord(contenido);
    }
}