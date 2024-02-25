package Collections2.Question10;

import java.util.*;

class Movie {
    private String title;
    private String director;
    private int releaseYear;

    public Movie(String title, String director, int releaseYear) {
        this.title = title;
        this.director = director;
        this.releaseYear = releaseYear;
    }

    public String getTitle() {
        return title;
    }

    public String getDirector() {
        return director;
    }

    public int getReleaseYear() {
        return releaseYear;
    }
}

public class Main {
    public static void main(String[] args) {
        Queue<Movie> movieQueue = new PriorityQueue<>(Comparator.comparingInt(Movie::getReleaseYear));
        Scanner scanner = new Scanner(System.in);
        while(true) {
            System.out.println("Movie Queue Operations");
            System.out.println("1 - Enqueue Movie");
            System.out.println("2 - Dequeue Movie");
            System.out.println("3 - Display all Movies");
            System.out.println("4 - Exit");
            System.out.print("Enter the choice: ");
            try {
                int ch = scanner.nextInt();
                scanner.nextLine();
                switch (ch) {
                    case 1:
                        System.out.println("Enter Movie Title, Director and Release Year to add: ");
                        String title = scanner.nextLine();
                        String director = scanner.nextLine();
                        int releaseYear = scanner.nextInt();
                        scanner.nextLine();
                        Movie movie = new Movie(title, director, releaseYear);
                        movieQueue.add(movie);
                        System.out.println("Movie enqueued: " + title + " by " + director + " (Year: " + releaseYear + ")");
                        break;
                    case 2:
                        System.out.print("Enter Movie Release Year to remove: ");
                        releaseYear = scanner.nextInt();
                        boolean flag = true;
                        for(Movie currentMovie : movieQueue) {
                            if(currentMovie.getReleaseYear() == releaseYear) {
                                movieQueue.remove(currentMovie);
                                System.out.println("Movie with Release Year " + releaseYear + " dequeued from the movie queue");
                                flag = false;
                                break;
                            }
                        }
                        if(flag)
                            System.out.println("Movie with Release Year " + releaseYear + " not found in the movie queue");
                        break;
                    case 3:
                        if(!movieQueue.isEmpty()) {
                            System.out.println("Movies in ascending order of release year: ");
                            for(Movie currentMovie : movieQueue)
                                System.out.println(currentMovie.getReleaseYear() + " - " + currentMovie.getTitle() + " by " + currentMovie.getDirector());
                        } else
                            System.out.println("MovieQueue is empty");
                        break;
                    case 4:
                        System.out.println("Exiting the program.");
                        scanner.close();
                        return;
                    default:
                        System.out.println("Invalid choice. Please enter a number between  1 and  4.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter an integer.");
                scanner.nextLine();
            }
        }
    }
}
