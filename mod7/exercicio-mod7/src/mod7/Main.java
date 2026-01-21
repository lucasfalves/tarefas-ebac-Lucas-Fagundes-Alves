package mod7;

public class Main {

    public static void main (String args[]){

        Carro carro = new Carro();
        carro.setCodigo(1);
        carro.setNome("Honda Civic");
        carro.setCor("Preto");

        System.out.println("Código: " + carro.getCodigo());
        System.out.println(carro.getNome());
        System.out.println(carro.getCor());
    }
}
