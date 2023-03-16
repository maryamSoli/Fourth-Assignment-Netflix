package org.example;

import java.util.Scanner;

public class Main {
    //don't limit yourself to our template ***
    static int movieOrTVshowChoice;

    static Scanner input = new Scanner(System.in);



    public static void main(String[] args) {

        System.out.println("**********************************************************************");
        System.out.println("		                        WELLCOME  			 ");
        System.out.println("**********************************************************************");

        NetflixService Nobj = new NetflixService();

        Users Uobj = new Users();

        int choice;

        int favoriteSearchChoice;

        int wholeSearchChoice;

        do {

            runMenu();

            choice = input.nextInt();

            switch (choice) {

                case 1:

                    movieOrTVshowMenu();

                    if (movieOrTVshowChoice == 1) {

                        TVShow t = new TVShow();

                        t.TVShow();

                        Nobj.addTVShow(t);

                    }

                    else {

                        Movie m = new Movie();

                        m.TVShow();

                        Nobj.addMovie(m);
                    }

                    break;

                case 2:

                    movieOrTVshowMenu();

                    if (movieOrTVshowChoice == 1) {

                        System.out.println("press 1 to search with TITLE");
                        System.out.println("press 2 to search with GENRE");
                        System.out.println("press 3 to search with RELEASE YEAR");

                        wholeSearchChoice = input.nextInt();

                        switch (wholeSearchChoice) {

                            case 1:

                                Nobj.TVshowSearchByTitle();

                                break;

                            case 2:

                                Nobj.TVshowSearchByGenre();

                                break;

                            case 3:

                                Nobj.TVshowSearchByReleaseYear();

                                break;
                        }

                    }

                    else {

                        System.out.println("press 1 to search with TITLE");
                        System.out.println("press 2 to search with GENRE");
                        System.out.println("press 3 to search with RELEASE YEAR");

                        wholeSearchChoice = input.nextInt();

                        switch (wholeSearchChoice) {

                            case 1:

                                Nobj.MovieSearchByTitle();

                                break;

                            case 2:

                                Nobj.MovieSearchByGenre();

                                break;

                            case 3:

                                Nobj.MovieSearchByReleaseYear();

                                break;
                        }

                    }

                    break;

                case 3:

                    movieOrTVshowMenu();

                    if (movieOrTVshowChoice == 1) {

                        Nobj.showAllTVshows();
                    }

                    else {

                        Nobj.showAllMovies();
                    }

                    break;

                case 4:

                    Uobj.createAccount();

                    break;


                case 5:

                    Uobj.login();

                    break;

                case 6:

                    if (Uobj.loginChecker == true) {

                        movieOrTVshowMenu();

                        if (movieOrTVshowChoice == 1) {

                            TVShow t = new TVShow();

                            Uobj.addToFavoritesTVshows(t, Nobj);
                        } else {

                            TVShow t = new TVShow();

                            Uobj.addToFavoritesMovies(t, Nobj);
                        }
                    }

                    else {

                        System.out.println("You can not access this section.\nLogin first!");
                    }

                    break;

                case 7:

                    if (Uobj.loginChecker == true) {

                        movieOrTVshowMenu();

                        if (movieOrTVshowChoice == 1) {

                            TVShow t = new TVShow();

                            Uobj.removeFromFavoritesTVshows(t, Nobj);
                        } else {

                            TVShow t = new TVShow();

                            Uobj.removeFromFavoritesMovies(t, Nobj);
                        }

                    }

                    else {

                        System.out.println("You can not access this section.\nLogin first!");

                        }

                    break;


                case 8:

                    if (Uobj.loginChecker == true){

                        movieOrTVshowMenu();

                        if (movieOrTVshowChoice == 1) {

                            System.out.println("press 1 to search with TITLE");
                            System.out.println("press 2 to search with GENRE");
                            System.out.println("press 3 to search with RELEASE YEAR");

                            favoriteSearchChoice = input.nextInt();

                            switch (favoriteSearchChoice) {

                                case 1:

                                    Uobj.TVshowSearchByTitleFavorites();

                                    break;

                                case 2:

                                    Uobj.TVshowSearchByGenreFavorites();

                                    break;

                                case 3:

                                    Uobj.TVshowSearchByReleaseYearFavorites();

                                    break;

                            }

                        }

                        else {

                            System.out.println("press 1 to search with TITLE");
                            System.out.println("press 2 to search with GENRE");
                            System.out.println("press 3 to search with RELEASE YEAR");

                            favoriteSearchChoice = input.nextInt();

                            switch (favoriteSearchChoice) {

                                case 1:

                                    Uobj.MovieSearchByTitleFavorites();

                                    break;

                                case 2:

                                    Uobj.MovieSearchByGenreFavorites();

                                    break;

                                case 3:

                                    Uobj.MovieSearchByReleaseYearFavorites();

                                    break;

                            }

                        }
                    }

                    else {

                        System.out.println("You can not access this section.\nLogin first!");
                    }


                    break;


                case 9:

                    if (Uobj.loginChecker == true){

                        movieOrTVshowMenu();

                        if (movieOrTVshowChoice == 1) {

                            Uobj.watchTVshow(Nobj);
                        }

                        else {

                            Uobj.watchMovie(Nobj);

                        }
                    }

                   else {

                        System.out.println("You can not access this section.\nLogin first!");
                    }

                    break;

                case 10:

                    if (Uobj.loginChecker == true){

                        movieOrTVshowMenu();

                        if (movieOrTVshowChoice == 1) {

                            Uobj.showWatchingHistoryForTVshows();
                        }

                        else {
                            Uobj.showWatchingHistoryForMovies();

                        }
                    }

                    else {

                        System.out.println("You can not access this section.\nLogin first!");
                    }

                    break;

                case 11:

                    if (Uobj.loginChecker == true){

                        movieOrTVshowMenu();

                        if (movieOrTVshowChoice == 1) {

                            Uobj.getRecommendationBasedOnGenreTVshow(Nobj);
                        }

                        else {

                            Uobj.getRecommendationBasedOnGenreMovie(Nobj);
                        }
                    }

                    else {

                        System.out.println("You can not access this section.\nLogin first!");
                    }

                    break;

                case 12:

                    Uobj.loginChecker = false;

                    break;

                default:

                    System.out.println("COME BACK SOON :) !");

            }

        }


            while (choice != 0) ;

    }




    public static void runMenu(){

        System.out.println("----------------------------------------------------------------------------------------------------------");
        System.out.println("Press 1 to Add new TVshow or movie .");
        System.out.println("Press 2 to Search a TVshow or movie.");
        System.out.println("Press 3 to Show All TVshows or movies.");
        System.out.println("Press 4 to create account.");
        System.out.println("Press 5 to login.");
        System.out.println("Press 6 to add a TVshow or a movie to the list of Favorites. ");
        System.out.println("Press 7 to remove a TVshow or a movie from the list of Favorites. ");
        System.out.println("Press 8 to Search a TVshow or movie in favorite list.");
        System.out.println("Press 9 to watch.");
        System.out.println("Press 10 to see watching history.");
        System.out.println("Press 11 to get Recommendations for TVshow or movie.");
        System.out.println("Press 12 to logout");
        System.out.println("Press 0 to Completely get out of the program");
        System.out.println("-------------------------------------------------------------------------------------------------------");
    }




    public static void movieOrTVshowMenu() {

        System.out.println("press 1 for TVshow");

        System.out.println("press 2 for movie");

        movieOrTVshowChoice = input.nextInt();
    }



}


