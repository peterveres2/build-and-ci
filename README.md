# Build és Folyamatos Integráció

## 1. A Beadandó Feladat
A mellékelt forráskód alapján készítsünk egy Maven buildet, melynek a segítségével automatikusan futtatható JAR fájl készíthető.
A Maven projekt a következő modulokból kell, hogy álljon:
* spaceinvaders parent project
* spaceinvaders-app almodul
* spaceinvaders-sprites almodul

Az elkészült JAR-nak futtathatónak kell lennie, a belépési pont: Game.class

A forráskódok letölthetők innen: https://github.com/peterveres2/build-and-ci/tree/master/spaceinvaders

Az elkészült projektet konfiguráljunk fel Jenkins alá úgy, hogy a következő metrikákat nyerjük ki a build során:

- Unit Test eredmények
- Unit Test Coverage
- FindBugs
- CheckStyle


## 2. A Beadandó formája
A következő dolgokat kérem szállítani:
1. Maven projektek
1. ScreenShot a Jenkins Job konfigurációjáról
1. ScreenShot az utolsó Jenkins build summary lapról
1. ScreenShot vagy nyers log az utolsó Jenkins buildről

## 3. Határidő
2017.12.21

Mindezt zip / tar.gz formátumban a következő címre: peter_veres2@epam.com, ELTE/PPKE Beadandó tárgy megjelöléssel.
