package miniProject;

import java.util.HashMap;
import java.util.Scanner;


class UserDetails {
    String userName, userPassword, userEmail;


    UserDetails() {
        this.userName = "Yash";
        this.userPassword = "123456";
        this.userEmail = "yash@gmail.com";
    }


    void signUp(String userName, String userPassword, String userEmail, int phoneNo) {
        this.userName = userName;
        this.userPassword = userPassword;
        this.userEmail = userEmail;
    }


    boolean signIn(String userName, String userPassword) {
        if (this.userName.equals(userName) && this.userPassword.equals(userPassword)) {
            System.out.println("Successfully Signed In");
            return true;
        } else
            System.out.println("Invalid UserName or Password");
        return false;
    }

}

class Movie{
    String userSelectedMovie;

    void selectGenre(){
        int genre=1;
        Scanner sc = new Scanner(System.in);
        System.out.println("--");
        System.out.println("\nSELECT GENRE");
        System.out.println("Genre Menu: \n1. Action \n2. BioGraphy \n3. Romantic \n4. Comedy \n5. Exit");
        System.out.print("Enter your genre choice in digit\t");
        genre = sc.nextInt ();


        switch (genre){
            case 1:
                System.out.println("\n1. RRR: \nRRR is a period drama set in India during the 1920s, \nrevolving around the inspiring journey of tw");
                selectMovie();
                break;
            case 2:
                System.out.println("\n3. Gangubai Kathiawadi: \n The rise of a simple girl from Kathiawad who had no choice but \nto embrace the wa");
                selectMovie();
                break;
            case 3:
                System.out.println("\n5. Vishu: \nVishu, a guy with a happy go lucky attitude meets Aarvi Kalsekar, \na headstrong and straightforw");
                selectMovie();
                break;
            case 4:
                System.out.println("\n6. The Lost City");
                selectMovie();
                break;
            default:
                System.out.println("Existing as wrong input");
        }
    }

    void selectMovie(){
        int selectedMovieIndex;
        HashMap<Integer, String> hashmapMovie = new HashMap<>();
        Scanner sc = new Scanner(System.in);

        //Put <index, movie> in HashMap
        hashmapMovie.put(1, "RRR");
        hashmapMovie.put(2, "Attack Part 1");
        hashmapMovie.put(3, "Gangubai Kathiawadi");
        hashmapMovie.put(4,"Jhund");
        hashmapMovie.put(5,"Vishu");
        hashmapMovie.put(6, "The Lost City");
        System.out.println("-");
        System.out.print("\nSelect the Movie...Enter digit asssociated with the movie\t");
        selectedMovieIndex = sc.nextInt ();
        userSelectedMovie = hashmapMovie.get (selectedMovieIndex);
        System.out.println("Movie selected :\t" + userSelectedMovie);
    }
}


class Theatre {
    String language, location, time;
    int noOfSeats;
    void selectTheatre () {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter language English/ Hindi/ Marathi/ Telugu: \t");
        language = sc.next();
        System.out.print("Enter number of seats to be booked: \t");
        noOfSeats = sc.nextInt ();
        System.out.print("Enter Location (Mumbai/ Bengaluru/ Chandigarh/ Chennai/ Pune/ Kolkata): \t");
        location = sc.next();
        System.out.print("Enter time slot (9am / 12pm / 3pm / 6pm /9pm): \t");
        time = sc.next();
    }
}


class Meal {
    String selectedSnack;
    void selectMeal(){
        int snack;
        Scanner sc = new Scanner(System.in);
        HashMap<Integer, String> snackMap = new HashMap<>();
        System.out.println("\nAdd a snack too");
        snackMap.put(1, "Coke");
        snackMap.put(2, "Caramel Popcorn");
        snackMap.put(3, "Salted Popcorn");
        snackMap.put(4, "Cheese Popcorn");
        System.out.println("\n1.Coke \n2. Caramel Popcorn \n3. Salted Popcorn \n4. Cheese Popcorn");
        System.out.print("Enter your choice in digit\t");
        snack = sc.nextInt ();
        selectedSnack = snackMap.get (snack);
    }
}


class Payment {
    void makePayment (int noOfSeats, String selectedSnack) {
        int paymentMethod;
        Scanner sc = new Scanner(System.in);
        Payment paymentObj = new Payment();
        System.out.println("--");
        System.out.println("\nPAYMENT WINDOW\n");
        System.out.println("Cost of movie seats: \n No of seats: " + noOfSeats + " *250 = " + (noOfSeats * 250));
        System.out.println("Cost of meal seats: \n Meal selected: " + selectedSnack + "=200");
        System.out.println("Total = " + ((noOfSeats * 250) + 200));

        System.out.println("\nSelect   payment method: \n1. Debit or Credit \n2. Net Banking \n3. UPI");
        System.out.print("Enter your choice in digit: \t");
        paymentMethod = sc.nextInt();

        switch (paymentMethod){
            case 1:
                System.out.print("Enter card number: \t");
                sc.nextInt();
                System.out.print("Enter expiry: \t");
                sc.next();
                System.out.print("Enter CW: \t");
                sc.nextInt();
                break;
            case 2:
                System.out.println("1. SBI \n2. ICICI \n3. HDFC \n4. Axis");
                sc.nextInt();
                System.out.println("1. NEFT \n2. RTGS \n3. ECS \n4. IMPS");
                sc.nextInt();
                break;
            case 3:
                System.out.println("1. PhonePe \n2. Paytm \n3. Google pay \n4. Amazon Pay");
                sc.nextInt();
                break;
        }
        System.out.println("Successfully paid");
    }
}


class Ticket{
    void ticketSMS (String userName, String userSelectedMovie, String language, String location, String time, int noOfSeats) {

        System.out.println("--");
        System.out.println("\nTicket:");
        System.out.println("-");
        System.out.println("Name :\t" + userName);
        System.out.println("Movie:\t" + userSelectedMovie);
        System.out.println("Language:\t" + language);
        System.out.println("Location:\t" + location);
        System.out.println("Time :\t" + time);
        System.out.println("No of Seats :\t" + noOfSeats);
        System.out.println("-");
        System.exit(0);
    }
}

public class javaMiniProject{
    public static void main(String args[]){
        int loginChoice = 1, phoneNo;
        String userName, userPassword, userEmail;
        Scanner sc = new Scanner(System.in);
        UserDetails userDetailsObj = new UserDetails();
        System.out.println("Written By YASH");
        System.out.println("BOOK my SHOW\n");
        System.out.println("Login Menu: \n1. Sign In \n2. Sign Up \n3. Exit");
        while(loginChoice!=3) {
            System.out.print("Enter your login choice digit:\t");
            loginChoice = sc.nextInt();

            switch (loginChoice) {
                case 1:
                    System.out.println("-");
                    System.out.println("\nSIGN IN TO BOOK MY SHOW\n");
                    System.out.print("UserName: \t");
                    userName = sc.next();
                    System.out.print("Password: \t");
                    userPassword = sc.next();
                    if (userDetailsObj.signIn(userName, userPassword)) {
                        Movie movieObj = new Movie();
                        movieObj.selectGenre();
                        Theatre theatreObj = new Theatre ();
                        theatreObj.selectTheatre();
                        Meal mealObj = new Meal();
                        mealObj.selectMeal();
                        Payment paymentObj = new Payment();
                        paymentObj.makePayment (theatreObj.noOfSeats, mealObj.selectedSnack);
                        Ticket ticketObj= new Ticket();
                        ticketObj.ticketSMS (userDetailsObj.userName, movieObj.userSelectedMovie, theatreObj.language, theatreObj.location, theatreObj.time, theatreObj.noOfSeats);
                    }
                    break;
                case 2:
                    System.out.println("--");
                    System.out.println("\nSIGN UP TO BOOK MY SHOW\n");
                    System.out.print("UserName:\t");
                    userName=sc.next();

                    System.out.print("Password:\t");
                    userPassword=sc.next();

                    System.out.print("Email Id:\t");
                    userEmail=sc.next();

                    System.out.print("Phone Number:\t");
                    phoneNo=sc.nextInt();
                    userDetailsObj.signUp(userName,userPassword,userEmail,phoneNo);
                    break;
                case 3:
                    System.out.println("Exiting");
                    System.exit(0);
                default:
                    System.out.println("Login Menu:\n1.Sign In\n2.Sign Up\n3.Exit");
            }
        }
        sc.close();
    }
}
