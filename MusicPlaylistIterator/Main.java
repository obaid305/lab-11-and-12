public class Main {
    public static void main(String[] args) {
        Playlist playlist = new Playlist();
        playlist.addSong(new Song("Shape of You", "Ed Sheeran"));
        playlist.addSong(new Song("Blinding Lights", "The Weeknd"));
        playlist.addSong(new Song("Dance Monkey", "Tones and I"));

        System.out.println("Forward Iteration:");
        SongIterator forwardIterator = playlist.iterator();
        while (forwardIterator.hasNext()) {
            Song song = forwardIterator.next();
            System.out.println(song.getTitle() + " by " + song.getArtist());
        }

        System.out.println("\nReverse Iteration:");
        SongIterator reverseIterator = playlist.reverseIterator();
        while (reverseIterator.hasNext()) {
            Song song = reverseIterator.next();
            System.out.println(song.getTitle() + " by " + song.getArtist());
        }
    }
}
