package Actividad3;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, Curso> mapaCursos = new HashMap<>();

        Curso c1 = new Curso("Roco", "Sistemas Operativos");
        Curso c2 = new Curso("Chirino", "Programacion");
        Curso c3 = new Curso("Rigoni", "Java");
        Curso c4 = new Curso("Alberto", "Base de datos");

        mapaCursos.put("A1", c1);
        mapaCursos.put("A2", c2);
        mapaCursos.put("A3", c3);
        mapaCursos.put("A4", c4);

        System.out.println(mapaCursos.get("A3"));
        System.out.println(mapaCursos.get("A1"));

        for (Map.Entry<String, Curso> entry : mapaCursos.entrySet()) {
            System.out.println("Clave: " + entry.getKey() + ", Valor: " + entry.getValue());
        }


    }
}
