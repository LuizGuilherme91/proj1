import java.time.LocalDate;

public class Venda {
    private LocalDate dataVenda;
    private Produto produto;
    private String numeroVenda;

    
    public LocalDate getDataVenda() {
        return dataVenda;
    }
    public void setDataVenda(LocalDate dataVenda) {
        this.dataVenda = dataVenda;
    }
    public Produto getProduto() {
        return produto;
    }
    public void setProduto(Produto produto) {
        this.produto = produto;
    }
    public String getNumeroVenda() {
        return numeroVenda;
    }
    public void setNumeroVenda(String numeroVenda) {
        this.numeroVenda = numeroVenda;
    }

    
}
