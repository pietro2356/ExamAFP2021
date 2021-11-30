# Exam AFP 2021
Esame Java AFP G.Marconi Rovereto 2021

## Start the projects
> Go to the `src` folder and directly ***execute*** the `Main.java` file.

## Istruction
### *N°1: sepnum*

Write a function sepnum that takes a list of strings in the format **"word number"** and RETURN a hashmap which maps each word to the extracted number.

* To parse the number, use `Integer.parseInt`.

```java
public static HashMap<String, Integer> sepnum(List<String> parole){
    // write here
}

// TEST
System.out.println(sepnum(List.of("say 72", "tell 6", "shout 583")));
// {tell=6, say=72, shout=583}
```
Output:
```java
{tell=6, say=72, shout=583}
```
----

### *N°2: matriverba*
Write a function which given a matrix of characters, _RETURN_ a string with the words extracted from columns, putting in uppercase the first character of each word.

* **USE** a `StringBuilder`
* For uppercasing, use `.toUpperCase()`.

```java
public static String matriverba(String[][] matrice){
    // write here
}

// TEST
String[][] mat = {{"p","c","z","g","b", "d"},
                  {"o","a","a","i","o", "e"},
                  {"r","l","n","a","r", "n"},
                  {"t","m","n","r","s", "t"},
                  {"o","a","a","a","e", "e"},};

System.out.println(matriverba(mat));  // PortoCalmaZannaGiaraBorseDente
```
---

### *N°3: Energy Drink*

Nuka-Cola is the flagship product of the Nuka-Cola Corporation and one of the symbols of United States culture of 2044.

You are hired by Nuka-Cola Corporation to develop a software to manage the mixtures. In a confidential report, they tell you there is a simple formula called `BasicCola` from which they derive all the others for their experiments, in particular the secret ingredient for `NukaCola` is cesium 137, a radioactive isotope. Not so healthy, but people love it.

Unfortunately, cesium decays over time with mass getting converted into energy (and other isotopes we don't consider), so you are given this formula:

Amount of cesium after:

> $n_{year} = cesium * 0.97716^{n}$

Implement a class `BasicCola` and a class `NukaCola` which derives from it so that the following code can run:

* Try minimizing the amount of code you write by properly reusing already implemented methods.
* For raising powers you can use `Math.pow(x,n)`.

```java
// TEST
// NOTE: we only pass sugar and caffeine, water is supposed constant = 300 
BasicCola cola = new BasicCola(8.0, 22.0);  

System.out.println("BasicCola:");
System.out.println("  water weight: " + cola.getWater() + " g"); 
System.out.println("  sugar weight: " + cola.getSugar() + " g"); 
System.out.println("  caffeine weight: " + cola.getCaffeine() + " g"); 

System.out.println("  weight today: " + cola.weight() + " g"); 
System.out.println("  weight after 10 years: " + cola.weight(10) + " g");

System.out.println();

NukaCola nuka = new NukaCola(7.0);  // we only pass cesium, sugar=10.0 and caffeine=12.0 are constants

System.out.println("NukaCola:");
System.out.println("  water weight: " + nuka.getWater() + " g"); 
System.out.println("  sugar weight: " + nuka.getSugar() + " g"); 
System.out.println("  caffeine weight: " + nuka.getCaffeine() + " g"); 

System.out.println("  cesium weight today: " + nuka.getCesium() + " g"); 
System.out.println("  cesium weight after 10 years: " + nuka.cesiumLeft(10) + " g"); 
System.out.println("  weight today: " + nuka.weight() + " g"); 
System.out.println("  weight after 10 years: " + nuka.weight(10) + " g");
```

Output:
```java
BasicCola:
  water weight: 300.0 g
  sugar weight: 8.0 g
  caffeine weight: 22.0 g
  weight today: 330.0 g
  weight after 10 years: 330.0 g

NukaCola:
  water weight: 300.0 g
  sugar weight: 10.0 g
  caffeine weight: 12.0 g
  cesium weight today: 7.0 g
  cesium weight after 10 years: 5.555905476644116 g
  weight today: 329.0 g
  weight after 10 years: 327.5559054766441 g
```
---

### *N°4: FindJoin*

Given a `List` of words, write a function `findJoin` which **RETURNS** the first word which ends with the first 3 characters of the next word. If such a word is not found, **RETURN** `null`.

* Try making it efficient, by terminating the cycle as soon as you find the item
* **DO NOT** use break nor continue
* Useful methods: `.endsWith`, `.startsWith`.
* Bonus: write a `check` function to automate tests which raises an exception when result doesn't match expected one.

```java
public static String findJoin(List<String> words){
    // write here
}

// TEST
findJoin(List.of("ciao","zapapp","appzabb","banza","nzagame")); // zapapp
//findJoin(List.of("ciao","zapapp","zapapp", "zabb"));  // null
//findJoin(List.of());  // null
//findJoin(List.of("ciao"));  // null
//findJoin(List.of("ciao","iaoc"));  // ciao
//findJoin(List.of("ciao","aoc", ""));  // null
//findJoin(List.of("bao","ga", "zu", "zum"));  // null
//findJoin(List.of("bao","ga", "zum", "um"));  // null
//findJoin(List.of("bao","ga", "zum", "zum"));  // zum
//findJoin(List.of("bao","ga", "wzam", "zam"));  // wzam
```


---
## Folder Structure

The workspace contains two folders by default, where:

- `src`: the folder to maintain sources
- `lib`: the folder to maintain dependencies

Meanwhile, the compiled output files will be generated in the `bin` folder by default.

> If you want to customize the folder structure, open `.vscode/settings.json` and update the related settings there.

## Dependency Management

The `JAVA PROJECTS` view allows you to manage your dependencies. More details can be found [here](https://github.com/microsoft/vscode-java-dependency#manage-dependencies).

## License
This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details