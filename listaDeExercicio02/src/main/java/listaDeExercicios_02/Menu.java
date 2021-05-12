/*
 
 */
package listaDeExercicios_02;
import java.util.Scanner;
/**
 *
 * @author jony_
 */
public class Menu {    
    
    Scanner input = new Scanner(System.in);
    ListaSimplesmenteEncadeada lista = new ListaSimplesmenteEncadeada();
    
    private int opcoes;

    public Menu() {
        
        System.out.println(
            "               == BEM VINDOS AO MENU == \n \n"+
            " Por favor, escolha uma das opções do menu para prosseguir...\n \n");
        startMenu();
    }      
    
    
    private void startMenu(){
        do {    
             System.out.println(
                    "\n"+ 
                    "                   ** MENU **\n" +
                    "\n" +
                    "               1 - Adicionar \n" +
                    "               2 - Remover Inicio \n" +
                    "               3 - Remover \n" +
                    "               4 - Esta vazio? \n" +
                    "               5 - Pesquisar \n" +                                   
                    "               6 - Imprimir \n" +
                    "               0 - Sair"
            );
             
            this.opcoes = input.nextInt();

            switch(opcoes){
                case 1: {
                    System.out.print("  digite o elemento a ser adicionado:  ");
                    lista.adicionar(input.nextInt());
                    break;
                }
                case 2: {
                    lista.removerInicio();
                    break;
                }
                case 3: {
                    lista.remover(input.nextInt());
                    break;
                }
                case 4: {
                    lista.estaVazio();
                    break;
                }
                case 5: {
                    System.out.println("digite o numero que deseja pesquisar: ");
                    lista.pesquisar(input.nextInt());
                    break;
                }
                case 6: {                    
                    lista.toString();
                    break;
                }                         
            }
            if(this.opcoes < 0 && this.opcoes > 6 ){
                    System.out.println(" opção invalida!! ");
                }
        }while(opcoes != 0);
        System.out.println("encerrando o programa...");
    }    
    
}
    

