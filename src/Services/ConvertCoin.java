package Services;

import Domain.Models.ConversionRates;

public abstract class ConvertCoin {
    public static void convert(double currentValue, String currentCoin, ConversionRates conversionRates){
        double ars = currentValue * conversionRates.getArs();
        double bob = currentValue * conversionRates.getBob();
        double brl = currentValue * conversionRates.getBrl();
        double clp = currentValue * conversionRates.getClp();
        double cop = currentValue * conversionRates.getCop();
        double usd = currentValue * conversionRates.getUsd();

        System.out.println("""
                 -*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*
                    - Segue Atual Conversão de %.2f %S :
                 || ARS = %.2f     ||     BOB = %.2f      ||     BRL = %.2f
                 || CLP = %.2f     ||     COP = %.2f      ||     USD = %.2f
                 -*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*
                """.formatted(currentValue, currentCoin, ars, bob, brl, clp, cop, usd));
    }
}
