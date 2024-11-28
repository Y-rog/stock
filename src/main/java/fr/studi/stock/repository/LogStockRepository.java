package fr.studi.stock.repository;

import fr.studi.stock.pojo.LogStock;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LogStockRepository  extends JpaRepository<LogStock, Long> {
}
