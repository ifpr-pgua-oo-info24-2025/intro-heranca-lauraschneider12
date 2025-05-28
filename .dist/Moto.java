public class Moto extends Veiculo{

    private String TipoDeGuidao;

    public String getTipoDeGuidao() {
        return TipoDeGuidao;
    }

    public void setTipoDeGuidao(String TipoDeGuidao) {
        this.TipoDeGuidao = TipoDeGuidao;
    }

    public String exibirDetalhes(){
        super.exibirDetalhes();
        return "Tipo de guidao"+TipoDeGuidao;

    }
    
    
}
