public class Cliente extends Pessoa{
  private String endereco;

  public Cliente(String nome,String cpf,String tel,String endereco){
      super(nome, cpf, tel);
      this.endereco=endereco;
  }
  public String getEndereco(){
      return endereco;
  }
  public void setEndereco(String endereco){
      this.endereco=endereco;
  }
  @Override
    public void exibirDados(){
      System.out.println("Nome do cliente:" + getNome() + "CPF do cliente:" + getCpf() + "Telefone do cliente:" + getTel() + "Endereço do cliente:" + getEndereco());
  }
}
