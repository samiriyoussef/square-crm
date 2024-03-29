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
package com.square.composant.tarificateur.square.client.service;

import com.google.gwt.user.client.rpc.AsyncCallback;
import com.square.composant.tarificateur.square.client.model.age.AgeModel;
import com.square.composant.tarificateur.square.client.model.age.DateCalculAgeModel;
import com.square.composant.tarificateur.square.client.model.opportunite.InfosOpportuniteModel;
import com.square.composant.tarificateur.square.client.model.opportunite.devis.ligne.LigneDevisModel;
import com.square.composant.tarificateur.square.client.model.personne.PersonneModel;
import com.square.composant.tarificateur.square.client.model.selecteur.SelecteurProduitModel;

/**
 * Interface pour les appels asynchrones des services liés aux devis.
 * @author Nicolas PELTIER (nicolas.peltier@scub.net) - SCUB
 * @author Anthony GUILLEMETTE (anthony.guillemette@scub.net) - SCUB
 */
public interface SelecteurProduitServiceGwtAsync {
    /**
     * Retourne un objet selecteur du produit à partir d'une produit et d'un devis pour construire l'IHM.
     * @param idProduit l'identifiant du produit
     * @param idDevis l'identifiant du devis (null si nouveau devis)
     * @param nouvellePersonnePrincipale la nouvelle personne principale (utilisée pour un nouveau devis)
     * @param callback l'objet de retour asynchrone
     */
    void getSelecteurParProduit(Integer idProduit, Long idDevis, final PersonneModel nouvellePersonnePrincipale,
        AsyncCallback<SelecteurProduitModel> callback);

    /**
     * Recuperer un objet selecteur du produit à partir d'une ligne de devis.
     * @param idLigneDevis l'identifiant de la ligne
     * @param idDevis l'identifiant du devis
     * @param callback l'objet de retour asynchrone
     */
    void getSelecteurProduitParLigneDevis(final Long idLigneDevis, Long idDevis, AsyncCallback<SelecteurProduitModel> callback);

    /**
     * Recuperer un objet selecteur du produit pour un adherent.
     * @param idDevis l'identifiant du devis associé (pour ajout ou modification d'une ligne de devis)
     * @param produitAia le produitAia
     * @param garantieAia la garantieAia
     * @param nouvellePersonnePrincipale la nouvelle personne principale (utilisée pour un nouveau devis)
     * @param callback l'objet de retour asynchrone
     */
    void getSelecteurProduitParProduitsAdherent(Long idDevis, String produitAia, String garantieAia, final PersonneModel nouvellePersonnePrincipale,
        AsyncCallback<SelecteurProduitModel> callback);

    /**
     * Ajouter une ligne de devis à partir d'un objet selecteur du produit.
     * @param selecteurProduit objet selecteur du produit
     * @param callback l'objet de retour asynchrone
     */
    void addLigneDevisParSelecteurProduit(SelecteurProduitModel selecteurProduit, AsyncCallback<LigneDevisModel> callback);

    /**
     * Ajouter une ligne de devis à partir d'un objet selecteur du produit.
     * @param selecteurProduit objet selecteur du produit
     * @param infosOpportunite les infos de l'opportunité pour creer le devis
     * @param callback l'objet de retour asynchrone
     */
    void addLigneDevisParSelecteurProduit(SelecteurProduitModel selecteurProduit, InfosOpportuniteModel infosOpportunite,
        AsyncCallback<LigneDevisModel> callback);

    /**
     * Modifie une ligne de devis à partir d'un objet selecteur du produit.
     * @param selecteurProduit objet selecteur du produit
     * @param callback l'objet de retour asynchrone
     */
    void updateLigneDevisParSelecteurProduit(SelecteurProduitModel selecteurProduit, AsyncCallback<LigneDevisModel> callback);

    /**
     * Calcule l'âge et l'âge millésimé en fonction d'une date de calcul et d'une date de naissance.
     * @param dateCalculAge DTO contenant les infos nécessaires au calcul de l'âge
     * @param callback l'objet de retour asynchrone
     */
    void getAgesCalculesPersonne(DateCalculAgeModel dateCalculAge, AsyncCallback<AgeModel> callback);
}
