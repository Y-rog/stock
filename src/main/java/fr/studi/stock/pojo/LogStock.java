package fr.studi.stock.pojo;

import fr.studi.stock.pojo.state.Action;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@Entity
@Table(name="log")
public class LogStock {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDateTime date;

    @Enumerated(EnumType.STRING)
    private Action action;

    private Long produit_id;

    private Integer quantite;

    public LogStock( LocalDateTime date, Action action, Long produit_id, Integer quantite) {
        this.date = date;
        this.action = action;
        this.produit_id = produit_id;
        this.quantite = quantite;
    }

    public LogStock() {

    }

}
