package com.ts.utils.web;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.openqa.selenium.By;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

/**
 * Created by svelupula on 8/8/2015.
 * Updated method:By get(String locator) by Vidhya Kasiviswanathan on 05/06/2016
 */
public class WBy {

    private static HashMap<String, String> _locators;

    public static void loadJsonMap(String jsonPath) {
        if (_locators != null)
            return;
        _locators = new HashMap<String, String>();
        JSONParser parser = new JSONParser();

        try {
            Object obj = parser.parse(new FileReader(jsonPath));

            JSONObject jsonObject = (JSONObject) obj;
            for (Object key : jsonObject.keySet()) {
                _locators.put((String) key, (String) jsonObject.get(key));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    public static String getValue(String key) {
        try {
            return _locators.get(key);
        } catch (Exception ex) {

        }
        return "";
    }

    public static By get(String locator) throws Exception {
        try {
            if (locator.contains("=")) {
                String[] values = locator.split("=");
                if (values[0].toLowerCase().equals("css")) {
                    return By.cssSelector(getValue(locator));
                }
                if (values[0].toLowerCase().equals("xpath")) {
                    return By.xpath(getValue(locator));
                }
                if (values[0].toLowerCase().equals("id")) {
                    return By.id(getValue(locator));
                }
                if (values[0].toLowerCase().equals("name")) {
                    return By.name(getValue(locator));
                }
                if (values[0].toLowerCase().equals("class")) {
                    return By.className(getValue(locator));
                }
                if (values[0].toLowerCase().equals("link")) {
                	System.out.println("Indise by class:"+By.linkText(getValue(locator)));
                    return By.linkText(getValue(locator));
                    
                }
                if (values[0].toLowerCase().equals("plink")) {
                    return By.partialLinkText(getValue(locator));
                }
                if (values[0].toLowerCase().equals("tag")) {
                    return By.tagName(getValue(locator));
                }
                return By.cssSelector(getValue(locator));
            }

            return By.cssSelector(getValue(locator));
        } catch (Exception ex) {
            throw ex;
        }
    }


}
