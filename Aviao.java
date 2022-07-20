public class Aviao extends Transporte{

  protected int numeroRodas;
  protected String marca;
  protected double velocidade;

public Aviao(String placa, int anoDeFabrica,int capacidade,int numeroRodas,String marca,double velocidade){
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

  public String toString(){
    return "O aviao da marca"+this.marca+" está com velocidade de "+this.velocidade+"km/h";
  }
}