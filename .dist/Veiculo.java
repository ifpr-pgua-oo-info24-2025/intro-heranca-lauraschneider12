public class Veiculo {

    private String marca;
    private String modelo;
    private Integer ano;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Integer getAno() {
        return ano;
    }

    public void setAno(Integer ano) {
        this.ano = ano;
    }

    public String exibirDetalhes(){
        return "veiculo"+marca+modelo+ano+"\n";
    }
    
    
}
