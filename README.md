# Networking-Messages

A Networking-Server és a Networking-Client által használt közös komponenseket tartalmazza ez a projekt. Ahhoz, hogy a kliens és a szerver használni tudja fordítani és csomagolni kell a forrásfájlokat.

1. Töltsük le a forrásfájlokat tartalmazó mappát (src) egy gyökérkönyvtárba (<i>root</i>)
2. Hozzuk létre a <i>root</i>/classes mappát
3. A <i>root</i> mappából adjuk ki a következő parancssori parancsot:<br /><code>javac src/messages/\*.java src/messages/messageboard/\*.java -d classes</code>
4. Lépjünk be a <i>root</i>/classes mappába és adjuk ki a következő parancssori parancsot:<br /><code>jar cf Networking-Messages.jar messages/\*.class messages/messageboard/\*.class</code>

Az előállt Networking-Messages.jar csomagot használja majd a kliens és a szerver is.
