package com.example.android.podcastpal;


/**
 * Episode represents an episode that the user wants to listen to.
 * It contains an image, title, date, duration, and description related to the episode.
 */

public class Episode {

    // Image related to the episode
    private int EpisodeImage;

    // Title of the episode
    private String EpisodeTitle;

    // Date of the episode
    private String EpisodeDate;

    // Duration of the episode
    private String EpisodeDuration;

    // Description of the episode
    private String EpisodeDescription;

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
        EpisodeImage = episodeImage;
        EpisodeTitle = episodeTitle;
        EpisodeDate = episodeDate;
        EpisodeDuration = episodeDuration;
        EpisodeDescription = episodeDescription;
    }

    // Get image related to the episode
    public int getEpisodeImage() {
        return EpisodeImage;
    }

    // Get title of the episode
    public String getEpisodeTitle() {
        return EpisodeTitle;
    }

    // Get date of the episode
    public String getEpisodeDate() {
        return EpisodeDate;
    }

    // Get duration of the episode
    public String getEpisodeDuration() {
        return EpisodeDuration;
    }

    // Get description of the episode
    public String getEpisodeDescription() {
        return EpisodeDescription;
    }
}
