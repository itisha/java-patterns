package patterns.bridge.demo;

import patterns.bridge.media.Album;
import patterns.bridge.media.Artist;
import patterns.bridge.media.Track;
import patterns.bridge.resource.AlbumResourceAdapter;
import patterns.bridge.resource.ArtistResourceAdapter;
import patterns.bridge.view.LongFormView;
import patterns.bridge.view.ShortFormView;

import java.util.Arrays;

public class Demo {
    public static void main(String[] args) {
        //setup
        Artist artist = new Artist();
        artist.setName("System of a Down");
        artist.setGenre("Metal");
        artist.setBiography("Armenian American Band");
        artist.setImageUrl("http://image/systemofadown.jpg");

        Album album = new Album();
        album.setTitle("Steal This Album");
        album.setArtist(artist);
        album.setTrackList(Arrays.asList(new Track("Mr. Jack", artist, album, "http://zaytsev.net/mr.jack.mp3"),
                new Track("AIEAIO", artist, album, "http://zaytsev.net/AIEAIO.mp3"),
                new Track("Science", artist, album, "http://zaytsev.net/Science.mp3")));
        album.setCoverImnageURL("http://album/image.jpg");


        //can display artist media type in any view:
        ShortFormView shortFormView = new ShortFormView(new ArtistResourceAdapter(artist));
        LongFormView longFormView = new LongFormView(new ArtistResourceAdapter(artist));

        System.out.println("\nDisplaying artist in longFormView:");
        System.out.println(longFormView.show());
        System.out.println("\nDisplaying artist in shortFormView:");
        System.out.println(shortFormView.show());
        System.out.println();


        //can display album media type in any view:
        shortFormView = new ShortFormView(new AlbumResourceAdapter(album));
        longFormView = new LongFormView(new AlbumResourceAdapter(album));

        System.out.println("\n\nDisplaying album in longFormView:");
        System.out.println(longFormView.show());
        System.out.println("\nDisplaying album in shortFormView:");
        System.out.println(shortFormView.show());
    }
}
