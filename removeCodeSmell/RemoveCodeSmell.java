package removeCodeSmell;

import actions.Rental;
import customer.Customer;
import movies.Genre;
import movies.MovieChildren;
import movies.MovieNew;
import movies.MovieRegular;

public class RemoveCodeSmell {

  public static void main(String[] args) {
    
    //create customer
    Customer customer = new Customer("Thomas", 1);
    //create rental
    Rental rental = new Rental();
    //create movie
    rental.addMovie(new MovieNew("Starbucks Wars", 3, Genre.HORROR));
    rental.addMovie(new MovieChildren("Peter Pot", 5, Genre.CHILREN));
    rental.addMovie(new MovieRegular("Chronicles of Nah Nah", 4, Genre.ROMANCE));

    
    customer.setRental(rental);
    
    //print it
    System.out.println(customer.statement());
    System.out.println();
    System.out.println(customer.toXML());
    System.out.println(rental.toXML());

  }

}
