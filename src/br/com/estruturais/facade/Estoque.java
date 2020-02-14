package br.com.estruturais.facade;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Estoque {
    public void enviaProduto(String produto, String enderecoDeEntrega) {
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.DATE, 2);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
        String format = simpleDateFormat.format(calendar.getTime());
        System.out.println("O produto "+produto+" sera entregue no endereco "+enderecoDeEntrega+" ate as 18h do dia "+format);
    }
}
