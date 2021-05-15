/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listaDeExercicios_02;

/*
 * Faculdade ELO
 * Disciplina: Algoritmos e Estruturas de Dados
 * Professor: João Ferreira
 * aluno: Jonatas S. da Silva
 */
public class ListaSimplesmenteEncadeada {
    
    private No inicio;

    public ListaSimplesmenteEncadeada() {        
        this.inicio = null;       
    }    
    
     public void adicionar(int elemento){
        No novoNo = new No();
        novoNo.setElemento(elemento);
        
        if(this.inicio == null){
            this.inicio = novoNo;
        }
        else{
            No auxiliar = this.inicio;
            while(auxiliar.getProximo() != null ){
                auxiliar = auxiliar.getProximo();
            }             
        auxiliar.setProximo(novoNo);
        }
     }
    
    public void removerInicio(){
        if(this.inicio == null){
            System.out.println("A lista está vazia.");
        }
        else{
            this.inicio = this.inicio.getProximo();
        }
    } 
   
    public void remover(int elemento){
        if(this.inicio == null){
            System.out.println("A lista está vazia.");
        }
        else if(pesquisar(elemento)){
            if(this.inicio.getElemento() == elemento){
                this.inicio = this.inicio.getProximo();
            }else{
                No auxiliar1 = this.inicio;
                No auxiliar2 = this.inicio.getProximo();
                
                while(auxiliar2.getElemento() != elemento){
                    auxiliar1 = auxiliar2;
                    auxiliar2 = auxiliar2.getProximo();
                }
            auxiliar1.setProximo(auxiliar2.getProximo());
                System.out.println("o elemento " + elemento + " foi removido.");
            }
        }
    }
    
    public boolean estaVazio(){
        return (this.inicio == null);
    } 
    
    public boolean pesquisar(int elemento){
        boolean retorno = false;
        if(this.inicio == null){
            System.out.println("A lista está vazia.");            
        }        
        else{
            No auxiliar = this.inicio;
            do{
                if(auxiliar.getElemento() == elemento){
                    retorno = true;
                }
                else{
                    auxiliar = auxiliar.getProximo();
                }
            }while(auxiliar != null);            
        }
        return retorno;
    }
    
    @Override
    public String toString(){
        String print = "";
        if(this.inicio == null){
            print = "lista vazia.";            
        }
        else{
            No auxiliar = inicio;
            while(auxiliar != null){
                print += auxiliar.getElemento() + ", ";
                auxiliar = auxiliar.getProximo();
            }
        }
    return print;    
    }   
}
