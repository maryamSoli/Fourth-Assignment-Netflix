package org.example;
/*
 * The user should contain username password.
 * The user should contain an ArrayList of favorite shows and watch history.
 * FUNCTION: the user should have a function to watch a show and add it to watch history.
 *  *** NOTE: All search functions in user are for searching in favorite shows ***
 */
import java.util.ArrayList;
import java.util.Scanner;

public class Users {

    ArrayList<User> theUsers = new ArrayList();
    ArrayList<TVShow> favoriteTVshows = new ArrayList();
    ArrayList<Movie> favoriteMovies = new ArrayList();
    ArrayList<TVShow> watchHistoryTVshows = new ArrayList();
    ArrayList<Movie> watchHistoryMovies = new ArrayList();
    Scanner input = new Scanner(System.in);

    public void createAccount(User u){

        for (User i : theUsers) {

            if (u.getPassWord().equals(i)){

                System.out.println("user of password " + u.getPassWord() + " is Already Registered.");

            }

        }

        theUsers.add(u);

    }


    public int login(){

        System.out.println("Enter password:");

        User u = new User();

        u.setPassWord(input.nextLine());

        for (User i : theUsers){

            if (u.getPassWord().equals(i)){

                return 2;

            }

        }


        System.out.println("user is not Registered.");

        System.out.println("Get Registered First.");

        return -1;

    }

    public void addToFavoritesTVshows(TVShow show , NetflixService TVshows) {

        System.out.println("enter the title of your favorite tvshow from tvshow list to add to your favorite list");

        System.out.println("title - genre - release date - duration - rating - cast");

        TVshows.showAllTVshows();

        String title = input.nextLine();

        for (TVShow i : TVshows.theTVshows ){

            if (title == i.getTitle()){

                favoriteTVshows.add(i);
            }
        }
    }

    public void removeFromFavoritesTVshows(TVShow show , NetflixService shows) {

        System.out.println("enter the title of the TVshow that you want to remove from your favorite list");

        viewFavoritesTVshows();

        String title  = input.nextLine();

        for (TVShow i : favoriteTVshows){

            if (title == i.getTitle()){

                favoriteTVshows.remove(i);
            }
        }
    }
    public void viewFavoritesTVshows() {

        for (TVShow i : favoriteTVshows ){

            System.out.println("title - genre - release date - duration - rating - cast");

            System.out.println(i.getTitle() + "\t\t" + i.getGenre() + "\t\t" + i.getReleaseYear() + "\t\t" + i.getDuration() + "\t\t" + i.getRating() + "\t\t" + i.cast);

        }
    }

    public void addToFavoritesMovies(Movie movie , NetflixService movies) {

        System.out.println("enter the title of your favorite movie from movie list to add to your favorite list");

        System.out.println("title - genre - release date - duration - rating - cast - length");

        movies.showAllMovies();

        String title = input.nextLine();

        for (Movie i : movies.theMovies ){

            if (title == i.getTitle()){

                favoriteMovies.add(i);
            }
        }
    }

    public void removeFromFavoritesMovies(Movie movie , NetflixService movies) {

        System.out.println("enter the title of the movie that you want to remove from your favorite list");

        viewFavoritesMovies();

        String title  = input.nextLine();

        for (Movie i : favoriteMovies){

            if (title == i.getTitle()){

                favoriteMovies.remove(i);
            }
        }
    }
    public void viewFavoritesMovies() {

        for (Movie i : favoriteMovies ){

            System.out.println("title - genre - release date - duration - rating - cast - length");

            System.out.println(i.getTitle() + "\t\t" + i.getGenre() + "\t\t" + i.getReleaseYear() + "\t\t" + i.getDuration() + "\t\t" + i.getRating() + "\t\t" + i.cast + "\t\t" + i.getLength());

        }
    }

    public void TVshowSearchByTitleFavorites(){

        System.out.println("SEARCH BY TITLE");

        String title;

        System.out.println("Enter title of TVshow:");

        title = input.nextLine();

        int flag = 0;

        System.out.println("title - genre - release year - duration - rating - cast");

        for (TVShow i : favoriteTVshows ){

            if (i.getTitle() == title){

                System.out.println(i.getTitle() + "\t\t" + i.getGenre() + "\t\t" + i.getReleaseYear() + "\t\t" + i.getDuration() + "\t\t" + i.getRating() + "\t\t" + i.cast);

                flag++;

            }
        }

        if (flag == 0){

            System.out.println("TVshow with title " + title + " not Found.");
        }

    }

    public void TVshowSearchByGenreFavorites(){

        System.out.println("SEARCH BY GENRE");

        String genre;

        System.out.println("Enter genre of TVshow:");

        genre = input.nextLine();

        int flag = 0;

        System.out.println("title - genre - release year - duration - rating - cast");

        for (TVShow i : favoriteTVshows ){

            if (i.getGenre() == genre){

                System.out.println(i.getTitle() + "\t\t" + i.getGenre() + "\t\t" + i.getReleaseYear() + "\t\t" + i.getDuration() + "\t\t" + i.getRating() + "\t\t" + i.cast);

                flag++;

            }
        }

        if (flag == 0){

            System.out.println("TVshow with genre " + genre + " not Found.");
        }

    }

    public void TVshowSearchByReleaseYearFavorites(){

        System.out.println("SEARCH BY RELEASE YEAR");

        String releaseYear;

        System.out.println("Enter release year of TVshow:");

        releaseYear = input.nextLine();

        int flag = 0;

        System.out.println("title - genre - release year - duration - rating - cast");

        for (TVShow i : favoriteTVshows ){

            if (i.getReleaseYear() == releaseYear){

                System.out.println(i.getTitle() + "\t\t" + i.getGenre() + "\t\t" + i.getReleaseYear() + "\t\t" + i.getDuration() + "\t\t" + i.getRating() + "\t\t" + i.cast);

                flag++;

            }
        }

        if (flag == 0){

            System.out.println("TVshow with release year " + releaseYear + " not Found.");
        }

    }



    public void MovieSearchByTitleFavorites(){

        System.out.println("SEARCH BY TITLE movie");

        String title;

        System.out.println("Enter title of Movie:");

        title = input.nextLine();

        int flag = 0;

        System.out.println("title - genre - release year - duration - rating - cast - length");

        for (Movie i : favoriteMovies ){

            if (i.getReleaseYear() == title){

                System.out.println(i.getTitle() + "\t\t" + i.getGenre() + "\t\t" + i.getReleaseYear() + "\t\t" + i.getDuration() + "\t\t" + i.getRating() + "\t\t" + i.cast + "\t\t" + i.getLength());

                flag++;

            }
        }

        if (flag == 0){

            System.out.println("Movie with title " + title + " not Found.");
        }

    }

    public void MovieSearchByGenreFavorites(){

        System.out.println("SEARCH BY GENRE movie");

        String genre;

        System.out.println("Enter genre of Movie:");

        genre = input.nextLine();

        int flag = 0;

        System.out.println("title - genre - release year - duration - rating - cast - length");

        for (Movie i : favoriteMovies ){

            if (i.getGenre() == genre){

                System.out.println(i.getTitle() + "\t\t" + i.getGenre() + "\t\t" + i.getReleaseYear() + "\t\t" + i.getDuration() + "\t\t" + i.getRating() + "\t\t" + i.cast + "\t\t" + i.getLength());

                flag++;

            }
        }

        if (flag == 0){

            System.out.println("Movie with genre " + genre + " not Found.");
        }

    }

    public void MovieSearchByReleaseYearFavorites(){

        System.out.println("SEARCH BY RELEASE YEAR movie");

        String releaseYear;

        System.out.println("Enter release year of Movie:");

        releaseYear = input.nextLine();

        int flag = 0;

        System.out.println("title - genre - release year - duration - rating - cast - length");

        for (Movie i : favoriteMovies ){

            if (i.getReleaseYear() == releaseYear){

                System.out.println(i.getTitle() + "\t\t" + i.getGenre() + "\t\t" + i.getReleaseYear() + "\t\t" + i.getDuration() + "\t\t" + i.getRating() + "\t\t" + i.cast + "\t\t" + i.getLength());

                flag++;

            }
        }

        if (flag == 0){

            System.out.println("Movie with release year " + releaseYear + " not Found.");
        }

    }

    public void getRecommendationBasedOnGenreTVshow(NetflixService show){

        System.out.println("RECOMMENDED TVSHOWS:");

        System.out.println("title - genre - release year - duration - rating - cast");

        ArrayList<String> GenresExistingInTVshowFavoriteList = new ArrayList();

        for(TVShow i : favoriteTVshows){

            GenresExistingInTVshowFavoriteList.add(i.getGenre());
        }

        for (TVShow i : show.theTVshows ){

            for (String j : GenresExistingInTVshowFavoriteList ){

                if (j == i.getGenre()){

                    System.out.println(i.getTitle() + "\t\t" + i.getGenre() + "\t\t" + i.getReleaseYear() + "\t\t" + i.getDuration() + "\t\t" + i.getRating() + "\t\t" + i.cast);

                }
            }
        }
    }

    public void getRecommendationBasedOnGenreMovie(NetflixService movie){

        System.out.println("RECOMMENDED MOVIES:");

        System.out.println("title - genre - release year - duration - rating - cast - length");

        ArrayList<String> GenresExistingInMoviesFavoriteList = new ArrayList();

        for(Movie i : favoriteMovies){

            GenresExistingInMoviesFavoriteList.add(i.getGenre());
        }

        for (Movie i : movie.theMovies ){

            for (String j : GenresExistingInMoviesFavoriteList ){

                if (j == i.getGenre()){

                    System.out.println(i.getTitle() + "\t\t" + i.getGenre() + "\t\t" + i.getReleaseYear() + "\t\t" + i.getDuration() + "\t\t" + i.getRating() + "\t\t" + i.cast + "\t\t" + i.getLength());

                }
            }
        }
    }


    public  void watchTVshow (NetflixService show){

        System.out.println("ENTER THE TITLE OF TVSHOW THAT YOU WANT TO WATCH ");

        System.out.println("title - genre - release date - duration - rating - cast");

        String title = input.nextLine();

        for (TVShow i : show.theTVshows){

            if (title == i.getTitle()){

                System.out.println(i.getTitle() + "\t\t" + i.getGenre() + "\t\t" + i.getReleaseYear() + "\t\t" + i.getDuration() + "\t\t" + i.getRating() + "\t\t" + i.cast);

                watchHistoryTVshows.add(i);
            }
        }
    }

    public void showWatchingHistoryForTVshows(){

        System.out.println("SHOWING WATCH HISTORY");

        System.out.println("title - genre - release date - duration - rating - cast");

        for (TVShow i : watchHistoryTVshows){

            System.out.println(i.getTitle() + "\t\t" + i.getGenre() + "\t\t" + i.getReleaseYear() + "\t\t" + i.getDuration() + "\t\t" + i.getRating() + "\t\t" + i.cast);
        }
    }

    public  void watchMovie (NetflixService movie){

        System.out.println("ENTER THE TITLE OF MOVIE THAT YOU WANT TO WATCH ");

        System.out.println("title - genre - release date - duration - rating - cast - length");

        String title = input.nextLine();

        for (Movie i : movie.theMovies){

            if (title == i.getTitle()){

                System.out.println(i.getTitle() + "\t\t" + i.getGenre() + "\t\t" + i.getReleaseYear() + "\t\t" + i.getDuration() + "\t\t" + i.getRating() + "\t\t" + i.cast + "\t\t" + i.getLength());

                watchHistoryMovies.add(i);
            }
        }
    }

    public void showWatchingHistoryForMovies(){

        System.out.println("SHOWING WATCH HISTORY");

        System.out.println("title - genre - release date - duration - rating - cast - length");

        for (Movie i : watchHistoryMovies){

            System.out.println(i.getTitle() + "\t\t" + i.getGenre() + "\t\t" + i.getReleaseYear() + "\t\t" + i.getDuration() + "\t\t" + i.getRating() + "\t\t" + i.cast + "\t\t" + i.getLength());
        }
    }
}
