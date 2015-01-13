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
package net.sf.gazpachoquest.dto;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import net.sf.gazpachoquest.dto.embeddables.SectionLanguageSettingsDTO;
import net.sf.gazpachoquest.dto.support.AbstractAuditableDTO;
import net.sf.gazpachoquest.dto.support.IdentifiableLocalizable;

/**
 * @composed - has 1..n QuestionDTO
 */
@SuppressWarnings("serial")
public class SectionDTO extends AbstractAuditableDTO implements IdentifiableLocalizable<SectionLanguageSettingsDTO> {


    private SectionLanguageSettingsDTO languageSettings;

    private final List<QuestionDTO> questions = new ArrayList<>();

    private Boolean randomizationEnabled;

    private String relevance;

    public SectionDTO() {
        super();
    }

    public void addQuestion(final QuestionDTO question) {
        questions.add(question);
    }


    public List<QuestionDTO> getQuestions() {
        return Collections.unmodifiableList(questions);
    }


    public Boolean isRandomizationEnabled() {
        return randomizationEnabled;
    }

    public void setRandomizationEnabled(Boolean randomizationEnabled) {
        this.randomizationEnabled = randomizationEnabled;
    }

    public String getRelevance() {
        return relevance;
    }

    public void setRelevance(String relevance) {
        this.relevance = relevance;
    }

}
