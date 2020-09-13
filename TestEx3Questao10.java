/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testex3questao10;

import java.util.Scanner;

/**
 *
 * @author gabri
 */
public class TestEx3Questao10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic heres
        Scanner ler = new Scanner(System.in);
        String cc;
        String[] np = new String[50];
        int[] vp = new int[50];
        int cm = 0;
        do{
            cm++;
            int dd = 0;
            System.out.println("----  MENU PRINCIPAL");
            System.out.println("--[1] CADASTRAR PRODUTO");
            System.out.println("--[2] REMOVER PRODUTO");
            System.out.println("--[3] ATUALIZAR PRODUTO");
            System.out.println("--[4] LISTAR PRODUTOS");
            int menu = ler.nextInt();
            switch (menu) {
                case 1:
                    System.out.println("Qual o nome do produto?");
                    np[cm] = ler.nextLine();
                    System.out.println("Qual o valor do produto?");
                    vp[cm] = ler.nextInt();
                    break;
                case 2:
                    System.out.println("qual produto você quer remover?");
                do {
                    dd++;
                    System.out.println(dd + np[dd]);
                }while (dd == cm);
                    int c2 = ler.nextInt();
                    np[c2] = null;
                    System.out.println("Dados apagados com sucesso!");
                    break;
                case 3:
                    System.out.println("qual produto você quer atualizar?");
                do {
                    dd++;
                    System.out.println(dd + np[dd]);
                }while (dd == cm);
                    int c3 = ler.nextInt();
                    System.out.println("Qual o novo do produto?");
                    np[c3] = ler.nextLine();
                    System.out.println("Dados atualizados com sucesso!");
                    break;
                case 4:
                    do {
                    dd++;
                    System.out.println(dd + np[dd]);
                }while (dd == cm);
                    break;
        }
            System.out.println("Deseja voltar ao menu principal? {S/N} ");
            cc = ler.next();
        }while ("N".equals(cc));
        System.out.println("FINALIZANDO O PROGRAMA!");
    }
    
}
