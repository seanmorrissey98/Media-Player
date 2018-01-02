
public class Playlist{
    private Track[] tracklist = new Track[100];
    private int entryCount=0;
    private String playlistName;

    public Playlist(String playlistName){
        this.playlistName=playlistName;
    }
    
    public String getPlayListName(){
        return playlistName;
    }

    public void setPlayListName(String nameOfPlaylist){
        playlistName=nameOfPlaylist;
    }

    public String toString(){
        return "Playlist Name: "+playlistName+"\n"+"Playlist Length: "+tracklist.length+"\n"+"Entry Count: "+entryCount;
    }

    public boolean add(Track t){
        if(entryCount != 100 && entryCount<100){
            tracklist[entryCount]=t;
            entryCount++;
            return true;
        }
        else{
            return false;
        }
    }

    public boolean add(String title, String artist,int year, int duration){
        if(entryCount != 100 && entryCount<100){
            Track newTrack= new Track(title, artist, year, duration);
            tracklist[entryCount]=newTrack;
            entryCount++;
            return true;
        }
        else{
            return false;
        }
    }

    public boolean remove(int position){
        if (position<=entryCount && position >-1){
            tracklist[position]=null;
            for (int i=position+1;i<=entryCount;i++){
                tracklist[position]=tracklist[i];
                position++;
            }
            entryCount=entryCount-1;
            return true;
        }
        else{
            return false;
        }
    }

    public void showList (){
        for (int i=0;i<entryCount; i++){
            System.out.print(tracklist[i]+"\n");
            System.out.println("");
        }
        if (entryCount==0){
            System.out.println("The list is empty"+"\n");
        }
    }


    public void playIf(String artist){
        String artistAti;
        for(int i=0;i<entryCount;i++){
            artistAti=tracklist[i].getArtist();
            if(artistAti.toLowerCase().contains(artist.toLowerCase())){
                System.out.println(tracklist[i].toString()+"\n");
            }
        }
    }

    public void playIf(int year){
        int sameYear=0;
        for( int i=0;i<entryCount;i++){
            sameYear=tracklist[i].getYear();
            if(sameYear==year){
                System.out.println(tracklist[i].toString()+"\n");
            }
        }
    }

    public void playAll( boolean shuffle){
        Track[] shufflePlaylist = new Track[entryCount];
        if (shuffle == false){
           showList();
        }
        else{
            if(entryCount==0){
                showList();
            }
            Track shuffler;
            Track[] songs=tracklist.clone();
            int i,j,k;
            i=0;
            while(i<entryCount*2){
                j=(int)(Math.random()*entryCount);
                k=(int)(Math.random()*entryCount);
                shuffler=songs[j];
                songs[j]=songs[k];
                songs[k]=shuffler;
                i++;
            }
            for (i=0;i<entryCount; i++){
                System.out.print(songs[i]+"\n");
                System.out.println("");
            }
        }
    }
}