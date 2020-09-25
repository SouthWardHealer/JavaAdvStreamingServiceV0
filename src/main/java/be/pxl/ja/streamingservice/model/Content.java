package be.pxl.ja.streamingservice.model;

public abstract class Content {
    private String title;
    private Rating maturityRating;
    private String imageUri;

    public Content(String title, Rating maturityRating) {
        this.title = title;
        this.maturityRating = maturityRating;
    }

    public String getTitle() {
        return title;
    }

    public Rating getMaturityRating() {
        return maturityRating;
    }

    public String getImageUri() {
        return imageUri;
    }

    public void setImageUri(String imageUri) {
        this.imageUri = imageUri;
    }

    @Override
    public String toString() {
        return title;
    }
}