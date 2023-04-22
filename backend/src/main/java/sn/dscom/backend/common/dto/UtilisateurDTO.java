package sn.dscom.backend.common.dto;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import sn.dscom.backend.database.entite.DepotEntity;
import sn.dscom.backend.database.entite.ProfilEntity;

import javax.validation.constraints.Size;
import java.util.Date;
import java.util.List;
import java.util.Set;

@Getter
@Setter
@RequiredArgsConstructor
public class UtilisateurDTO {
    //todo
    private Long id;
    private String prenom;
    private String nom;
    private String email;
    private String login;
    private String password;
    private String telephone;
    private Date dateCreation;
    private Date dateModif;
    private boolean active;
    private List<ProfilDTO> profilsDTO;
    private List<DepotDTO> depotEntityListDTO;
}
