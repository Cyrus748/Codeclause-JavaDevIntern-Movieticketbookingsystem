# Codeclause-JavaDevIntern-Movieticketbookingsystem


This is a console-based Java application that allows users to browse movies, check seat availability, and book tickets. It demonstrates core Object-Oriented Programming (OOP) principles and provides an interactive user experience through the command line.

## Features

1. **Browse Movies**: Displays a list of available movies with details like name, genre, and duration.
2. **View Seat Availability**: Shows a seating chart for the selected movie, indicating booked and available seats.
3. **Book Tickets**: Allows users to select a seat and book it for a chosen movie.

## Technologies Used

- **Java**: Core programming language.
- **OOP Principles**: Encapsulation, classes, and methods to structure the code.

## Project Structure

```
MovieTicketBookingSystem
├── MovieTicketBookingSystem.java  # Main entry point of the application
├── Movie.java                     # Represents movie details
├── Seat.java                      # Represents seat details
├── Theater.java                   # Manages movie and seating information
```

## How to Set Up and Run the Project

### Prerequisites

- Java Development Kit (JDK) installed (version 8 or later).
- A code editor or IDE (e.g., IntelliJ IDEA, Eclipse, or Visual Studio Code).

### Steps to Run

1. **Clone the repository** or download the project files.
2. Save all files in a single directory, ensuring the file names match the class names:
   - `MovieTicketBookingSystem.java`
   - `Movie.java`
   - `Seat.java`
   - `Theater.java`
3. Open a terminal or your IDE and navigate to the project directory.
4. Compile the project:
   ```
   javac MovieTicketBookingSystem.java
   ```
5. Run the project:
   ```
   java MovieTicketBookingSystem
   ```
6. Follow the on-screen instructions to browse movies and book tickets.

## Code Explanation

### `Movie.java`
Represents a movie with the following attributes:
- `name`: Movie name.
- `genre`: Movie genre.
- `duration`: Duration of the movie in minutes.

Provides getters and a `toString` method for easy display.

### `Seat.java`
Manages seating information:
- `row` and `number`: Position of the seat.
- `isBooked`: Boolean indicating whether the seat is booked.

Includes methods to check and update booking status.

### `Theater.java`
Handles movie and seat management:
- `movie`: The movie being shown.
- `seats`: A 2D array of `Seat` objects representing the seating chart.

Provides methods to display available seats and book a specific seat.

### `MovieTicketBookingSystem.java`
The main application:
- Initializes the movie list and theaters.
- Provides a menu for users to browse movies, view seat availability, and book tickets.

## Sample Output

```
Welcome to the Movie Ticket Booking System!

Choose an option:
1. Browse Movies
2. Exit

Available Movies:
1. Inception (Sci-Fi, 148 mins)
2. Titanic (Romance, 195 mins)

Select a movie (enter number): 1

Available Seats:
Row 1 Seat 1 [Available]	Row 1 Seat 2 [Available]	...

Enter row number to book: 1
Enter seat number to book: 1

Seat successfully booked.
```

## Learning Outcomes

- Understanding and applying OOP principles in Java.
- Building interactive console-based applications.
- Managing collections and arrays in Java.

## Future Enhancements

- Add a graphical user interface (GUI).
- Implement user authentication for booking management.
- Save booking details to a file or database for persistence.

---
Feel free to contribute to the project by submitting pull requests or suggesting improvements!
