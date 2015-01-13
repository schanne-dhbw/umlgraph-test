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

import net.sf.gazpachoquest.dto.embeddables.QuestionLanguageSettingsDTO;

/**
 * @composed - has 1..n SubquestionDTO
 */
@SuppressWarnings("serial")
public class QuestionDTO extends AbstractQuestionDTO {

    private final List<SubquestionDTO> subquestions = new ArrayList<>();

    private Integer number;

    public QuestionDTO() {
        super();
    }

    public void addSubquestion(final SubquestionDTO subQuestion) {
        subquestions.add(subQuestion);
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public List<SubquestionDTO> getSubquestions() {
        return Collections.unmodifiableList(subquestions);
    }

}
