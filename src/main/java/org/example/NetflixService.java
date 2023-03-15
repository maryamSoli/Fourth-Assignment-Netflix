package org.example;
/*
 *The NetflixService should have an Arraylist of users, tv shows and movies.
 *The NetflixService should have a User object which represents current user.
 */

import java.util.ArrayList;

import java.util.Scanner;

class NetflixService {
    ArrayList<TVShow> theTVshows = new ArrayList();
    ArrayList<Movie> theMovies = new ArrayList();
    Scanner input = new Scanner(System.in);



    public int compareTVshows(TVShow t1, TVShow t2){

        if (t1.getTitle().equalsIgnoreCase(t2.getTitle())){

            System.out.println("Book of this title Already Exists.");

            return 0;

        }

        return 1;

    }
    public void addTVShow(TVShow tvShow){

        for ( TVShow i : theTVshows) {

            if (this.compareTVshows( tvShow , i) == 0)

                return;
        }

        theTVshows.add(tvShow);
    }

    public int compareMovies(Movie m1, Movie m2){

        if (m1.getTitle().equalsIgnoreCase(m2.getTitle())){

            System.out.println("Movie of this title Already Exists.");

            return 0;

        }

        return 1;

    }

    public void addMovie(Movie movie){

        for ( Movie i : theMovies) {

            if (this.compareMovies( movie , i) == 0)

                return;
        }

        theMovies.add(movie);
    }



    public void logout() {
        // Implement logout logic here IN MENY WRITE PRESS 'O' TO LOGOUT
    }

    public void TVshowSearchByTitle(){

        System.out.println("SEARCH BY TITLE tvshow");

        String title;

        System.out.println("Enter title of TVshow:");

        title = input.nextLine();

        int flag = 0;

        System.out.println("title - genre - release year - duration - rating - cast");

        for (TVShow i : theTVshows ){

            if (i.getTitle() == title){

                System.out.println(i.getTitle() + "\t\t" + i.getGenre() + "\t\t" + i.getReleaseYear() + "\t\t" + i.getDuration() + "\t\t" + i.getRating() + "\t\t" + i.cast);

                flag++;

            }
        }

        if (flag == 0){

            System.out.println("TVshow with title " + title + " not Found.");
        }

    }

    public void TVshowSearchByGenre(){

        System.out.println("SEARCH BY GENRE tvshow");

        String genre;

        System.out.println("Enter genre of TVshow:");

        genre = input.nextLine();

        int flag = 0;

        System.out.println("title - genre - release year - duration - rating - cast");

        for (TVShow i : theTVshows ){

            if (i.getGenre() == genre){

                System.out.println(i.getTitle() + "\t\t" + i.getGenre() + "\t\t" + i.getReleaseYear() + "\t\t" + i.getDuration() + "\t\t" + i.getRating() + "\t\t" + i.cast);

                flag++;

            }
        }

        if (flag == 0){

            System.out.println("TVshow with genre " + genre + " not Found.");
        }

    }

    public void TVshowSearchByReleaseYear(){

        System.out.println("SEARCH BY RELEASE YEAR tvshow");

        String releaseYear;

        System.out.println("Enter release year of TVshow:");

        releaseYear = input.nextLine();

        int flag = 0;

        System.out.println("title - genre - release year - duration - rating - cast");

        for (TVShow i : theTVshows ){

            if (i.getReleaseYear() == releaseYear){

                System.out.println(i.getTitle() + "\t\t" + i.getGenre() + "\t\t" + i.getReleaseYear() + "\t\t" + i.getDuration() + "\t\t" + i.getRating() + "\t\t" + i.cast);

                flag++;

            }
        }

        if (flag == 0){

            System.out.println("TVshow with release year " + releaseYear + " not Found.");
        }

    }



    public void MovieSearchByTitle(){

        System.out.println("SEARCH BY TITLE movie");

        String title;

        System.out.println("Enter title of Movie:");

        title = input.nextLine();

        int flag = 0;

        System.out.println("title - genre - release year - duration - rating - cast - length");

        for (Movie i : theMovies ){

            if (i.getReleaseYear() == title){

                System.out.println(i.getTitle() + "\t\t" + i.getGenre() + "\t\t" + i.getReleaseYear() + "\t\t" + i.getDuration() + "\t\t" + i.getRating() + "\t\t" + i.cast + "\t\t" + i.getLength());

                flag++;

            }
        }

        if (flag == 0){

            System.out.println("Movie with title " + title + " not Found.");
        }

    }

    public void MovieSearchByGenre(){

        System.out.println("SEARCH BY GENRE movie");

        String genre;

        System.out.println("Enter genre of Movie:");

        genre = input.nextLine();

        int flag = 0;

        System.out.println("title - genre - release year - duration - rating - cast - length");

        for (Movie i : theMovies ){

            if (i.getGenre() == genre){

                System.out.println(i.getTitle() + "\t\t" + i.getGenre() + "\t\t" + i.getReleaseYear() + "\t\t" + i.getDuration() + "\t\t" + i.getRating() + "\t\t" + i.cast + "\t\t" + i.getLength());

                flag++;

            }
        }

        if (flag == 0){

            System.out.println("Movie with genre " + genre + " not Found.");
        }

    }

    public void MovieSearchByReleaseYear(){

        System.out.println("SEARCH BY RELEASE YEAR movie");

        String releaseYear;

        System.out.println("Enter release year of Movie:");

        releaseYear = input.nextLine();

        int flag = 0;

        System.out.println("title - genre - release year - duration - rating - cast - length");

        for (Movie i : theMovies ){

            if (i.getReleaseYear() == releaseYear){

                System.out.println(i.getTitle() + "\t\t" + i.getGenre() + "\t\t" + i.getReleaseYear() + "\t\t" + i.getDuration() + "\t\t" + i.getRating() + "\t\t" + i.cast + "\t\t" + i.getLength());

                flag++;

            }
        }

        if (flag == 0){

            System.out.println("Movie with release year " + releaseYear + " not Found.");
        }

    }

    public void showAllTVshows(){

        System.out.println("SHOWING ALL TVSHOWS");

        System.out.println("title - genre - release date - duration - rating - cast");

        for (TVShow i : theTVshows ) {

            System.out.println(i.getTitle() + "\t\t" + i.getGenre() + "\t\t" + i.getReleaseYear() + "\t\t" + i.getDuration() + "\t\t" + i.getRating() + "\t\t" + i.cast);

        }

    }

    public void showAllMovies(){

        System.out.println("SHOWING ALL Movies");

        System.out.println("title - genre - release date - duration - rating - cast - length");

        for (Movie i : theMovies ) {

            System.out.println(i.getTitle() + "\t\t" + i.getGenre() + "\t\t" + i.getReleaseYear() + "\t\t" + i.getDuration() + "\t\t" + i.getRating() + "\t\t" + i.cast + "\t\t" + i.getLength());

        }

    }

}

