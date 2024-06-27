package ejercicio5;

import java.util.HashMap;
import java.util.Map;

public class Inventory {
    private Map<String, Integer> products;

    public Inventory(){
        products = new HashMap<>();
    }

    //Crear método añadir producto
    public void addProduct(String product, int quantity){
        products.put(product, products.getOrDefault(product, 0) + quantity);
    }

    //Crear metodo para vender el producto validando que tiene la cantidad que el cliente pide
    public void sellProduct(String product, int quantity)throws ProductNotAvailableException{
        if(!products.containsKey(product) || products.get(product)<quantity){
            throw new ProductNotAvailableException("Product not available or insufficient quantity");
        }
    }

    public int getProductQuantity(String product){
        return products.getOrDefault(product, 0);
    }
}
