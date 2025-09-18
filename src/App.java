import java.time.LocalDate;

public class App {
    public static void main(String[] args) throws Exception {
        Produto produto1 = new Produto();
        produto1.setNome("Maçã");
        produto1.setMarca("Maçãzera");
        produto1.setPreco(2.30);
        produto1.setQtde(6);

        Produto produto2 = new Produto();
        produto2.setNome("Tomate");
        produto2.setMarca("Tomatezera");
        produto2.setPreco(1.29);
        produto2.setQtde(3);


        Venda venda1 = new Venda();
        venda1.setNumeroVenda("58535");
        venda1.setProduto(produto2);
        venda1.setDataVenda(LocalDate.now());



        System.out.println();
        System.out.println();
    }
}