import java.util.ArrayList;
import java.util.Arrays;

public class VeiculoTest {

    @Test
    void deveRetornarVeiculo(){
        LojaFiat lojafiat = new LojaFiat();
        lojafiat.cadastrar("Carro","Toro","Fiat");
        lojafiat.cadastrar("Carro","Doblo","Fiat");
        lojafiat.cadastrar("Carro","Palio","Fiat");

        List<String> saida = Arrays.asList(
                "Veiculo""Carro""Toro""Fiat",
                "Veiculo""Carro""Doblo""Fiat",
                "Veiculo""Carro""Palio""Fiat", );
        assertEquals(saida, lojafiat.obterVeiculo());
    }
}
