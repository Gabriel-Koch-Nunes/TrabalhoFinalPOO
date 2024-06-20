import java.util.ArrayList;
import java.util.List;

public class Carrinho {
    private List<ItemVenda> itens;

    public  Carrinho(){
        this.itens = new ArrayList<>();
    }
    public void adicionarItem(ItemVenda item){
        itens.add(item);
    }
    public void removerItem(ItemVenda item){
        itens.remove(item);
    }
    public List<ItemVenda> getItens(){
        return itens;
    }
}
