/*******************************************************************************
 * Copyright (c) 2014 antoniomariasanchez at gmail.com. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the GNU Public License v3.0 which accompanies this distribution, and is
 * available at http://www.gnu.org/licenses/gpl.html
 * 
 * Contributors: antoniomaria - initial API and implementation
 ******************************************************************************/
package net.sf.gazpachoquest.dto;

import java.util.HashMap;
import java.util.Map;

import net.sf.gazpachoquest.dto.support.AbstractAuditableDTO;

@SuppressWarnings("serial")
public class UserDTO extends AbstractAuditableDTO {

    private String email;

    private String givenNames;

    private String surname;


    private String username;

    private String apiKey;

    private String password;

    private final Map<String, String> attributes = new HashMap<String, String>();

    public UserDTO() {
        super();
    }

    public String getEmail() {
        return email;
    }

    public String getGivenNames() {
        return givenNames;
    }

    public String getSurname() {
        return surname;
    }

    public void setEmail(final String email) {
        this.email = email;
    }

    public void setGivenNames(final String givenNames) {
        this.givenNames = givenNames;
    }

    public void setSurname(final String surname) {
        this.surname = surname;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Map<String, String> getAttributes() {
        return attributes;
    }

    public void setAttribute(String name, String value) {
        attributes.put(name, value);
    }

    public String getApiKey() {
        return apiKey;
    }

    public void setApiKey(String apiKey) {
        this.apiKey = apiKey;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


}
