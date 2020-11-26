package org.aplas.projectmusix;

public class MyAlbumData {
    private String albumName;
    private String albumDate;
    private Integer albumImage;
    private String albumBand;

    public MyAlbumData(String albumName, String albumDate, Integer albumImage, String albumBand) {
        this.albumName = albumName;
        this.albumDate = albumDate;
        this.albumImage = albumImage;
        this.albumBand = albumBand;
    }

    public String getAlbumName() {
        return albumName;
    }

    public void setAlbumName(String albumName) {
        this.albumName = albumName;
    }

    public String getAlbumBand() {
        return albumBand;
    }

    public void setAlbumBand(String albumBand) {
        this.albumBand = albumBand;
    }

    public String getAlbumDate() {
        return albumDate;
    }

    public void setAlbumDate(String albumDate) {
        this.albumDate = albumDate;
    }

    public Integer getAlbumImage() {
        return albumImage;
    }

    public void setAlbumImage(Integer albumImage) {
        this.albumImage = albumImage;
    }
}
