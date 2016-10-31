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
public interface AcronymInterface {
    String getInitialPhrase(String Acronym) throws AcronymNotFoundException;
}
