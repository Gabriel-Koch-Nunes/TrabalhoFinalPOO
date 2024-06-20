import java.util.Date;

public class Venda {
    private Cliente cliente;
    private Vendedor vendedor;
    private FormaPagamento formaPagamento;
    private Carrinho carrinho;
    private Date data;

    public Venda(Cliente cliente,Vendedor  vendedor,FormaPagamento formaPagamento,Carrinho carrinho){
        this.carrinho=carrinho;
        this.cliente=cliente;
        this.vendedor=vendedor;
        this.formaPagamento=formaPagamento;
        this.data=data;

    }
    public void vender(){
        System.out.println("\nA venda foi realizada pelo cliente:" + cliente.getNome() + "\nVendedor:" + vendedor.getNome());
        System.out.println("Itens vendidos na loja:" );
        for(ItemVenda item : carrinho.getItens()){
            item.getProduto();
        }
        System.out.println("\nForma de pagamento:" + formaPagamento.getDescricao());


    }
}
