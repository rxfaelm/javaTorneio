package GerenciadorDeTorneios;
import java.util.*;

public class Partida{
  private Time timeA;
  private Time timeB;
  private int pontosTimeA;
  private int pontosTimeB;

  public Partida(Time timeA, Time timeB, int pontosTimeA, int pontosTimeB){
    this.timeA = timeA;
    this.timeB = timeB;
    this.pontosTimeA = pontosTimeA;
    this.pontosTimeB = pontosTimeB;

    if(pontosTimeA > pontosTimeB){
      timeA.Vitoria();
      timeB.Derrota();
    }else if(pontosTimeB > pontosTimeA){
      timeB.Vitoria();
      timeA.Derrota();
    }
  }

  
    public Time getTimeA(){
      return timeA;
    }
    public Time getTimeB(){
      return timeB;
    }

    public int getPontosTimeA(){
      return pontosTimeA;
    }
    public int getPontosTimeB(){
      return pontosTimeB;
    }

     @Override
    public String toString(){
    return "Placar: " + pontosTimeA + " X " + pontosTimeB;
  }
}
