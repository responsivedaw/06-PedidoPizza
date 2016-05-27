package com.example.manana.a06_pedidopizza;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by manana on 26/5/16.
 */
public class PedidoService {

    private static Pedido pedido;

    public static Pedido getPedido(){
        return PedidoService.pedido;
    }


    // Metodo para popular los spinner de los ingredientes.
    public static List<String> getAllIngredientes(){

        List<String> ingredientes = new ArrayList<>();

        ingredientes.add("Jamon");
        ingredientes.add("Bacon");
        ingredientes.add("Atun");
        ingredientes.add("Aceitunas");
        ingredientes.add("Cebolla");
        ingredientes.add("Pimiento");
        ingredientes.add("Extra Queso");

        return ingredientes;
    }

}
