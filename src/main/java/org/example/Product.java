package org.example;

import java.util.Objects;

//Schritt 1: Erstelle einen Record Product mit den benötigten Attributen.
public record Product( String name, int id) {

    /*
    //die Stückenzahl für dieses Produkt erhöhen
    public void addNewPiecesToThisProduct(int x){
        int numberOfPieces
    }
    //die Stückenzahl für dieses Produkt  reduzieren
    public void reduceTheNumberOfPiecesThisProduct(int x){

    }
    */

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return id == product.id && Objects.equals(name, product.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, id);
    }
}
