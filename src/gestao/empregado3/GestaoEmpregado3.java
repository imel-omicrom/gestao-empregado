
package gestao.empregado3;

import java.util.Scanner;

public class GestaoEmpregado3 {
    
    static Empregado [] bancoDeDados = new Empregado[3];
    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {
        menu();  
    }
    
    public static void menu() {
        int opcao;
        do {            
            System.out.println("BEM AO IMEL\n"
                + "1 - CADASTRO\n"
                + "2 - LISTAR\n"
                + "0 - SAIR\n"
                + "ESCOLHA UMA OPCAO: ");
        
            opcao = teclado.nextInt();
            
            switch(opcao) {
                case 0:
                    break;
                case 1: cadastro();
                    break;
                case 2: listar();
                    break;
                default: System.out.println("OPCAO INVALIDA...");
            }
        
        } while (opcao != 0);
    }

    public static void cadastro() {
        
        int saberPosicao = saberPosicaoNoBanco();
        
        if(saberPosicao >= 0) {
            Empregado empregado = new Empregado();
        
            System.out.print("Digite o ID: ");
            int id = teclado.nextInt();
        
            System.out.print("Digite o Nome: ");
            String nome = teclado.next();
        
            empregado.id = id;
            empregado.nome = nome;
            
            bancoDeDados[saberPosicao] = empregado;
        } else {
            System.out.println("LISTA DO BANCO CHEIA");
        }
        
    }
    
    public static int saberPosicaoNoBanco() {
        for(int i = 0; i < bancoDeDados.length; i++) {
            if(bancoDeDados[i] == null)
                return i;
        }
        return -1;
    }
    
    public static void listar() {
        for(int i = 0; i < bancoDeDados.length; i++) {
            System.out.println(bancoDeDados[i]);
        }
    }
}
