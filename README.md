# CustomConfigs
Библиотека для удобной загрузки файлов из .jar плагина Bukkit

# Как это работает?
Чтобы сохранить конфиг из .jar файла плагина в папку плагина указывайте в параметрах метода saveDefault ваш JavaPlugin класс и путь до файла, если указаны папки код сам создаст их, если файл не найден выйдет исключение FileNotFoundException

# Использование:

```java
try {
   CustomConfig.saveDefault(this, "messages.yml");
} catch (FileNotFoundException e) {
   throw new RuntimeException(e);
}
```

Или
 
```java
try {
   CustomConfig.saveDefault(this, "configs/messages.yml");
} catch (FileNotFoundException e) {
   throw new RuntimeException(e);
}
```
