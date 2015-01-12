package com.developpez.rpouiller.umlgraph.relations;

import java.util.List;

/**
 * @opt inferreltype composed
 * @has 1 possede * com.developpez.rpouiller.umlgraph.relations.souspack.Element2
 * @navassoc - gere - Interface
 */
public abstract class ClasseAbstraite {

        // Explication des annotations :
        // @opt inferreltype : indique que le lien entre ClasseAbstraite et Element sera une composition
        // @has              : permet le lien entre ClasseAbstraite et Element2
        // @navassoc         : permet le lien entre ClasseAbstraite et Interface

        protected List<Element> listeElements;
        
        public abstract Dependance getDependance();
}
