# Shopping-Center-Management
add, delete and search products to make sure they are in store + buy products from the store
Coding-Aufgabe: ProductRepo //DONE//
Erstelle eine Klasse ProductRepo, die eine Liste von Product-Objekten enthält.
* 
* Schritt 1: Erstelle einen Record Product mit den benötigten Attributen.
* Schritt 2: Implementiere die ProductRepo-Klasse mit einer Liste zur Speicherung von Produkten.
* Schritt 3: Implementiere Methoden zum Hinzufügen, Entfernen und Abfragen von Produkten.
* ——————————
* 
Coding-Aufgabe: OrderListRepo //DONE//
Erstelle eine Klasse OrderListRepo, die eine Liste von Order-Objekten enthält.
* 
* Schritt 1: Erstelle einen Record Order mit den benötigten Attributen.
* Schritt 2: Implementiere die OrderListRepo-Klasse mit einer Liste zur Speicherung von Bestellungen.
* Schritt 3: Implementiere Methoden zum Hinzufügen, Entfernen und Abfragen von Bestellungen.

————————
Coding-Aufgabe: ShopService  //DONE//
Erstelle eine Klasse ShopService, über die wir neue Bestellungen aufgeben können.
* 
* Schritt 1: Implementiere eine Methode, um eine neue Bestellung aufzugeben.
* Schritt 2: Überprüfe, ob die bestellten Produkte existieren. Wenn nicht gebe ein System.out.println aus.

———————————
Coding-Aufgabe: OrderRepoInterface  //DONE//
* Schritt 1: Erstelle ein OrderRepo-Interface mit den Methoden aus dem OrderListRepo (Hinzufügen, Entfernen und Abfragen von Bestellungen)
* —————————
* 
Coding-Aufgabe: OrderMapRepo //DONE//
* Erstelle eine Klasse OrderMapRepo, über die wir neue Bestellungen aufgeben können.
* Diese Klasse soll auch das OrderRepo-Interface implementieren.
* Erstelle in der main-Methode entweder das OrderMapRepo oder das OrderListRepo und gib es dem Konstruktor von ShopService (in einen Konstruktor-Parameter, der das Interface nutzt) mit.
