
public class Track{
    private String trackTitle;
    private String artist;
    private int year;
    private int trackDuration;

    public Track(String title, String singer, int release, int duration){
        trackTitle=title;
        artist=singer;
        year=release;
        trackDuration=duration;
    }

    public String getTrackTitle(){
        return trackTitle;
    }

    public void setTrackTitle(String title){
        trackTitle=title;
    }

    public String getArtist(){
        return artist;
    }

    public void setArtist(String singer){
        artist=singer;
    }

    public int getYear(){
        return year;
    }

    public void setYear(int release){
        year=release;
    }

    public String getTrackDuration(){
        long h,m,s;
        String durationString;
        s=trackDuration;
        m=s/60;
        s=s%60;
        durationString=String.format("%02d",m)+":"+String.format("%02d",s);
        return durationString;
    }

    public void setTrackDuration(int m, int s){
        trackDuration=(m*60+s);
    }

    public String toString(){
        return "Title:"+trackTitle+"\n"+"Artist:"+artist+"\n"+"Year:"+year+"\n"+"Duration:"+getTrackDuration();
    }
}