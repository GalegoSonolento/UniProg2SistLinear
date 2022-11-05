package exer1.aplicacao;

import java.io.Serializable;
// Serializable é usada quando se quer gravar em disco ou trafegar em rede
public class Product implements Serializable { // Serializable é uma interface de geração de séries de bits - pode ser usada para leitura ou geração de arquivos de texto pelo código
    private String name;
    private double price;
    private Integer quantity;

    public Product() {
    }

    public Product(String name, double price, Integer quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
}
