/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mockitotutorial;

import com.mycompany.mockitotutorial.exceptions.AcronymNotFoundException;

/**
 *
 * @author Låne PC
 */
public class AcronymUser {

    AcronymInterface acr;

    public void setAcronymUser(AcronymInterface acr) {
        this.acr = acr;
    }

    public String getInitialPhrase(String Acronym) throws AcronymNotFoundException {
        return acr.getInitialPhrase(Acronym);
    }
}