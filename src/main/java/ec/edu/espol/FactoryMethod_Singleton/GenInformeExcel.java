package ec.edu.espol.FactoryMethod_Singleton;
import ec.edu.espol.Informe;
import ec.edu.espol.InformeExcel;

public class GenInformeExcel extends GeneradorInformes {
    @Override
    public Informe generarInforme(String contenido) {
        return new InformeExcel(contenido);
    }
}