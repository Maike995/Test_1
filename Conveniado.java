
  
public class Conveniado extends Paciente{

  protected int numeroConvenio;
  protected String nomeConvenio;

  public Conveniado(int cpf, String nome, int numeroConvenio, String nomeConvenio){
    super(cpf, nome);
    this.numeroConvenio = numeroConvenio;
    this.nomeConvenio = nomeConvenio;
    
  }

  public int getNumeroConvenio(){
    return numeroConvenio;
  }
  public void setNumeroConvenio(int numeroConvenio){
    this.numeroConvenio=numeroConvenio;
  }

  public String getNomeConvenio(){
    return nomeConvenio;
  }
  public void setNomeConvenio(String nomeConvenio){
    this.nomeConvenio=nomeConvenio;
  }  


  public void print(){
    System.out.println("PACIENTE: "+nome+" - Convênio "+nomeConvenio);
    System.out.println("          "+nome+" - Convênio "+nomeConvenio);
  } 
  public void agendarConsulta(String nomeEspecialidade, int numeroConvenio, String nomeConvenio);
}

Segue modelo de impressão:

PACIENTE: ANA MARIA DIAS DANTAS - CONVÊNIO UNIMED 
          DERMATOLOGISTA - 22/01/2023

PACIENTE: ANA PAULA SÁ DA SILVA - SEM CONVÊNIO 
	  CARDIOLOGISTA  - 15/03/2023 - R$ 200,00
