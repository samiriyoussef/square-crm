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
package com.square.core.model.dto;

import java.io.Serializable;

/**
 * Critères de recherche pour les tables de dimension des regimes.
 * @author Anthony GUILLEMETTE (anthony.guillemette@scub.net) - SCUB
 */
public class DimensionCriteresRechercheRegimeDto implements Serializable {

    /** Serial Version uid. */
    private static final long serialVersionUID = 5183999931902723193L;

    /** Criteres de recherche sur les dimensions. */
    private DimensionCriteresRechercheDto dimensionCriteres;

    /**
     * Indique si on recherche les dimensions visibles pour certains applicatifs.
     * true on recherche les éléments visible
     * false les éléments non visibles
     * null pas de recherche sur la visibilité.
     */
    private Boolean visibleApplicatif;

    /**
     * Get the dimensionCriteres value.
     * @return the dimensionCriteres
     */
    public DimensionCriteresRechercheDto getDimensionCriteres() {
        return dimensionCriteres;
    }

    /**
     * Set the dimensionCriteres value.
     * @param dimensionCriteres the dimensionCriteres to set
     */
    public void setDimensionCriteres(DimensionCriteresRechercheDto dimensionCriteres) {
        this.dimensionCriteres = dimensionCriteres;
    }

    /**
     * Get the visibleApplicatif value.
     * @return the visibleApplicatif
     */
    public Boolean getVisibleApplicatif() {
        return visibleApplicatif;
    }

    /**
     * Set the visibleApplicatif value.
     * @param visibleApplicatif the visibleApplicatif to set
     */
    public void setVisibleApplicatif(Boolean visibleApplicatif) {
        this.visibleApplicatif = visibleApplicatif;
    }

}
