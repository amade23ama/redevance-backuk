package sn.dscom.backend.database.entite;

import lombok.*;

import javax.persistence.*;
import java.util.Date;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "VEHICULE")
public class VehiculeEntity {
    @Id
    @Column(name = "IMMATRICULATION", unique = true, nullable = false, insertable = true, updatable = false)
    private  String immatriculation;
    /**
     * Id du Transporteur.
     */
    @ManyToOne
    @JoinColumn(name = "ID_TRANSPORTEUR", nullable = false)
    private TransporteurEntity transporteurEntity;
    @Column(name = "NOM")
    private  String nom;
    @Column(name = "VOLUME")
    private  Double volume;
    @Column(name ="DATECREATION")
    private Date dateCreation;
    @Column(name ="DATEMODIFICATION")
    private Date dateModification;

}
