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
public class Acronym implements AcronymInterface {

    @Override
    public String getInitialPhrase(String Acronym) throws AcronymNotFoundException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}