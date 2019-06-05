package javanopolis;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Javanopolis {

    static int tipo;
    static String prop;
    static String endereco;
    static double area;
    static int ano;
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        ArrayList<Casa> casas = new ArrayList<Casa>();

        System.out.println("MENU");
        System.out.println(" 1 - cadastrar imovel \n 2 - excluir imovel \n 3 - valor anual do IPTU\n 4 - lista de imoveis");
        int menu = input.nextInt();

        if (menu == 1) {
            System.out.println("qual o tipo de imovel? \n 1 - casa \n 2 - casa de condominio"
                    + "\n 3 - apartamento \n 4 - comercial");
            tipo = input.nextInt();
            input.nextLine();

            if (tipo == 1) {
                pegaInfoCasa();
                Casa casa = new Casa(ano, area, prop, endereco);
                casas.add(casa);
                casa.iptuCasa();
            } else if (tipo == 2) {
                pegaInfoCasa();
                System.out.println("Nome do condominio:");
                String nomeCond = input.nextLine();
                Cond cond = new Cond(ano, area, prop, endereco, nomeCond);
                casas.add(cond);
                cond.iptuCond();
            } else if (tipo == 3) {
                pegaInfoCasa();
                System.out.println("Qual o andar?");
                int andar = input.nextInt();
                input.nextLine();
                Apto apto = new Apto(andar, ano, area, prop, endereco);
                casas.add(apto);
                apto.iptuApto();
            } else if (tipo == 4) {
                pegaInfoCasa();
                Comercial comer = new Comercial(ano, area, prop, endereco);
                casas.add(comer);
                comer.iptuComercial();
            }
        } else if (menu == 2) {

            for (int i = 0; i < casas.size(); i++) {
                System.out.println(casas.get(i).getProp());
                if (casas.get(i) instanceof Casa) {
                    System.out.println(i + " - proprietario: " + casas.get(i).getProp());
                    System.out.println("digite o numero do proprietario:");
                    int escolha = input.nextInt();
                    casas.remove(escolha);
                }
            }


        } else if (menu == 3) {
            System.out.println("qual o tipo de imovel? \n 1 - casa \n 2 - casa de condominio"
                    + "\n 3 - apartamento \n 4 - comercial");
            tipo = input.nextInt();
            input.nextLine();

            if (tipo == 1) {
                for (int i = 0; i < casas.size(); i++) {
                    if (casas.get(i) instanceof Casa) {
                        Casa aux = (Casa) casas.get(i);
                        aux.iptuCasa();
                    }
                }

            } else if (tipo == 2) {
                for (int i = 0; i < casas.size(); i++) {
                    if (casas.get(i) instanceof Cond) {
                        Cond aux = (Cond) casas.get(i);
                        aux.iptuCond();
                    }
                }

            } else if (tipo == 3) {
                for (int i = 0; i < casas.size(); i++) {
                    if (casas.get(i) instanceof Apto) {
                        Apto aux = (Apto) casas.get(i);
                        aux.iptuApto();
                    }
                }

            } else if (tipo == 4) {
                for (int i = 0; i < casas.size(); i++) {
                    if (casas.get(i) instanceof Comercial) {
                        Comercial aux = (Comercial) casas.get(i);
                        aux.iptuComercial();
                    }
                }

            }
        } else {
            Collections.sort(casas);
            for (int i = 0; i < casas.size(); i++) {
                System.out.println(casas.get(i).getArea());
                System.out.println(casas.get(i).getProp());
                System.out.println(casas.get(i).getTipo());
            }
        }
    }

    public static void pegaInfoCasa() {
        System.out.println("Quem eh o proprietario?");
        prop = input.nextLine();

        System.out.println("Qual o ano do imovel?");
        ano = input.nextInt();
        input.nextLine();

        System.out.println("Qual a area do imovel?");
        area = input.nextDouble();
        input.nextLine();

        System.out.println("Informe o endereco");
        endereco = input.nextLine();
    }

}
