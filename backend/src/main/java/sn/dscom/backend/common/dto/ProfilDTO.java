package sn.dscom.backend.common.dto;
import jakarta.persistence.Column;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@RequiredArgsConstructor
public class ProfilDTO {
    private String code;
    private String libelle;
}
