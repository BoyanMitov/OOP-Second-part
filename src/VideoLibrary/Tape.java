package VideoLibrary;
public class Tape {
    private String movieName;
    private String gender;
    private int releaseYear;
    private String takenOn;
    private String returnedOn;
    private int tapeCounter;
    private boolean isItAvailable;

    public Tape() {
    }

    public Tape(String movieName, String gender, int releaseYear, String takenOn, String returnedOn, int tapeCounter, boolean isItAvailable) {
        this.movieName = movieName;
        this.gender = gender;
        this.releaseYear = releaseYear;
        this.takenOn = takenOn;
        this.returnedOn = returnedOn;
        this.tapeCounter = tapeCounter;
        this.isItAvailable = isItAvailable;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public String getTakenOn() {
        return takenOn;
    }

    public void setTakenOn(String takenOn) {
        this.takenOn = takenOn;
    }

    public String getReturnedOn() {
        return returnedOn;
    }

    public void setReturnedOn(String returnedOn) {
        this.returnedOn = returnedOn;
    }

    public boolean isItAvailable() {
        return isItAvailable;
    }

    public void setItAvailable(boolean itAvailable) {
        isItAvailable = itAvailable;
    }


    public void tapesInfo() {
        System.out.println("--------------------------");
        System.out.println("Tape name: " + movieName);
        System.out.println("Movie gender: " + gender);
        System.out.println("Release year: " + releaseYear);
        System.out.println("The tape is available!");
        System.out.println("Tape number: " + tapeCounter);
        System.out.println("--------------------------");
    }


    public void availableTapes() {
        if (isItAvailable() == true) {
            tapesInfo();
        }
    }
}
