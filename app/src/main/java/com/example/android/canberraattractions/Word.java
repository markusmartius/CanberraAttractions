package com.example.android.canberraattractions;

/**
 * {@link Word} represents a vocabulary word that the user wants to learn.
 * It contains a default translation and a Miwok translation for that word.
 */
public class Word {
    // Set flag for when Phrases activity is not used
    private static final int NO_IMAGE_PROVIDED = -1;

    /**
     * Name of location
     */ // the proceeding m just indicates a private variable
    private String mName;
    /**
     * Address of the location
     */
    private String mAddress;
    /**
     * Contact number of the location
     */
    private String mContact;
    /**
     * Website of the location
     */
    private String mWebsite;
    /**
     * Miwok image resource id
     */
    private int mImageResourceId = NO_IMAGE_PROVIDED;

    /**
     * Create a new Word object.
     *
     * @param name              is the name of the location
     * @param address           is the address of the location
     * @param contact           is the contact nimber of the loaction
     * @param website           is the website of the location
     * @param imageResourceId    is the image to go with the text
     */
    public Word(String name, String address, String contact, String website, int imageResourceId) {
        mName = name;
        mAddress = address;
        mContact = contact;
        mWebsite = website;
    }

    /**
     * Get the default translation of the word.
     */
    public String getName() {
        return mName;
    }

    /**
     * Get the Miwok translation of the word.
     */
    public String getAddress() {
        return mAddress;
    }

    /**
     * Get the default translation of the word.
     */
    public String getContact() {
        return mContact;
    }

    /**
     * Get the Miwok translation of the word.
     */
    public String getmWebsite() {
        return mWebsite;
    }

    /**
     * Get the image resource Id.
     */

    public int getImageResourceId() {
        return mImageResourceId;
    }

    /**
     * Returns if there is an image.
     */
    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }
}
