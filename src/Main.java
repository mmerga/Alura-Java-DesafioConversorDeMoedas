import Services.ConvertCoin;
import Services.HttpClientExchangeRate;
import Services.Menu;

public class Main {
    public static void main(String[] args) {

        do{
            int choice  = Menu.Choices();
            if(choice == 0) break;
            String coin = Menu.GetAcronym(choice);
            double value = Menu.Value();

            HttpClientExchangeRate.getAsync(coin)
                    .thenAccept(response -> {
                        ConvertCoin.convert(value,coin, response.getConversionRates());
                    })
                    .join();
        }while(true);
    }
}

