package questions.question2;

import model.Album;
import model.Artist;
import model.SampleData;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.Arrays.asList;
import static model.SampleData.*;
import static org.junit.Assert.assertEquals;
import static questions.question2.MusicExercises.*;

public class MusicExercisesTest {

    @Test
    public void extractsNamesAndOriginsOfArtists() {
        List<String> namesAndOrigins = MusicExercises.getNamesAndOrigins(SampleData.getThreeArtists());
        assertEquals(asList("John Coltrane", "US", "John Lennon", "UK", "The Beatles", "UK"), namesAndOrigins);
    }

    @Test
    public void findsShortAlbums() {
        List<Album> input = asList(manyTrackAlbum, sampleShortAlbum, aLoveSupreme);
        List<Album> result = MusicExercises.getAlbumsWithAtMostThreeTracks(input);
        assertEquals(asList(sampleShortAlbum, aLoveSupreme), result);
    }

    @Test
    public void internal() {
        assertEquals(4, countBandMembersUsingReduce(Arrays.asList(SampleData.johnColtrane, SampleData.theBeatles)));
    }

    @Test
    public void findTracksLongerThanSixtySeconds() {
        List<Album> input = asList(manyTrackAlbum, sampleShortAlbum, aLoveSupreme);
        Set<String> tracksLongerThan = findTracksLongerThan(input, 60);
        assertEquals(Stream.of("Acknowledgement","Resolution").collect(Collectors.toSet()), tracksLongerThan);
    }

    @Test
    public void getSortedIndividualArtistNamesInAscendingOrder() {
        List<Artist> allArtists = SampleData.getAllArtists();
        List<String> sortedNames = MusicExercises.sortedIndividualArtistNamesAsc(allArtists);
        assertEquals(SampleData.sortedArtistNamesAsc, sortedNames);
    }

    @Test
    public void getSortedIndividualArtistNamesInDescendingOrder() {
        List<Artist> allArtists = SampleData.getAllArtists();
        List<String> sortedNames = MusicExercises.sortedIndividualArtistNamesDesc(allArtists);
        assertEquals(SampleData.sortedArtistNamesDesc, sortedNames);
    }

    @Test
    public void shouldGetNumberOfUniqueTrackNames() {
        List<Album> albums = SampleData.getAllAlbums();
        int numberOfUniqueTrackNames = MusicExercises.getNumberOfUniqueTrackNames(albums);
        assertEquals(7, numberOfUniqueTrackNames);
    }

    @Test
    public void findsLongestNameByCollecting() {
        Artist artist = withLongestNameByCollecting(SampleData.getThreeArtists());
        assertEquals(SampleData.johnColtrane, artist);
    }

    @Test
    public void findsLongestNameByReduce() {
        Artist artist = withLongestNameByReduce(SampleData.getThreeArtists());
        assertEquals(SampleData.johnColtrane, artist);
    }

}
