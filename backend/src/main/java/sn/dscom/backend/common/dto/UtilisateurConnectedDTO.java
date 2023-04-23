package sn.dscom.backend.common.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.security.core.GrantedAuthority;

import java.util.ArrayList;
import java.util.Collection;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UtilisateurConnectedDTO {
    private String id;
    private String login;
    private String prenom;
    private String nom;
    private String email;
    @Builder.Default
    private Collection<? extends GrantedAuthority> authorities = new ArrayList<>();
}
