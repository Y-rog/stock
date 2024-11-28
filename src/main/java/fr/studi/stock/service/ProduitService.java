package fr.studi.stock.service;

import fr.studi.stock.pojo.Produit;
import jakarta.validation.Valid;

import java.util.List;

public interface ProduitService {

    List<Produit> getAllProduit();

    void createProduit(@Valid Produit produit);

    void updateProduit(Long id, Produit produit);

    Produit getProduitById(Long id);

    void deleteProduitById(Long id);

    void updateProduitQuantity(Long produitId, Integer quantite);
}
