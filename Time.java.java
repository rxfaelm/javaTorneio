package GerenciadorDeTorneios;
import java.util.*;


public class Time{
  private String nomeTime;
  private int pontuacao;
  private int qtdDerrotas;
  private int qtdVitorias;

  public Time(String nomeTime){
    this.nomeTime = nomeTime;
    this.pontuacao = 0;
    this.qtdDerrotas = 0;
    this.qtdVitorias = 0;
  }

  public void Vitoria(){
    this.qtdVitorias++;
    this.pontuacao += 3;
  }

  public void Derrota(){
    this.qtdDerrotas++;
  }

  public String getNomeTime(){
    return nomeTime;
  }

  public int getPontuacao(){
    return pontuacao;
  }

  public int getQtdVitorias(){
    return qtdVitorias;
  }

  public int getQtdDerrotas(){
    return qtdDerrotas;
  }

  @Override
  public String toString(){
    return "Time: " +  nomeTime + "\t"+
     "Pontuação: " +  pontuacao + "\t"+
     "Vitórias: " +  qtdVitorias + "\t"+
     "Derrotas: " +  qtdDerrotas + "\t";
  }

}