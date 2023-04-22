package sn.dscom.backend.common.dto;
import jakarta.persistence.Column;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Getter
@Setter
@RequiredArgsConstructor
public class SiteDTO {
    //todo
    private Long id;
    private  String nom;
    private  String localite;
    private Date dateCreation;
    private Date dateModification;
}
