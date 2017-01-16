package model;

import com.google.common.collect.Lists;

import java.util.Arrays;
import java.util.List;

import static java.util.Arrays.asList;

public class SampleData {

    public static final Artist johnColtrane = new Artist("John Coltrane", "US");

    public static final Artist johnLennon = new Artist("John Lennon", "UK");
    public static final Artist paulMcCartney = new Artist("Paul McCartney", "UK");
    public static final Artist georgeHarrison = new Artist("George Harrison", "UK");
    public static final Artist ringoStarr = new Artist("Ringo Starr", "UK");

    public static final List<Artist> membersOfTheBeatles = Arrays.asList(johnLennon, paulMcCartney, georgeHarrison, ringoStarr);

    public static final Artist theBeatles = new Artist("The Beatles", membersOfTheBeatles, "UK");

    public static final Album aLoveSupreme = new Album("A Love Supreme", asList(new Track("Acknowledgement", 467), new Track("Resolution", 442)), asList(johnColtrane));

    public static final Album sampleShortAlbum = new Album("A Sample Short Album", asList(new Track("The shortest track", 20)), asList(johnColtrane));

    public static final Album manyTrackAlbum = new Album("Sample Short Album",
            asList( new Track("Short track", 30),
                    new Track("Short track 2", 30),
                    new Track("Short track 3", 30),
                    new Track("A duplicate name", 30),
                    new Track("A duplicate name", 30)),
            asList( johnColtrane)
    );

    public static List<Album> getAllAlbums() {
        return Arrays.asList(aLoveSupreme, sampleShortAlbum, manyTrackAlbum);
    }

    public static List<Artist> getThreeArtists() {
        return Arrays.asList(johnColtrane, johnLennon, theBeatles);
    }

    public static List<Artist> getAllArtists() {
        return Arrays.asList(johnColtrane, johnLennon, paulMcCartney, georgeHarrison, ringoStarr, theBeatles);
    }

    public static List<String> sortedArtistNamesAsc = Lists.newArrayList("George Harrison", "John Coltrane", "John Lennon", "Paul McCartney", "Ringo Starr");
    public static List<String> sortedArtistNamesDesc = Lists.newArrayList("Ringo Starr", "Paul McCartney", "John Lennon", "John Coltrane", "George Harrison");

}
