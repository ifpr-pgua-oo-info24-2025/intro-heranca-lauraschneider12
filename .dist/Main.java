


public class Main {
    public static void main(String[] args) {
     Carro carro1 = new Carro();
     Moto moto1 = new Moto();

     carro1.setMarca("ford");
     carro1.setModelo("K");
     carro1.setAno(2009);
     carro1.setNumeroDePortas(4);
     carro1.exibirDetalhes();

     moto1.setMarca("A");
     moto1.setModelo("A");
     moto1.setAno(2009);
     moto1.setTipoDeGuidao("A");
     moto1.exibirDetalhes();



    }
}