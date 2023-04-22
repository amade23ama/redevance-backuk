package sn.dscom.backend.common.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDateTime;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class FichierDTO implements Serializable {

    /**
     * The Constant serialVersionUID.
     */
    private static final long serialVersionUID = 1L;

    /**
     * Identifiant du fichier.
     */
    private Long id;

    /**
     * The nom.
     */
    private String nom;

    /**
     * The extension.
     */
    private String extension;

    /**
     * Attribut définissant la date de création du document.
     */
    private LocalDateTime dateCreation;

    /**
     * The content.
     */
    private byte[] content;
}
