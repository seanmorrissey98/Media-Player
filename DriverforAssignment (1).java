public class DriverforAssignment {
    public static void main(String[] args) {
        Track aTrack;
        Playlist LM121BestHits = new Playlist("LM121 Best Hits");
        LM121BestHits.add("Silence","marshmello",2017,195);
        LM121BestHits.add(new Track("Perfect","Ed Sheeran",2017,183));
        aTrack = new Track("Slow Hands","Niall Horan",2017,188);
        LM121BestHits.add(aTrack);
        LM121BestHits.add(new Track("Touch","Little Mix",2017,191));
        LM121BestHits.add(new Track("Wolves","Selena Gomez",2017,302));
        LM121BestHits.add(new Track("The Cure","Lady Gaga",2017,195));
        LM121BestHits.add(new Track("Power","Little Mix feat. Stormzy",2017,185));
        LM121BestHits.add(new Track("17","MK",2017,209));
        LM121BestHits.add(new Track("Let You Down","NF",2017,207));

        Playlist SummerTunes = new Playlist("Summer Tunes");
        SummerTunes.add(new Track("Dinging","The Shinners",1989,255));
        SummerTunes.add("Leningrad","Billy Joel",1988,213);
        SummerTunes.add(new Track("The Dance","Milky Chance",1989,213));
        SummerTunes.add(new Track("The Living Years","Mike & The Mechanics",1988,213));
        SummerTunes.add(new Track("Take u 2 da movies", "Bangs",2010, 188));
        SummerTunes.add(new Track("The Times They are a Changin'","Bob Dylan",1964,179));

        LM121BestHits.showList();
        LM121BestHits.remove(3);
        LM121BestHits.playAll(true);
        LM121BestHits.playAll(false);
        LM121BestHits.playIf("LITTLE MIX");

        SummerTunes.playIf("Big Shaq");  // Not an artist in the playlist
        SummerTunes.showList();
        SummerTunes.remove(67); // 67 doesn't exist
        SummerTunes.playAll(true);
        SummerTunes.playAll(false);
        SummerTunes.playIf(1989);
        SummerTunes.toString();
        
        Playlist WinterHits = new Playlist("Winter Hits");
        WinterHits.showList();

    }
}