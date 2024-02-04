# CustomConfigs

Только недавно я узнал, что в Bukkit уже есть метод для сохранения файлов из .jar. Но всё же оставлю этот ресурс здесь.

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

В данном случае в папке configs мы копируем messages.yml и сохраняем в папку плагина с тем же путём, что указан в методе
