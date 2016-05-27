package com.example.manana.a06_pedidopizza;

import java.io.Serializable;
import java.util.List;

/**
 * Created by manana on 26/5/16.
 */
public class Pizza implements Serializable {

    private List<String> ingredientes;

    public List<String> getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(List<String> ingredientes) {
        this.ingredientes = ingredientes;
    }

    @Override
    public String toString() {
        return "Pizza: ";
    }
}
