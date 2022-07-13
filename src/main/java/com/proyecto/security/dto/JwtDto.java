/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.proyecto.security.dto;

/**
 *
 * @author eze_r
 */
public class JwtDto {
    private String token;
   

    public JwtDto(String token) {
        this.token = token;
    }

    public JwtDto() {
    }

    
    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}
