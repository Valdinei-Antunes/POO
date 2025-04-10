package Exercicio_01;

import java.util.Scanner;

public class Main {

        public static void main(String []args){

            Scanner sc =  new Scanner(System.in);

            Pessoa p1 = new Pessoa();

            System.out.println("---------- Digite suas informações -----------");

            System.out.print("Digite seu nome: ");
            p1.setNome(sc.next());

            System.out.print("Digite seu cpf: ");
            p1.setCpf(sc.next());

            System.out.print("Digite sua idade: ");
            p1.setIdade(sc.nextInt());

            System.out.print("Digite seu sexo: ");
            p1.setSexo(sc.next());

            System.out.print("Digite seu salário: ");
            p1.setSalario(sc.nextDouble());
            
            System.out.println("--------- Suas informações ---------- ");
            System.out.println("Nome: " + p1.getNome() + " | " + " Cpf: " + p1.getCpf() + " | " + "Idade: " + p1.getIdade() + " | " + "Sexo: " + p1.getSexo() + " | " + "Salário: " + p1.getSalario());
        }
}