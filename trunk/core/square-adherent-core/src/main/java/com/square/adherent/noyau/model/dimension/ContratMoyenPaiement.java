/*
 * This file is a part of Square, Customer Relationship Management Software for insurance's companies
 * Copyright (C) 2010-2012  SCUB <square@scub.net> - Mutuelle SMATIS FRANCE  <square@smatis.fr >
 * 
 * This program is free software; you can redistribute it and/or modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; either version 2 of the License, or (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License along with this program; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301, USA.
 */
package com.square.adherent.noyau.model.dimension;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Modèle du moyen de paiement d'un contrat.
 * @author Nicolas PELTIER (nicolas.peltier@scub.net) - SCUB
 */
@Entity
@Table(name = "DIM_CONTRAT_MOYEN_PAIEMENT")
@AttributeOverrides({
    @AttributeOverride(name = "id", column = @Column(name = "CONTRAT_MOYEN_PAIEMENT_UID", nullable = false, unique = true)),
    @AttributeOverride(name = "libelle", column = @Column(name = "CONTRAT_MOYEN_PAIEMENT_LIB", unique = false)),
    @AttributeOverride(name = "ordre", column = @Column(name = "CONTRAT_MOYEN_PAIEMENT_ORDRE", nullable = false)),
    @AttributeOverride(name = "visible", column = @Column(name = "CONTRAT_MOYEN_PAIEMENT_VISIBLE", nullable = false))
})
public class ContratMoyenPaiement extends ModelDim {

    /** Identificateur de sérialisation. */
    private static final long serialVersionUID = -6594158808158583650L;

    /** EID. */
    @Column(name = "CONTRAT_MOYEN_PAIEMENT_EID")
    private String identifiantExterieur;

    @Override
    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ContratMoyenPaiement)) {
            return false;
        }
        return equalsUtil(other);
    }

    /**
     * {@inheritDoc}.
     */
    @Override
    public int hashCode() {
        return super.hashCode();
    }

    /**
     * Get the identifiantExterieur value.
     * @return the identifiantExterieur
     */
    public String getIdentifiantExterieur() {
        return identifiantExterieur;
    }

    /**
     * Set the identifiantExterieur value.
     * @param identifiantExterieur the identifiantExterieur to set
     */
    public void setIdentifiantExterieur(String identifiantExterieur) {
        this.identifiantExterieur = identifiantExterieur;
    }
}
