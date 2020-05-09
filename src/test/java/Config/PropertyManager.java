package Config;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyManager {

    private static PropertyManager instance;
    private static final Object lock = new Object();
    private static String propertyFilePath = System.getProperty("user.dir")+"\\src\\test\\java\\Config\\TestData.properties";
    private static String dataTuto;
    private static String search_url;

    /*Singleton
    Su intención consiste en garantizar que una clase solo tenga una instancia y proporcionar un punto de acceso global a ella
     */
    public static PropertyManager getInstance(){
        if(instance == null){
            synchronized (lock){
                instance = new PropertyManager();
                instance.loadData();
            }
        }
        return instance;
    }

    private void loadData() {
        Properties prop = new Properties();

        try{
            prop.load(new FileInputStream(propertyFilePath));
        }catch (IOException e){
            System.out.println("No se encontró el archivo con la data");
        }
        dataTuto = prop.getProperty("data");
        search_url = prop.getProperty("search_url");

        /*Finalmente, vamos a crear el GET para que nos devuelva la data que solicitemos desde
        nuestras clases de testing. public String getData(){return dataTuto;}
        desde cualquier clase donde importemos nuestro PropertyManager (esto lo hacemos al principio
        de nuestro archivo de clase, mediante "import config.PropertyManager;)
        Como estamos usando una instancia de ella, vamos a hacerlo de la siguiente manera:
        private String testData = PropertyManager.getInstance().getData();
        */
    }

    public String getSearch_url() {
        return search_url;
    }
}

