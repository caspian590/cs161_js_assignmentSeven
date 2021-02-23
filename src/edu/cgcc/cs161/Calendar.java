package edu.cgcc.cs161;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;


public class Calendar {
	
	private LocalDate localDate;

    // Constructor
    public Calendar ( LocalDate localDate ) {
        this.localDate = localDate;
    }

    public LocalDate getLocalDate ( ) {
        return localDate;
    }

    public void setLocalDate ( LocalDate localDate ) {
        this.localDate = localDate;
    }

    @Override
    public String toString ( ) {
        return "AppointmentDate{ " +
                "localDate=" + localDate +
                " }";
    }

  
    public static void main ( String[] args ) {
        String input = "23/01/2018";
        DateTimeFormatter f = DateTimeFormatter.ofPattern( "dd/MM/uuuu" );
        LocalDate ld = LocalDate.parse( input , f );
        Calendar ad = new Calendar( ld );
        ad.setLocalDate( ld.plusWeeks( 1 ) );
        LocalDate newValue = ad.getLocalDate();
        System.out.println( newValue.toString() ); 

        List < Calendar > list = new ArrayList <>( 3 );
        list.add( ad );
        list.add( new Calendar( LocalDate.parse( "2018-02-13" ) ) );
        list.add( new Calendar( LocalDate.parse( "2018-12-21" ) ) );
        System.out.println( list );
    }
}

//This code was adapted from https://stackoverflow.com/questions/53403042/appointment-class.