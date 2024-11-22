pluginManagement {
    repositories {
        google() // Репозиторий Google для Android зависимостей
        mavenCentral() // Центральный Maven репозиторий
        gradlePluginPortal() // Портал плагинов Gradle
    }
}

rootProject.name = "GameTop" // Имя корневого проекта
include(":app") // Подключение модуля "app"
