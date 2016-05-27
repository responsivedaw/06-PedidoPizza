package com.example.manana.a06_pedidopizza;

import java.io.Serializable;
import java.util.List;

/**
 * Created by manana on 26/5/16.
 */
public class Pedido implements Serializable {

    private List<Pizza> pedido;

    public List<Pizza> getPedido() {
        return pedido;
    }

    public void setPedido(List<Pizza> pedido) {
        this.pedido = pedido;
    }
}
