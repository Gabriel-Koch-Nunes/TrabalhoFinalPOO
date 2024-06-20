import java.util.HashMap;
import java.util.Map;

public class Estoque {
    private Map<Produto, Integer> produtos;

    public Estoque() {
        this.produtos = new HashMap<>();
    }

    public void adicionarProduto(Produto produto, int quantidade) {
        produtos.put(produto, produtos.getOrDefault(produto, 0) + quantidade);
    }

    public void removerProduto(Produto produto, int quantidade) {
        if (produtos.containsKey(produto) && produtos.get(produto) >= quantidade) {
            produtos.put(produto, produtos.get(produto) - quantidade);
            if (produtos.get(produto) == 0) {
                produtos.remove(produto);
            }
        } else {
            System.out.println("Quantidade insuficiente no estoque.");
        }
    }

    public int verificarEstoque(Produto produto) {
        return produtos.getOrDefault(produto, 0);
    }
}
