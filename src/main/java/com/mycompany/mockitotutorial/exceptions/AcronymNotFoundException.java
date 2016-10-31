/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mockitotutorial.exceptions;

/**
 *
 * @author Låne PC
 */
public class AcronymNotFoundException extends Exception {

    /**
     * Creates a new instance of <code>AcronymNotFoundException</code> without
     * detail message.
     */
    public AcronymNotFoundException() {
    }

    /**
     * Constructs an instance of <code>AcronymNotFoundException</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public AcronymNotFoundException(String msg) {
        super(msg);
    }
}
