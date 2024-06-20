public abstract class Pessoa {
  private  String nome;
  private  String cpf;
   private String tel;

    public Pessoa(String nome, String cpf, String tel){
        this.nome = nome;
        this.cpf=cpf;
        this.tel=tel;
    }
    public String getNome(){
        return nome;
    }
    public String getCpf(){
        return cpf;
    }
    public String getTel(){
        return tel;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setCpf(String cpf){
        this.cpf=cpf;
    }
    public void setTel(String tel){
        this.tel=tel;
    }
    public  void exibirDados(){
        System.out.println("Nome:" + getNome() + "CPF:" + getCpf() + "Telefone:" + getTel());
    }

}
