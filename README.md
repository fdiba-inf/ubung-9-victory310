# Übung 9
Quellcode der Vorlesung: https://github.com/fdiba-inf/vorlesung
## Repl.it öffnen
Bevor Sie die Taste _"Work in Repl.it"_ klicken, öffnen Sie https://repl.it/auth/github/get, um sicherzustellen, dass Sie in repl.it angemeldet sind.
## Aufgabe 0. Rechteck
Betrachten Sie die Klasse _Rectangle_ im Paket _exercise9_, die nur Rechtecke behandelt, dessen Seiten parallel zu den Koordinatenachsen liegen.

<img src="https://github.com/fdiba-inf/vorlesung/blob/main/images/exercise9/rectangle.png" width="200">

Die Attribute sind nur in der Klasse zugänglich.
Die Methoden und Konstruktoren sind überall zugänglich.
Die Klasse enthält das Folgende:
* **Drei Attribute:** Anfangspunkt (_Point_), Höhe (_double_) und Breite (_double_).
* **Default-Konstruktor:** Anfangspunkt zu Koordinaten _(0, 0)_, Höhe und Breite zu _1_ einstellen.
* **Konstruktor mit einem Punkt und zwei reellen Werten als Parameter:** Attribute einstellen.
* **Copy-Konstruktor mit einem Rechtreck als Parameter:** Attribute einstellen.
* **Methode _boolean isValid()_:** Attribute überprüfen (Höhe und Breite großer _0_).
* **Methode _void initialize()_:** Attribute aus der Konsole eingeben, bis sie korrekt sind.
* **Methode _double calculatePerimeter()_:** Umfang berechnen.
* **Methode _double calculateArea()_:** Fläche berechnen.
* **Methode _String getType()_:** Art bestimmen _(“Square“, “ Rectangle“)_.
* **Methode _String toString()_:** Rechteck als String darstellen: _(x, y)-[Ho, Br], Art, P=Umfang, A=Fläche_ z.B. _“(1, 1)-[2, 3], Rectangle, P=10, A=6“_.
* **Methode _boolean equals(Rectangle otherRectangle)_:** Rechtecke vergleichen. Zwei Rechtecke sind gleich, wenn ihre Seiten gleich sind.

Betrachten Sie die Klasse _RectangleDemo_ im Paket _exercise9_. Die main-Methode initialisiert vier Rechtecke:
* Rechteck 1: Koordinaten _(0, 0)_, Höhe _1_, Breite _1_.
* Rechteck 2: Koordinaten _(1, 1)_, Höhe _2_, Breite _3_.
* Rechteck 3: vom Rechteck 2 kopiert wird.
* Rechteck 4: durch die Konsole initialisiert wird (Koordinaten _(3, 4)_, Höhe _5_, Breite _5_).
* Sie überprüft, ob Rechteck 2 zu Rechteck 1 und 3 gleich ist.

Wie sieht der Speicherplatz nach der Ausführung der main-Methode aus?

<img src="https://github.com/fdiba-inf/vorlesung/blob/main/images/exercise9/rectangle-memory.png" width="400">

## Aufgabe 1. Ellipse
Ändern Sie die Klasse _Ellipse_ im Paket _exercise9_, die nur Ellipsen behandelt, deren Achsen parallel zu den Koordinatenachsen liegen.

<img src="https://github.com/fdiba-inf/vorlesung/blob/main/images/exercise9/ellipse.png" width="200">

Die Attribute sollen nur in der Klasse zugänglich sein.
Die Methoden und Konstruktoren sollen überall zugänglich sein.
Die Klasse enthält das Folgende:

* **Drei Attribute:** Anfangspunkt (_Point_), Halbachse a (_double_) und Halbachse b (_double_).
* **Default-Konstruktor:** Anfangspunkt zu Koordinaten _(0, 0)_, a und b zu _1_ einstellen.
* **Konstruktor mit einem Punkt und zwei reellen Werten als Parameter:** Attribute einstellen.
* **Copy-Konstruktor mit einer Ellipse als Parameter:** Attribute einstellen.
* **Methode _boolean isValid()_:** Attribute überprüfen (a und b großer _0_).
* **Methode _void initialize()_:** Attribute aus der Konsole eingeben, bis sie korrekt sind.
* **Methode _double calculatePerimeter()_:** Umfang berechnen.
* **Methode _double calculateArea()_:** Fläche berechnen.
* **Methode _String getType()_:** Art bestimmen _(“Circle“, “ Ellipse“)_.
* **Methode _String toString()_:** Ellipse als String darstellen: _(x, y)-[a, b], Art, P=Umfang, A=Fläche_ z.B. “_(1, 1)-[2, 3], Ellipse, P=15.86, A=18.84_“.
* **Methode _boolean equals(Ellipse otherEllipse)_:** Ellipsen vergleichen. Zwei Ellipsen sind gleich, wenn ihre Halbachsen gleich sind.

<img src="https://github.com/fdiba-inf/vorlesung/blob/main/images/exercise9/ellipse-formula.png" width="400">

## Aufgabe 2. Ellipse Demo
Ändern Sie die Klasse _EllipseDemo_ im Paket _exercise9_. Die main-Methode soll vier Ellipsen initialisieren:
* Ellipse 1: Koordinaten _(0, 0)_, a _1_, b _1_.
* Ellipse 2: Koordinaten _(2, 3)_, a _5_, b _6_.
* Ellipse 3: vom Ellipse 2 kopiert wird.
* Ellipse 4: durch die Konsole initialisiert wird (Koordinaten _(1, 2)_, a _3_, b _2_).
* Sie soll auch überprüfen, ob Ellipse 2 zu Ellipse 1 und 3 gleich ist. 

Erwartete Ausgabe:
``` 
Ellipse 1: (0.0, 0.0)-[1.0, 1.0], Circle, P=6.283185307179586, A=3.141592653589793
Ellipse 2: (2.0, 3.0)-[5.0, 6.0], Ellipse, P=34.628955940751425, A=94.24777960769379
Ellipse 3: (2.0, 3.0)-[5.0, 6.0], Ellipse, P=34.628955940751425, A=94.24777960769379
Ellipse 4: (1.0, 2.0)-[3.0, 2.0], Ellipse, P=15.865437575563961, A=18.84955592153876
Ellipse 2 equals Ellipse 1: false
Ellipse 2 equals Ellipse 3: true
``` 
## Aufgabe 3. Ellipse Demo Speicherplatz
Wie sieht der Speicherplatz nach der Ausführung der main-Methode aus?
## Achtung! Achtung! Achtung!
Wenn Sie alle Aufgaben gemacht haben, sollen Sie die Lösungen in _GitHub_ hochladen. 
Wenn "Version Control" nicht verfügbar ist, geben Sie die folgenden Befehle in die Konsole ein:
``` 
git pull
git add .
git commit -m "Some message"
git push
``` 
