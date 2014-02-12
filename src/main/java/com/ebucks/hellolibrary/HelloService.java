/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ebucks.hellolibrary;

/**
 *
 * @author ninjav
 */
public class HelloService {

    public String sayHello(String message) {
        return "Hello, " + message;
    }

    public String sayGoodbye(String message) {
        return "Goodbye, " + message;
    }

    public String sayWhat() {
        return "What?";
    }
}
