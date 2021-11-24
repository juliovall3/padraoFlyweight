import java.util.HashMap;
import java.util.Map;

public class ModeloFactory {

    private static Map<String,Modelo> modelos = new HashMap<>();

    public static Modelo getModelo(String nome, String marca){

        Modelo modelo = modelos.get(nome);
        if(modelo == null){
            modelo = new Modelo(nome, marca);
            modelos.put(nome,modelo);
        }
        return modelo;
    }

}
