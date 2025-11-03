package Intermediate.Records;

import java.util.Locale;

public record NinjaRecord(String name, String email, Integer telephone) {
    //pegadinhas:
    /*
    /o record todos os atributos são final
     */
    //posso criar metodos em records
    public String emailCommercial(){
        return email.toUpperCase();
    }
}
