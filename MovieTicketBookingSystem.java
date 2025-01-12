import java.util.*;

class Movie {
    private String name;
    private String genre;
    private int duration; // in minutes

    public Movie(String name, String genre, int duration) {
        this.name = name;
        this.genre = genre;
        this.duration = duration;
    }

    public String getName() {
        return name;
    }

    public String getGenre() {
        return genre;
    }

    public int getDuration() {
        return duration;
    }

    @Override
    public String toString() {
        return name + " (" + genre + ", " + duration + " mins)";
    }
}

class Seat {
    private int row;
    private int number;
    private boolean isBooked;

    public Seat(int row, int number) {
        this.row = row;
        this.number = number;
        this.isBooked = false;
    }

    public boolean isBooked() {
        return isBooked;
    }

    public void book() {
        this.isBooked = true;
    }

    @Override
    public String toString() {
        return "Row " + row + " Seat " + number + (isBooked ? " [Booked]" : " [Available]");
    }
}

class Theater {
    private Movie movie;
    private Seat[][] seats;

    public Theater(Movie movie, int rows, int seatsPerRow) {
        this.movie = movie;
        this.seats = new Seat[rows][seatsPerRow];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < seatsPerRow; j++) {
                seats[i][j] = new Seat(i + 1, j + 1);
            }
        }
    }

    public Movie getMovie() {
        return movie;
    }

    public void displaySeats() {
        System.out.println("\nAvailable Seats:");
        for (Seat[] row : seats) {
            for (Seat seat : row) {
                System.out.print(seat + "\t");
            }
            System.out.println();
        }
    }

    public boolean bookSeat(int row, int number) {
        if (row < 1 || row > seats.length || number < 1 || number > seats[0].length) {
            System.out.println("Invalid seat selection.");
            return false;
        }

        Seat seat = seats[row - 1][number - 1];
        if (seat.isBooked()) {
            System.out.println("Seat is already booked.");
            return false;
        } else {
            seat.book();
            System.out.println("Seat successfully booked.");
            return true;
        }
    }
}

public class MovieTicketBookingSystem {
    private static List<Theater> theaters = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Initialize movies and theaters
        Movie movie1 = new Movie("Inception", "Sci-Fi", 148);
        Movie movie2 = new Movie("Titanic", "Romance", 195);
        theaters.add(new Theater(movie1, 5, 5));
        theaters.add(new Theater(movie2, 6, 6));

        System.out.println("Welcome to the Movie Ticket Booking System!");

        while (true) {
            System.out.println("\nChoose an option:");
            System.out.println("1. Browse Movies");
            System.out.println("2. Exit");
            int choice = scanner.nextInt();

            if (choice == 1) {
                browseMovies(scanner);
            } else if (choice == 2) {
                System.out.println("Thank you for using the system. Goodbye!");
                break;
            } else {
                System.out.println("Invalid choice. Please try again.");
            }
        }

        scanner.close();
    }

    private static void browseMovies(Scanner scanner) {
        System.out.println("\nAvailable Movies:");
        for (int i = 0; i < theaters.size(); i++) {
            System.out.println((i + 1) + ". " + theaters.get(i).getMovie());
        }

        System.out.print("\nSelect a movie (enter number): ");
        int movieChoice = scanner.nextInt();
        if (movieChoice < 1 || movieChoice > theaters.size()) {
            System.out.println("Invalid movie selection.");
            return;
        }

        Theater selectedTheater = theaters.get(movieChoice - 1);
        selectedTheater.displaySeats();

        System.out.print("\nEnter row number to book: ");
        int row = scanner.nextInt();
        System.out.print("Enter seat number to book: ");
        int seat = scanner.nextInt();

        selectedTheater.bookSeat(row, seat);
    }
}
