# PyEventos

O aplicativo de Android pada navegar a programação da conferência [PythonBrasil](http://pythonbrasil.org.br/), a versão brasileira da [PyCon](http://pycon.org) americana.

Esse código é baseado no [FOSDEM Companion](https://github.com/cbeyls/fosdem-companion-android), desenvolvido por Christophe Beyls para a conferência [FOSDEM](http://fosdem.org/) em Bruxelas.

## Como build

Todas as dependências são defininas em ```app/build.gradle```. Importe o projeto no Android Studio ou use o Gradle no prompt de comando:

```
./gradlew assembleRelease
```

O arquivo APK resultante estará em ```app/build/outputs/apk/```.

## Licença

[Apache License, Version 2.0](http://www.apache.org/licenses/LICENSE-2.0)

## Projeto original

* [FOSDEM Companion](https://github.com/cbeyls/fosdem-companion-android)

## Bibliotecas utilizadas

* [Android Support Library](http://developer.android.com/tools/support-library/) by The Android Open Source Project
* [ViewPagerIndicator](http://viewpagerindicator.com/) by Jake Wharton
* [PhotoView](https://github.com/chrisbanes/PhotoView) by Chris Banes

## Contribuidores

* Rodolpho Eckhardt
* Christophe Beyls (projeto original)
