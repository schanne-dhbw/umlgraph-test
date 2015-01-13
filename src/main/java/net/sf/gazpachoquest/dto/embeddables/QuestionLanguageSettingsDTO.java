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

import net.sf.gazpachoquest.dto.support.LanguageSettingsDTO;

@SuppressWarnings("serial")
public class QuestionLanguageSettingsDTO implements LanguageSettingsDTO {

    private String title;

    private String explanation;

    public QuestionLanguageSettingsDTO() {
        super();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(final String title) {
        this.title = title;
    }

    public String getExplanation() {
        return explanation;
    }

    public void setExplanation(String explanation) {
        this.explanation = explanation;
    }


    @Override
    public String toString() {
        return "QuestionLanguageSettingsDTO [title=" + title + "]";
    }

    public static Builder with() {
        return new Builder();
    }

    public static class Builder {
        private String title;
        private String explanation = "";

        public Builder title(String title) {
            this.title = title;
            return this;
        }

        public Builder explanation(String explanation) {
            this.explanation = explanation;
            return this;
        }

        public QuestionLanguageSettingsDTO build() {
            QuestionLanguageSettingsDTO questionLanguageSettingsDTO = new QuestionLanguageSettingsDTO();
            questionLanguageSettingsDTO.title = title;
            questionLanguageSettingsDTO.explanation = explanation;
            return questionLanguageSettingsDTO;
        }
    }
}
