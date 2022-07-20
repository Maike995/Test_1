
public abstract class Transporte{

  protected String placa;
  protected int anoDeFabrica;
  protected int capacidade;
  
  public Transporte(String placa, int anoDeFabrica,int capacidade){
    this.placa=placa;
    this.anoDeFabrica=anoDeFabrica;
    this.capacidade=capacidade;
  }
  
  public String getPlaca(){
    return placa;
  }
  public void setPlaca(String placa){
    this.placa=placa;
  }

  public int getAnoDeFabrica(){
    return anoDeFabrica;
  }
  public void setAnoDeFabrica(int anoDeFabrica){
    this.anoDeFabrica=anoDeFabrica;
  }  

  public int getCapacidade(){
    return capacidade;
  }
  public void setCapacidade(int capacidade){
    this.capacidade=capacidade;
  }  

}

