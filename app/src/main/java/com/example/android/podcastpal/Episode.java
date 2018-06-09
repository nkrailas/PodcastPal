package com.example.android.podcastpal;


/**
 * Episode represents an episode that the user wants to listen to.
 * It contains an image, title, date, duration, and description related to the episode.
 */

public class Episode {

    // Image related to the episode
    private int mEpisodeImage;

    // Title of the episode
    private String mEpisodeTitle;

    // Date of the episode
    private String mEpisodeDate;

    // Duration of the episode
    private String mEpisodeDuration;

    // Description of the episode
    private String mEpisodeDescription;

    /**
     * Create a new Episode object
     *
     * @param episodeImage       Image related to the episode
     * @param episodeTitle       Title of the episode
     * @param episodeDate        Date of the episode
     * @param episodeDuration    Duration of the episode
     * @param episodeDescription Description of the episode
     */

    // Constructor used to create an instance of the Episode object
    public Episode(int episodeImage, String episodeTitle, String episodeDate, String episodeDuration, String episodeDescription) {
        mEpisodeImage = episodeImage;
        mEpisodeTitle = episodeTitle;
        mEpisodeDate = episodeDate;
        mEpisodeDuration = episodeDuration;
        mEpisodeDescription = episodeDescription;
    }

    // Get image related to the episode
    public int getEpisodeImage() {
        return mEpisodeImage;
    }

    // Get title of the episode
    public String getEpisodeTitle() {
        return mEpisodeTitle;
    }

    // Get date of the episode
    public String getEpisodeDate() {
        return mEpisodeDate;
    }

    // Get duration of the episode
    public String getEpisodeDuration() {
        return mEpisodeDuration;
    }

    // Get description of the episode
    public String getEpisodeDescription() {
        return mEpisodeDescription;
    }
}
