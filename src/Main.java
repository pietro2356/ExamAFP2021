import java.util.*;

public class Main {

    public static void main(String[] args) {
        // SEPNUM
        System.out.println("------ SEPNUM ------");
        System.out.println(sepnum(List.of("say 72", "tell 6", "shout 583")));
        System.out.println();

        // MATRIVERBA
        System.out.println("------ MATRIVERBA ------");
        String[][] mat = {
                { "p", "c", "z", "g", "b", "d" },
                { "o", "a", "a", "i", "o", "e" },
                { "r", "l", "n", "a", "r", "n" },
                { "t", "m", "n", "r", "s", "t" },
                { "o", "a", "a", "a", "e", "e" }, };

        System.out.println(matriverba(mat)); // PortoCalmaZannaGiaraBorseDente
        System.out.println();

        // ENERGY DRINK
        System.out.println("------ ENERGY DRINK ------");
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
        System.out.println();

        // FIND JOIN
        System.out.println("------ FIND JOIN ------");
        System.out.println("1 " + checkfindJoin("zapapp", List.of("ciao", "zapapp", "appzabb", "banza", "nzagame")));
        System.out.println("2 " + checkfindJoin(null, List.of()));
        System.out.println("3 " + checkfindJoin(null, List.of("ciao")));
        System.out.println("4 " + checkfindJoin("ciao", List.of("ciao","iaoc")));
        System.out.println("5 " + checkfindJoin(null, List.of("ciao","aoc", "")));
        System.out.println("6 " + checkfindJoin(null, List.of("bao","ga", "zu", "zum")));
        System.out.println("7 " + checkfindJoin(null, List.of("bao","ga", "zum", "um")));
        System.out.println("8 " + checkfindJoin("zum", List.of("bao","ga", "zum", "zum")));
        System.out.println("9 " + checkfindJoin("wzam", List.of("bao","ga", "wzam", "zam")));

    }

    /**
     * SEPNUM
     * Write a function sepnum that takes a list of strings in the format "word number" and RETURN a hashmap which maps each word to the extracted number.
     *
     * @param parole => Lista di parole
     * @return => HashMap estratta dalla lista.
     */
    public static HashMap<String, Integer> sepnum(List<String> parole) {
        HashMap<String, Integer> map = new HashMap<String, Integer>();

        for (String item : parole) {
            String[] tmp = item.split(" ");

            map.put(tmp[0], Integer.parseInt(tmp[1]));
        }

        return map;
    }

    /**
     * MATRIVERBA
     * Write a function which given a matrix of characters, RETURN a string with the words extracted from columns, putting in uppercase the first character of each word.
     *
     * @param matrice => Matrice contenente le parole.
     * @return => Stringa unica con tutte le parole.
     */
    public static String matriverba(String[][] matrice) {
        int row = matrice.length;
        int col = matrice[0].length;

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i <= row; i++) {
            for (int j = 0; j < col - 1; j++) {
                if(matrice[j].length != col){
                    throw new IllegalArgumentException("Lunghezza della riga diversa");
                }

                if (j == 0){
                    sb.append(matrice[j][i].toUpperCase());
                }else{
                    sb.append(matrice[j][i]);
                }
            }
        }

        return sb.toString();
    }

    /**
     * FIND JOIN
     * Given a List of words, write a function findJoin which RETURNS the first word which ends with the first 3 characters of the next word. If such a word is not found, RETURN null.
     *
     * @param words => Lista di parola da confrontare.
     * @return => Stringa.
     */
    public static String findJoin(List<String> words) {
        for (int i = 0; i < words.size() - 1; i++) {
            if (words.get(i).length() >= 3 && words.get(i + 1).length() >= 3){
                String firstTre = words.get(i + 1).substring(0,3);
                String lastTre = words.get(i).substring(words.get(i).length() - 3);

                if (firstTre.equals(lastTre)){
                    return words.get(i);
                }
            }
        }
        return null;
    }

    /**
     * CHECK
     * Funzione di controllo per il metodo: "findJoin()".
     *
     * @param expected => Valore che vogliamo
     * @param words => Set di parole da analizzare
     * @return True se il test ha avuto successo, altrimenti false.
     */
    public static boolean checkfindJoin(String expected, List<String> words){
        if (findJoin(words) == null && expected == null){
            return true;
        }else if (findJoin(words).equals(expected)){
            return true;
        }else {
            return false;
        }
    }
}
