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

    public boolean loginChecker;

    ArrayList<User> theUsers = new ArrayList();

    ArrayList<TVShow> favoriteTVshows = new ArrayList();

    ArrayList<Movie> favoriteMovies = new ArrayList();

    ArrayList<TVShow> watchHistoryTVshows = new ArrayList();

    ArrayList<Movie> watchHistoryMovies = new ArrayList();

    Scanner input = new Scanner(System.in);

    public void createAccount(){

        User u = new User();

        int flag = 0;

        for (User i : theUsers) {

            if (u.getPassWord().equals(i.getPassWord())){

                System.out.println("user with password " + u.getPassWord() + " is Already Registered.");

                flag++;

            }

            if (u.getUserName().equals(i.getUserName())){

                System.out.println("user with user name " + u.getUserName() + "is already registered");

                flag++;

            }

        }

        if (flag == 0){

            theUsers.add(u);

            System.out.println("Account Created !");

        }


    }





    public void login(){

        User u = new User();

        int flag = 0;

        for (User i : theUsers) {

            if (u.getUserName().equals(i.getUserName()) && u.getPassWord().equals(i.getPassWord())) {

                System.out.println("Login Successfully!");

                flag++;

                loginChecker = true;

            }

        }

        if (flag == 0){

            System.out.println("User is not Registered.");

            System.out.println("Create Account First.");

            loginChecker = false;

        }

    }






    public void addToFavoritesTVshows(TVShow show , NetflixService TVshows) {

        System.out.println("enter the title of your favorite tvshow from tvshow list to add to your favorite list");

        //System.out.println("title - genre - release date - duration - rating - cast");

        TVshows.showAllTVshows();

        String title = input.nextLine();

        for (TVShow i : TVshows.theTVshows ){

            if (i.getTitle().equalsIgnoreCase(title)){

                favoriteTVshows.add(i);
            }

        }

    }




    public void removeFromFavoritesTVshows(TVShow show , NetflixService shows) {

        System.out.println("enter the title of the TVshow that you want to remove from your favorite list");

        viewFavoritesTVshows();

        String title  = input.nextLine();

        for (TVShow i : favoriteTVshows){

            if (i.getTitle().equalsIgnoreCase(title)){

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




    public void addToFavoritesMovies(TVShow movie , NetflixService movies) {

        System.out.println("enter the title of your favorite movie from movie list to add to your favorite list");

       // System.out.println("title - genre - release date - duration - rating - cast - length");

        movies.showAllMovies();

        String title = input.nextLine();

        for (Movie i : movies.theMovies ){

            if (i.getTitle().equalsIgnoreCase(title)){

                favoriteMovies.add(i);
            }

        }

    }




    public void removeFromFavoritesMovies(TVShow movie , NetflixService movies) {

        System.out.println("enter the title of the movie that you want to remove from your favorite list");

        viewFavoritesMovies();

        String title  = input.nextLine();

        for (Movie i : favoriteMovies){

            if (i.getTitle().equalsIgnoreCase(title)){

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

            if (i.getTitle().equalsIgnoreCase(title)){

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

            if (i.getGenre().equalsIgnoreCase(genre)){

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

            if (i.getReleaseYear().equalsIgnoreCase(releaseYear)){

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

            if (i.getTitle().equalsIgnoreCase(title)){

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

            if (i.getGenre().equalsIgnoreCase(genre)){

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

            if (i.getReleaseYear().equalsIgnoreCase(releaseYear)){

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

                if (i.getGenre().equalsIgnoreCase(j)){

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

                if (i.getGenre().equalsIgnoreCase(j)){

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

            if (i.getTitle().equalsIgnoreCase(title)){

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

            if (i.getTitle().equalsIgnoreCase(title)){

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
