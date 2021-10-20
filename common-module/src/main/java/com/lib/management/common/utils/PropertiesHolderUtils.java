package com.lib.management.common.utils;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertiesHolderUtils {
    public static Properties loadPropertiesFile(String filePath) throws IOException {
        Properties prop = new Properties();
        try (InputStream resourceAsStream = PropertiesHolderUtils.class.getClassLoader().getResourceAsStream(filePath)) {
            prop.load(resourceAsStream);
        } catch (IOException e) {
            System.err.println("Unable to load properties file : " + filePath);
        }
        return prop;
    }
}
