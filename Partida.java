package GerenciadorDeTorneios;
import java.util.*;

public class Partida{
  private Time timeA;
  private Time timeB;
  private int ptA;
  private int ptB;

  public Partida(Time timeA, Time timeB, int ptA, int ptB){
    this.timeA = timeA;
    this.timeB = timeB;
    this.ptA = ptA;
    this.ptB = ptB;

    if(ptA > ptB){
      timeA.Vitoria();
      timeB.Derrota();
    }else if(ptB > ptA){
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

    public int getPtA(){
      return ptA;
    }
    public int getPtB(){
      return ptB;
    }

     @Override
    public String toString(){
    return "Placar: " + ptA + " X " + ptB;
  }
}