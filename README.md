# Database Integration in IntelliJ

## Informationen

- **Name:** Teodor Stanculeasa
- **Fach:** ITL_1/2
- **Auftrag:** 8. Aufgabenstellung - DB Anbindung in JAVA
- **Datum:** 26.03.2025

## Einleitung

In diesem Projekt habe ich eine MySQL-Datenbank mit IntelliJ verbunden und eine einfache Abfrage auf die Tabelle `EMP` durchgef�hrt.
Hier dokumentiere ich die Schritte, die ich durchgef�hrt habe, um die Datenbank einzurichten, mit IntelliJ zu verbinden und eine SQL-Abfrage auszuf�hren.

## Lernziele

- Einrichtung eines MariaDB/MySQL-Servers auf dem Rechner oder Raspberry Pi
- Verbindung der Datenbank mit IntelliJ
- Erstellung einer einfachen Datenbankanwendung
- Sequenzielles Auslesen aller Datens�tze einer Tabelle

## Einrichtung der Datenbank

### 1. Starten von XAMPP
Ich habe XAMPP gestartet, um einen lokalen MySQL-Server zu haben.
![Starting XAMPP](images/starting_xampp.png)

### 2. Erstellen einer neuen Datenbank
�ber das Terminal habe ich eine neue Datenbank `company_db` erstellt:
```sql
CREATE DATABASE company_db;
```
![Creating a new database](images/creating_new_database.png)

### 3. SQL-Datei ausf�hren (Tabellen erstellen)
Um die Tabellenstruktur schnell zu erstellen, habe ich die `setup.sql` Datei verwendet:
```sql
SOURCE setup.sql;
```
![Running setupSQL](images/running_setupSQL.png)

### 4. �berpr�fung der Tabellen
Mit einer einfachen SQL-Abfrage habe ich �berpr�ft, ob die `EMP`-Tabelle korrekt erstellt wurde:
```sql
SELECT * FROM EMP;
```
![Checking employee table](images/checking_employee.png)

## Verbindung mit IntelliJ

### 1. IntelliJ Plugins pr�fen
Ich habe �berpr�ft, ob das `Database Tools and SQL` Plugin installiert ist.
![Searching for plugins](images/Searching_for_plugins.png)

### 2. Installation von DatabaseHelper
Das Plugin `DatabaseHelper` wurde zur einfacheren Verwaltung installiert.
![Installing DatabaseHelper](images/install_db_helper.png)

### 3. Verbindung zur Datenbank
Ich habe eine neue Verbindung zur Datenbank eingerichtet und getestet.
![New Connection](images/new_connection.png)
![Connection Successful](images/connection_successful.png)

### 4. Datenbank in IntelliJ
Die Datenbank wurde erfolgreich in IntelliJ angezeigt.
![Database in IntelliJ](images/DB_IntelliJ.png)

## JDBC-Treiber hinzuf�gen

### 1. Java Connector herunterladen und einbinden
Ich habe den Java-Connector heruntergeladen und als JAR-Datei hinzugef�gt.
![Downloading Java Connector](images/Downloading_connector.java)
![Adding JAR](images/adding_jar.png)

### 2. Konfiguration der Laufzeitumgebung
Damit IntelliJ den JDBC-Treiber findet, habe ich `Use classpath of module` in den Run/Debug-Konfigurationen hinzugef�gt.

## Codeausgabe

Nach dem erfolgreichen Ausf�hren meines Java-Codes wurde folgendes ausgegeben:
![Output](images/output.png)

Damit ist die Datenbank erfolgreich in IntelliJ integriert und einsatzbereit.