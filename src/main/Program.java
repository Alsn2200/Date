package main;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Program {

    public static void main(String[] args) throws Exception {

        DateTimeFormatter form01 = DateTimeFormatter.ofPattern("dd/MM/yyyy"); // data formatada
        DateTimeFormatter form02 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        LocalDate data01 = LocalDate.now(); // Data local
        LocalDateTime data02 = LocalDateTime.now(); // Data e hora Local
        Instant data03 = Instant.now(); // Data formato GMT Londres 3 horas + do horario Local
        LocalDate data04 = LocalDate.parse("2023-02-05"); // data Local Inserida pelo programa
        LocalDateTime data05 = LocalDateTime.parse("2023-02-05T12:30:15"); // data e hora local inserida pelo programa
        LocalDate data06 = LocalDate.parse("20/07/2022", form01);
        LocalDateTime data07 = LocalDateTime.parse("23/02/2023 10:30", form02);
        System.out.println(" data 01 = " + data01);
        System.out.println(" data 02 = " + data02);
        System.out.println(" data 03 = " + data03);
        System.out.println(" data 04 = " + data04);
        System.out.println(" data 05 = " + data05);
        System.out.println(" data 06 = " + data06);
        System.out.println(" data 07 = " + data07);

        DateTimeFormatter  form03 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        DateTimeFormatter form04 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());
        System.out.println("data06 = " +data05.format(form03)); // convertendo para string
        
    }
}
