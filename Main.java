import org.w3c.dom.CDATASection;

import java.util.Date;
public class Main {
    public static void main(String[] args) {
        //Criando o cliente
        Cliente cliente01 = new Cliente("Gabriel","135.543.23.12","(31)97675434","Rua B,12");
        //Criando o vendedor
        Vendedor vendedor01 = new Vendedor("Kevin","123.456.90.00","(31)99878423",2000);
        // Criando as camisas
        Camisa camisa01 = new Camisa(001, 150.00, "Cruzeiro", "P");
        Camisa camisa02 = new Camisa(002, 120.00, "Flamengo", "G");
        // Adicionando produtos no estoque
        Estoque estoque = new Estoque();
        estoque.adicionarProduto(camisa01, 10);
        estoque.adicionarProduto(camisa02, 5);

        // Criando carrinho e adicionando itens
        Carrinho carrinho = new Carrinho();
        carrinho.adicionarItem(new ItemVenda(camisa01, 2));
        carrinho.adicionarItem(new ItemVenda(camisa02, 1));
        camisa01.exibirProduto();
        camisa02.exibirProduto();


        // Escolhendo forma de pagamento
        FormaPagamento formaPagamento = new PagamentoCartao();
        System.out.println("*** Pagamento realizado com sucesso no cartão *** ");

        // Realizando a venda
        Venda venda = new Venda(cliente01,vendedor01,formaPagamento,carrinho);
        venda.vender();



    }
    }
