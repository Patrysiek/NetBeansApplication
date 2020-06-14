/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.weii.weathertestapp;

import com.fasterxml.jackson.databind.ObjectMapper;

/**
 *
 * @author Patryk
 */
public class CommonUtils {
        private static final StringBuilder STRING_BUILDER = new StringBuilder();
        private static final ObjectMapper mapper = new ObjectMapper();

    public static StringBuilder getSTRING_BUILDER() {
        STRING_BUILDER.setLength(0);
        return STRING_BUILDER;
    }

    public static ObjectMapper getMapper() {
        return mapper;
    }
        
        
}
