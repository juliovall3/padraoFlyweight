public class Modelo {

    private String nome;
    private String marca;

    public Modelo(String nome,String marca){
        this.nome=nome;
        this.marca= marca;
    }

    public String getNome(){
        return nome;
    }

    public String getMarca(){
        return marca;
    }
}
