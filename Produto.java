public abstract class Produto {
  private int ID_produto;
  private double preco;

    public Produto(int ID_produto, double preco){
     this.preco=preco;
     this.ID_produto=ID_produto;
}
  public double getPreco() {
    return preco;
  }
  public int getID_produto() {
    return ID_produto;
  }
  public void setPreco(double preco) {
    this.preco = preco;
  }
  public void setID_produto(int ID_produto) {
    this.ID_produto = ID_produto;
  }
  public void exibirProduto(){
    System.out.println("\nPreço do produto:" + getPreco() + "\nCodigo do produto:" + getID_produto());

  }
}
