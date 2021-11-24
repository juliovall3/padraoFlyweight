public class Veiculo {

    private String tipo;
    private Modelo modelo;


    public Veiculo(String tipo, Modelo modelo){
        this.tipo=tipo;
        this.modelo=modelo;
    }

    public String obterVeiculo(){
        return "Veiculo"+ this.tipo + modelo.getNome() + modelo.getMarca();
    }


}
