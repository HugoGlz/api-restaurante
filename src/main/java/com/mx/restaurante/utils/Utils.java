package com.mx.restaurante.utils;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.commons.lang3.StringUtils;

import com.mx.restaurante.beans.Mesa;

public final class Utils {
	
	private final static String reNumber = "\\d+";
	
	private final static Pattern patternNumber = Pattern.compile(reNumber); 
    
    private Utils(){}
    
    public final static String cleanString(String value){
    	value = StringUtils.trimToNull(value);
        
        if(value == null){
            return null;
        }
        
        value = value.replace("'", "");
        
        return value;
    }
    
    public final static boolean isValidNumber(String value){
    	Matcher matcher = patternNumber.matcher(value);
    	return matcher.find();
    }
    
    public final static ArrayList<ArrayList<Mesa>> subListMesas(ArrayList<Mesa> list, int capacidad){
    	if(list == null || list.isEmpty()){
    		return null;
    	}
    	
    	int veces = list.size() > capacidad ? list.size() / capacidad : 1;
    	
    	int indice = 0;
    	
    	ArrayList<ArrayList<Mesa>> mesas = new ArrayList<ArrayList<Mesa>>();
    	
    	for(int i = 0; i < veces; i++){
    		
    		ArrayList<Mesa> mesa = new ArrayList<Mesa>();
    		
    		int restantes = (list.size() - indice) < capacidad ? (list.size() - indice) : capacidad;
    		
    		for(int j = 0; j < restantes ; j++){
    			mesa.add(list.get(indice++));
    		}
    		
    		mesas.add(mesa);
    	}
    	
    	return mesas;
    }
    
}
