# Vulnerapp

-- A Vulnerable Sample Spring Boot Application

This application uses a relatively modern stack but is still vulernable to a set of attacks.
Featuring:

- [XSS](https://portswigger.net/web-security/cross-site-scripting)
- [SQLi](https://portswigger.net/web-security/sql-injection)
- [CSRF](https://portswigger.net/web-security/csrf)
- [SSRF](https://portswigger.net/web-security/ssrf)
- Fake Logins
- Info Exposure
- Plain Passwords
- ...

Not really everything :(


✘
## Lernziele

✔︎ - Verwendung von korrekten REST-Verben.

✔︎ - Implementierung einer Authentifizierungslösung (z.B. BasicAuth).

✔︎ - Enforce RBAC (z.B. User- und Admin-Services unterscheiden).

✔︎ - Aktivieren von CSRF-Protection und Erklärung, warum diese Implementation funktioniert.

✔︎ - Implementierung einer sicheren Passwort-Speicherung (Hashing, Passwortregeln).

✔︎ - Strikte Inputvalidierung (für REST-Endpunkte und Datenbank).

✔︎ - Behebung der initialen Sicherheitslücken (SQLi, XSS, CSRF). -> Nur halb da nur CSRF umgesetzt ist

✔︎ - Implementierung von securityrelevanten (Unit-)Tests. -> Nur halb erfüllt da es nur einen gibt(habe nicht gewusst was noch rein soll)


## Selbsevaluation
### Erklärung (Meine Zusammenfassung zum Projekt/ Was ich noch sagen wollte)
Im ganzen konnte ich die meisten Anforderungen ganz erfüllen (7/9). Jedoch sind einige nicht ganz erfüllt aber wurden immer mindestens eimal Angewandt und umgesetzt.


Jedoch fand ich das, das schwerste Projekt bisher, da ich mich nicht wirklich mit Secourity ausgekannt habe, und die Wörter sehr scher zu lernen und verstehen waren.
Auch obwohl ich diesmal wirklich viel aufgepasst habe, konnte ich nicht ganz am Ball bleiben und kam nicht überall ganz draus.
Und dann als das Projekt kam war ich ganz aufgeschmissen, da es SEHR SEHR Schwer für mich war das gelernte und halbwegs verstandene in Code umzuwandeln.
Und meistens gab der Code für mich nicht mal ganz Sinn, da ich nicht wusste warum man was hier einbaute und es sehr kompliziert war, sowie es auch den Code für mich komisch aussah.
Ich habe mit dem noch nie gearbeitet und war eher aufgeschmissen.
Desshalb habe ich am anfang auch Hilfe bei Noel und Joey gesucht und dann immer mehr begriffen (also von selbst würde ich jetzt kein AuthManager schreiben können zum Beispiel).
Aber jetzt habe ich einiges Begriffen und neues dazugelernt. Trotzdem fände ich es cool vielleicht bei nächsten Projekten mehr input Code mässig her zu bekommen.
Ich weiss einige wie Nils, Corsin oder Oli kennen schon sehr viel aber manchmal habe ich mich wirklich wie im Französisch Unterricht gefühlt (Also über das ganze Modul, bei diesem Projekt habe ich schon mehr begriffen)

Im grossen und ganzen habe ich mich diesmal wirklich angestrengt und versucht einiges zu erfüllen.

### Warum funktioniert das CSRF

Indem man ein CSRF Token mitschickt und evaluiert wird ob es sich um den richtigen Handelt, kann man sich so vor einen Angriff schützen.

### Note
Ich hätte mir jetzt die ***`Note 4.5`*** gegeben, da ich manchmal hilfe brauchte, jedoch einiges erfüllt ist.


### Was noch reinkommen könnte um die Sicherheit zu verbessern

- Content Security Policy (CSP):

Die Implementierung einer Content Security Policy (CSP) ermöglicht die Kontrolle über die Ressourcenladung auf der Webseite. Durch das Festlegen von Richtlinien für erlaubte Ressourcenquellen können potenzielle Angriffsvektoren wie Cross-Site Scripting (XSS) weiter reduziert werden.

- Zwei-Faktor-Authentifizierung (2FA):

Die Implementierung einer Zwei-Faktor-Authentifizierung bietet eine zusätzliche Sicherheitsebene für die Benutzer. Neben dem Passwort wird ein zweiter Faktor, wie z.B. ein Einmalpasswort per SMS oder eine Authentifizierungs-App, benötigt, um auf das Benutzerkonto zugreifen zu können.

- Rate Limiting:

Die Implementierung einer Rate-Limiting-Maßnahme kann helfen, Brute-Force-Angriffe zu verhindern. Durch das Setzen von Begrenzungen für die Anzahl der Anfragen pro Zeiteinheit für bestimmte Aktionen wie Anmeldeversuche oder Passwortzurücksetzungen wird die Möglichkeit von automatisierten Angriffen reduziert.


### Schwierigkeiten
Merke habe einiges scho vorweggenommen 😫

Ich hatte grosse Schwierigkeiten mit überhaupt begreiffen was was ist, warum man es braucht und oder wie man etwas braucht.
Allgemein fande ich dieses Projekt sehr schwer. Desshalb weiss ich auch nicht ganz, was man besser machen könnte.
Also sicher bei mir, das das mit den Blogs funktioniert, aber ich weiss nicht warum es nicht geht.
Obwohl ich eigentlich immer aufgepasst habe, habe ich auch meistens nur die hälfte verstanden, da ich auch nicht immer alle Begriffe kannte oder noch wusste was welcher Begriff war.
