package api.utils;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ConfigManager {

    private static ConfigManager configManager;
    private static final Properties p = new Properties();

    private ConfigManager() throws IOException {
        InputStream inputStream = getClass().getClassLoader().getResourceAsStream("api.properties");
        p.load(inputStream);
    }

    public static ConfigManager getConfigManager() {
        if (configManager == null) {
            synchronized (ConfigManager.class) {
                try {
                    configManager = new ConfigManager();
                } catch (IOException e) {
                    System.out.println("File not found exception thrown for api.properties file");
                }
            }
        }
        return configManager;
    }

    public String getString(String key) {
        return System.getProperty(key, p.getProperty(key));
    }
}
