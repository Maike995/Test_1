


public class Carro extends Transporte{

  protected int numeroRodas;
  protected String marca;
  protected double velocidade;

public Carro(String placa, int anoDeFabrica,int capacidade,int numeroRodas,String marca,double velocidade){
    super(placa,anoDeFabrica,capacidade);
    this.numeroRodas=numeroRodas;
    this.marca=marca;
    this.velocidade=velocidade;
  }
  
  public int getNumeroRodas(){
    return numeroRodas;
  }
  public void setNumeroRodas(int numeroRodas){
    this.numeroRodas=numeroRodas;
  }

  public String getMarca(){
    return marca;
  }
  public void setMarca(String marca){
    this.marca=marca;
  }  

  public double getVelocidade(){
    return velocidade;
  }
  public void setVelocidade(double velocidade){
    this.velocidade=velocidade;
  }  

  public void controlarVelocidade(double acelerar){
    this.velocidade += acelerar;
    
  }
   public void controlarVelocidade(double acelerar, double reduzir){
    this.velocidade += acelerar;
    this.velocidade += reduzir;
    
  }

  public String toString(){
    return "Carro da marca"+this.marca+" está com velocidade de "+this.velocidade+"km/h";
  }
  
}
