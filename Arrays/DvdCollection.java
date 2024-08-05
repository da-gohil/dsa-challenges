// The actual code for creating an Array to hold DVDs.
// Simple definition for arrays -> DVD
class DVD {
    public String name;
    public int releaseYear;
    public String director;

    // Constructor
    public DVD(String name, int releaseYear, String director) {
        this.name = name;
        this.releaseYear = releaseYear;
        this.director = director;
    }

    public String toString() {
        return this.name + ", directed by " + this.director + ", released in " + this.releaseYear;
    }
}

class DvdCollection {
    public static void main(String[] args) {
        // Step 1: Create an array to hold DVDs
        DVD[] dvdCollection = new DVD[15];

        // Step 2: Create DVD objects
        DVD dvd1 = new DVD("The Matrix", 1999, "Lana Wachowski, Lilly Wachowski");
        DVD dvd2 = new DVD("The Godfather", 1972, "Francis Ford Coppola");
        DVD dvd3 = new DVD("Pulp Fiction", 1994, "Quentin Tarantino");

        // Step 3: Add DVD objects to the array
        dvdCollection[0] = dvd1;
        dvdCollection[1] = dvd2;
        dvdCollection[2] = dvd3;

        // Step 4: Print the DVD collection
        for (int i = 0; i < dvdCollection.length; i++) {
            if (dvdCollection[i] != null) {
                System.out.println(dvdCollection[i]);
            }
        }
    }
}
