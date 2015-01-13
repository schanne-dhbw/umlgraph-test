/*******************************************************************************
 * Copyright (c) 2014 antoniomariasanchez at gmail.com.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the GNU Public License v3.0
 * which accompanies this distribution, and is available at
 * http://www.gnu.org/licenses/gpl.html
 * 
 * Contributors:
 *     antoniomaria - initial API and implementation
 ******************************************************************************/
package net.sf.gazpachoquest.dto.embeddables;

import net.sf.gazpachoquest.dto.QuestionnaireDefinitionDTO;
import net.sf.gazpachoquest.dto.support.LanguageSettingsDTO;

@SuppressWarnings("serial")
public class QuestionnaireDefinitionLanguageSettingsDTO implements LanguageSettingsDTO {

    private String description;

    private String title;

    private String welcomeText;

    private String endText;

    public QuestionnaireDefinitionLanguageSettingsDTO() {
        super();
    }

    public String getDescription() {
        return description;
    }

    public String getTitle() {
        return title;
    }

    public String getWelcomeText() {
        return welcomeText;
    }

    public void setDescription(final String description) {
        this.description = description;
    }

    public void setTitle(final String title) {
        this.title = title;
    }

    public String getEndText() {
        return endText;
    }

    public void setEndText(String endText) {
        this.endText = endText;
    }

    public void setWelcomeText(final String welcomeText) {
        this.welcomeText = welcomeText;
    }

    @Override
    public String toString() {
        return "QuestionnaireDefinitionLanguageSettingsDTO [title=" + title + ", description=" + description
                + ", welcomeText=" + welcomeText + "]";
    }


}
