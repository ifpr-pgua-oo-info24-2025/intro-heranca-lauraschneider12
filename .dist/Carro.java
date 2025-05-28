public class Carro  extends Veiculo{

    private Integer numeroDePortas;

    public Integer getNumeroDePortas() {
        return numeroDePortas;
    }

    public void setNumeroDePortas(Integer numeroDePortas) {
        this.numeroDePortas = numeroDePortas;
    }
    
    public String exibirDetalhes(){
        super.exibirDetalhes();
        return "O carro tem"+numeroDePortas+"portas";
    }
}
