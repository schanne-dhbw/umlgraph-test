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
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import net.sf.gazpachoquest.dto.support.AbstractAuditableDTO;
import net.sf.gazpachoquest.dto.support.IdentifiableLocalizable;

/**
 * @composed - has 1..n SectionDTO
 */
@SuppressWarnings("serial")
public class QuestionnaireDefinitionDTO extends AbstractAuditableDTO implements
        IdentifiableLocalizable{


    private final List<SectionDTO> sections = new ArrayList<>();

    private Boolean progressVisible;

    private Boolean welcomeVisible;

    private Boolean sectionInfoVisible;

    private Boolean questionNumberVisible;


    private Integer questionsPerPage;


    public QuestionnaireDefinitionDTO() {
        super();
    }

    public void addSection(final SectionDTO section) {
        sections.add(section);
    }


    public SectionDTO getLastSectionDTO() {
        int count = sections.size();
        return count > 0 ? sections.get(count - 1) : null;
    }

    public List<SectionDTO> getSections() {
        return Collections.unmodifiableList(sections);
    }
    public void setWelcomeVisible(Boolean welcomeVisible) {
        this.welcomeVisible = welcomeVisible;
    }

    public Boolean isWelcomeVisible() {
        return welcomeVisible;
    }

    public Boolean isProgressVisible() {
        return progressVisible;
    }

    public void setProgressVisible(Boolean progressVisible) {
        this.progressVisible = progressVisible;
    }

    public Boolean isSectionInfoVisible() {
        return sectionInfoVisible;
    }

    public void setSectionInfoVisible(Boolean sectionInfoVisible) {
        this.sectionInfoVisible = sectionInfoVisible;
    }

    public Boolean isQuestionNumberVisible() {
        return questionNumberVisible;
    }

    public void setQuestionNumberVisible(Boolean questionNumberVisible) {
        this.questionNumberVisible = questionNumberVisible;
    }


    public Integer getQuestionsPerPage() {
        return questionsPerPage;
    }

    public void setQuestionsPerPage(Integer questionsPerPage) {
        this.questionsPerPage = questionsPerPage;
    }

}
