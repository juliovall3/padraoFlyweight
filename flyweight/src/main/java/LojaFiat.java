import java.util.ArrayList;
import java.util.List;

public class LojaFiat {

    public List<Veiculo> veiculo = new ArrayList<>();

    public void cadastrar (String tipoVeiculo, String nomeVeiculo, String marcaVeiculo){
        Modelo modelo = ModeloFactory.getModelo(nomeVeiculo,marcaVeiculo);
        Veiculo veiculo = new Veiculo(tipoVeiculo,modelo);
        veiculo.add(veiculo);
    }

    public List<String> obterVeiculo(){
        List<String> saida = new ArrayList<>();
        for (Veiculo veiculo:this.veiculo){
            saida.add(veiculo.obterVeiculo());
        }
        return saida;
    }

}
