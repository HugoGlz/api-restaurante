package com.mx.restaurante.utils;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

import com.google.gson.Gson;

public final class JSON {

    private static final Logger logger = Logger.getLogger(JSON.class);
    
    private JSON() {}

    public static void writeJSON(HttpServletResponse response, boolean success,String message,Object[] JSONs, String[] JSONnombres) {
        try {
            response.setContentType("application/json;charset=iso-8859-1");
            
            StringBuilder json  = new StringBuilder("{"
                    + "\"success\":" + success + ","
                    + "\"message\":\"" + message + "\"");
                   
            		if(JSONs != null && JSONnombres != null){
	                    for(int index = 0; index < JSONs.length; index ++){
	                    	Gson gson = new Gson();
	                    	Object object = JSONs[index];
	                    	if(object == null){
	                    		continue;
	                    	}
	                    	String data = gson.toJson(object);
	                    	json.append(",\"" + JSONnombres[index] +  "\":" + data);
	                    }
            		}
            		
            	json.append("}");
           
            ServletOutputStream out = response.getOutputStream();
            logger.info(json.toString());
            out.print(json.toString());
            out.flush();
            out.close();
        } catch (Exception e) {
            logger.warn("Happened when was writting json.", e);
        }
    }

}
