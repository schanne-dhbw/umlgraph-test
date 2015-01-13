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


@SuppressWarnings("serial")
public class QuestionOptionDTO  {

    private String code;


    public QuestionOptionDTO() {
        super();
    }

    public String getCode() {
        return code;
    }


    public void setCode(final String code) {
        this.code = code;
    }


}
