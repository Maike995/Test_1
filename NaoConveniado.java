
  
public class NaoConveniado extends Paciente {

    protected int numCartaoCredito;
    protected String bandeiraCartaoCredito;

  public Conveniado(int cpf, String nome, int numCartaoCredito, String bandeiraCartaoCredito){
    super(cpf, nome);
    this.numCartaoCredito = numCartaoCredito;
    this.bandeiraCartaoCredito = bandeiraCartaoCredito;
    
  }

  public int getNumCartaoCredito(){
    return numCartaoCredito;
  }
  public void setNumCartaoCredito(int numCartaoCredito){
    this.numCartaoCredito=numCartaoCredito;
  }

  public String getBandeiraCartaoCredito(){
    return bandeiraCartaoCredito;
  }
  public void setBandeiraCartaoCredito(String bandeiraCartaoCredito){
    this.bandeiraCartaoCredito=bandeiraCartaoCredito;
  }  

  public void print(); 
  public void agendarConsulta(String nomeEspecialidade, int numCartaoCredito , String bandeiraCartaoCredito);
  
}



