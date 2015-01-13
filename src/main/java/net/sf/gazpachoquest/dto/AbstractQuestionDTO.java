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

import javax.xml.bind.annotation.XmlTransient;

import net.sf.gazpachoquest.dto.QuestionOptionDTO;
import net.sf.gazpachoquest.dto.support.AbstractIdentifiableDTO;
import net.sf.gazpachoquest.dto.support.IdentifiableLocalizable;


@SuppressWarnings("serial")

/**
 * @opt inferreltype composed
 * @has 1 possede * net.sf.gazpachoquest.dto.QuestionOptionDTO
 */
public abstract class AbstractQuestionDTO extends AbstractIdentifiableDTO implements
        IdentifiableLocalizable{

    protected String code;

    protected boolean required;

    private boolean otherAllowed;


    protected final List<QuestionOptionDTO> questionOptions = new ArrayList<>();

    private String relevance;

    protected AbstractQuestionDTO() {
        super();
    }

    public String getRelevance() {
        return relevance;
    }

    public void setRelevance(String relevance) {
        this.relevance = relevance;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void addQuestionOption(final QuestionOptionDTO questionOption) {
        questionOptions.add(questionOption);
    }


    public List<QuestionOptionDTO> getQuestionOptions() {
        return Collections.unmodifiableList(questionOptions);
    }



    public void setRequired(boolean required) {
        this.required = required;
    }

    public boolean isRequired() {
        return required;
    }

    public boolean isOtherAllowed() {
        return otherAllowed;
    }

    public void setOtherAllowed(boolean otherAllowed) {
        this.otherAllowed = otherAllowed;
    }


}
