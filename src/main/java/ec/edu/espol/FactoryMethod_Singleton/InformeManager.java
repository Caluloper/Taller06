package ec.edu.espol.FactoryMethod_Singleton;

public class InformeManager {
    private InformeManager manager;

    private InformeManager(){

    }
    public InformeManager getInformeManager(){
        return manager;
    }

}
