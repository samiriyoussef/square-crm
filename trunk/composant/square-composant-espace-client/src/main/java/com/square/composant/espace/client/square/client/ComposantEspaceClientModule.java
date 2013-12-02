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
package com.square.composant.espace.client.square.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.dom.client.StyleInjector;
import com.google.gwt.event.shared.HandlerManager;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.square.composant.espace.client.square.client.presenter.espace.client.EspaceClientPresenter;
import com.square.composant.espace.client.square.client.presenter.espace.client.EspaceClientPresenter.EspaceClientView;
import com.square.composant.espace.client.square.client.view.espace.client.EspaceClientViewImpl;
import com.square.composants.graphiques.lib.client.bundle.SquareLibResources;

/**
 * Point d'entrée pour le module espace client.
 * @author Nicolas Prouteau (nicolas.prouteau@scub.net) - SCUB
 */
public class ComposantEspaceClientModule implements EntryPoint {

    /**
     * {@inheritDoc}
     */
    @Override
    public void onModuleLoad() {
        firefox3compatibility();

        StyleInjector.inject(SquareLibResources.INSTANCE.css().getText());

        final VerticalPanel conteneur = new VerticalPanel();
        conteneur.setWidth("944px");
//        final Long idPersonne = 51013355L;
        final Long idPersonne = 500629L;
        final HandlerManager eventBus = new HandlerManager(null);
        final EspaceClientView view = new EspaceClientViewImpl();
        final EspaceClientPresenter espaceClientPresenter = new EspaceClientPresenter(eventBus, view, idPersonne);
        espaceClientPresenter.showPresenter(conteneur);
        RootPanel.get().add(conteneur);
    }

    private static native void firefox3compatibility() /*-{
    if (!$doc.getBoxObjectFor) { $doc.getBoxObjectFor = function (element) {
        var box = element.getBoundingClientRect();
        return { "x" : box.left, "y" : box.top, "width" : box.width, "height" : box.height, "screenX": box.left, "screenY":box.top }; } }
    }-*/;
}
