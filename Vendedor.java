public class Vendedor extends Pessoa{
  private double salario;

  public Vendedor(String nome,String cpf,String tel,double salario){
      super(nome, cpf, tel);
      this.salario = salario;
  }
    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }
    @Override
    public void exibirDados(){
        System.out.println("Nome do vendedor:" + getNome() + "CPF do vendedor:" + getCpf() + "Telefone do vendedor:" + getTel() + "Salario do vendedor:" + getSalario());
    }
}
