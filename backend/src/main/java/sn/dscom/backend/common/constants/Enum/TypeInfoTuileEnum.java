package sn.dscom.backend.common.constants.Enum;

import lombok.Getter;

/**
 * Énumération de type info tuile.
 */
@Getter
public enum TypeInfoTuileEnum {

    /** En cours. */
    EN_COURS("EN.COURS"),
    /** En attente. */
    EN_ATTENTE("EN.ATTENTE"),
    /** En attente FAM. */
    EN_ATTENTE_FAM("EN.ATTENTE"),
    /** A faire. */
    A_FAIRE("A.FAIRE"),
    /** A viser. */
    VISER("VISER"),
    /** A instruire. */
    A_INSTRUIRE("A.INSTRUIRE");

    /**
     * Code de l'info tuile.
     */
    private final String code;

    /**
     * Constructeur
     * @param code code de l'info tuile.
     */
    TypeInfoTuileEnum(final String code) {
        this.code = code;
    }
}
