//Autora: Gabrielli Danker

import java.util.ArrayList;
import java.util.List;


public class Floricultura {
    private List<Flor> listaFlores;

    public Floricultura(){
        listaFlores = new ArrayList<>();
    }

    public void adicionarFlor(Flor flor){
        listaFlores.add(flor);
    }

    public Flor florMaisCara(){
        if (listaFlores.isEmpty()){
            return null;
        }
        Flor maisCara = listaFlores.get(0);
        for(Flor flor : listaFlores){
            if(flor.getPreco() > maisCara.getPreco()){
                maisCara = flor;
            }
        }
        return maisCara;
    }

    public double  paraPresenteSim(){
        double receita = 0;
        for(Flor flor : listaFlores){
            if(flor.paraPresente()){
                receita += flor.getPreco();
            }
        }
        return receita;
    }

    public double  naoParaPresente(){
        double receita = 0;
        for(Flor flor : listaFlores){
            if(!flor.paraPresente()){
                receita += flor.getPreco();
            }
        }
        return receita;
    }

    public void imprimirFlores(){
        for(Flor flor : listaFlores){
            System.out.println(flor);
        }
    }
   
}

