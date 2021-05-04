/*
Bardillon, Romeo Jr, M.
BSIT 2-2
MovieSeries.java
 */
package programming.assignment2;

public class MovieSeries {
    String title, director, cast;
    int year, season;
    float duration;

    MovieSeries(){
        //Default Constructor
    }

    MovieSeries(String title, int year, int season, String cast){
        this.title = title;
        this.year = year;
        this.season = season;
        this.cast = cast;
    }

    MovieSeries(String title, int year, int season, String cast, String director){
        this.title = title;
        this.year = year;
        this.season = season;
        this.cast = cast;
        this.director = director;
    }

    MovieSeries(String title, int year, float duration, String cast, String director){
        this.title = title;
        this.year = year;
        this.duration = duration;
        this.cast = cast;
        this.director = director;
    }

    MovieSeries(String title, int year, float duration, String director){
        this.title = title;
        this.year = year;
        this.duration = duration;
        this.director = director;
    }
    public static void main(String[] args){
        MovieSeries movieSeries1 = new MovieSeries("Shadow and Bone", 2021, 1, "Ben Barnes");
        MovieSeries movieSeries2 = new MovieSeries("The Mule", 2018, 2.0f, "Clint Eastwood", "Clint Eastwood");
        MovieSeries movieSeries3 = new MovieSeries("Spirited Away", 2001, 2.0f, "Hayao Miyazaki");
        MovieSeries movieSeries4 = new MovieSeries("Away", 2020, 1, "Hilary Swank", "Jason Katims");
        System.out.printf("Title of the movie/series= %s %nYear= %d %nSeason/s= %d %nCast= %s %n%n", movieSeries1.title, movieSeries1.year, movieSeries1.season, movieSeries1.cast);
        System.out.printf("Title of the movie/series= %s %nYear= %d %nDuration= %.0f hours %nCast= %s %nDirector %s %n%n", movieSeries2.title, movieSeries2.year, movieSeries2.duration, movieSeries2.cast, movieSeries2.director);
        System.out.printf("Title of the movie/series= %s %nYear= %d %nDuration= %.0f  hours %nDirector= %s %n%n", movieSeries3.title, movieSeries3.year, movieSeries3.duration, movieSeries3.director);
        System.out.printf("Title of the movie/series= %s %nYear= %d %nSeason/s= %d %nCast= %s %nDirector= %s %n", movieSeries4.title, movieSeries4.year, movieSeries4.season, movieSeries4.cast, movieSeries4.director);
    }
}
