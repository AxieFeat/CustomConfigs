package me.axiefeat.Api;

import org.bukkit.plugin.java.JavaPlugin;

import java.io.*;

public class CustomConfig {
    public static void saveDefault(JavaPlugin main, String resourcePath) throws FileNotFoundException {
        InputStream inputStream = main.getClass().getResourceAsStream("/" + resourcePath);
        if (inputStream == null) {
            throw new FileNotFoundException(resourcePath);
        }

        File pluginFolder = main.getDataFolder();

        if (!pluginFolder.exists()) {
            pluginFolder.mkdirs();
        }
        String[] pathElements = resourcePath.split("/");
        for (int i = 0; i < pathElements.length - 1; i++) {
            File file = new File(pluginFolder, pathElements[i]);
            if (!file.exists()) {
                pluginFolder = new File(pluginFolder, pathElements[i]);
                if (!pluginFolder.exists()) {
                    pluginFolder.mkdir();
                }
            }
        }

        File targetFile = new File(pluginFolder, pathElements[pathElements.length - 1]);

        try {
            OutputStream outputStream = new FileOutputStream(targetFile);

            byte[] buffer = new byte[1024];
            int length;

            while ((length = inputStream.read(buffer)) > 0) {
                outputStream.write(buffer, 0, length);
            }

            inputStream.close();
            outputStream.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
