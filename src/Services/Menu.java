package Services;

import java.util.Scanner;

public abstract class Menu {

    private static Scanner entrada = new Scanner(System.in);
    private static String in = "";

    public static String GetAcronym(int n){
        if(n == 1) return "ARS";
        if(n == 2) return "BOB";
        if(n == 3) return "BRL";
        if(n == 4) return "CLP";
        if(n == 5) return "COP";
        if(n == 6) return "USD";

        return "BRL";
    }

    public static int Choices(){
        System.out.println("""
                    -*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*
                    
                        Olá, bem vindo ao conversor de moedas!
                    As seguintes conversões estão disponíveis:
                        1 - ARS (Peso argentino)
                        2 - BOB (Boliviano boliviano)
                        3 - BRL (Real brasileiro)
                        4 - CLP (Peso chileno)
                        5 - COP (Peso colombiano)
                        6 - USD (Dólar americano)
                        0 - SAIR
                    -*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*
                    -*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*
                    
                      --  Escolha o NÚMERO da sua moeda atual ou 0 para sair:
                      Exemplo: 5
                      
                    -*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*
                      
                    """);

        in = entrada.nextLine();
        int choose = 0;

        try{
            choose = Integer.valueOf(in);
            if (choose == 0) return 0;
        } catch (Exception e){
            return 0;
        }

        return choose;
    }

    public static double Value(){
        System.out.println("""
                    -*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*
                    
                    Digite o valor NUMERAL que deseja converter: 
                    Exemplo: 576,44
                    
                    -*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*
                    """);

        in = entrada.nextLine();
        double value = 0.0;
        try{
            value = Integer.valueOf(in);
        } catch (Exception e){
            System.out.println("""
                        -*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*
                        
                        !!!!!! VALOR INVÁLIDO !!!!!!
                        
                        -*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*
                        """);

            return 0.0;
        }

        return value;
    }
}
