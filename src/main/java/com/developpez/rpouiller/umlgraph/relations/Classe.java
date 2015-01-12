package com.developpez.rpouiller.umlgraph.relations;

/**
 * @depend - utilise - com.developpez.rpouiller.umlgraph.relations.souspack.Dependance2
 * @composed - comporte 4 Classe2
 * @assoc * associe * Classe3
 */
public class Classe extends ClasseAbstraite implements Interface {

        // Explication des annotations :
        // @depend   : permet le lien entre Classe et Dependance2
        // @composed : permet le lien entre Classe et Classe2
        // @assoc    : permet le lien entre Classe et Classe3
        
        public Dependance getDependance() {
                return null;
        }
}
