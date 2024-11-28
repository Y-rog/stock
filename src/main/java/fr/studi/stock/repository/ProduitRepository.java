package fr.studi.stock.repository;

import fr.studi.stock.pojo.Produit;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProduitRepository extends JpaRepository<Produit, Long> {
}
