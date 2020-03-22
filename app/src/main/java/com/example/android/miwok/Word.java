package com.example.android.miwok;



public class Word {

    private String mDefaultTranslation;
    private String mMiwokTranslation;
    private Integer mImageResourceId;
    private Integer mAudioResourceId;

    public Word(String defaultTranslation, String miwokTranslation, Integer audioResourceId) {
        this.mDefaultTranslation = defaultTranslation;
        this.mMiwokTranslation = miwokTranslation;
        this.mAudioResourceId = audioResourceId;
    }

    public Word(String defaultTranslation, String miwokTranslation, Integer imageResourceId, Integer audioResourceId) {
        this.mDefaultTranslation = defaultTranslation;
        this.mMiwokTranslation = miwokTranslation;
        this.mImageResourceId = imageResourceId;
        this.mAudioResourceId = audioResourceId;
    }

    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    public void setDefaultTranslation(String defaultTranslation) {
        this.mDefaultTranslation = defaultTranslation;
    }

    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }

    public void setMiwokTranslation(String miwokTranslation) {
        this.mMiwokTranslation = miwokTranslation;
    }

    public Integer getImageResourceId() {
        return mImageResourceId;
    }

    public void setImageResourceId(Integer imageResourceId) {
        this.mImageResourceId = imageResourceId;
    }

    public Integer getAudioResourceId() {
        return mAudioResourceId;
    }

    public void setAudioResourceId(Integer audioResourceId) {
        this.mAudioResourceId = audioResourceId;
    }

    @Override
    public String toString() {
        return "Word{" +
                "mDefaultTranslation='" + mDefaultTranslation + '\'' +
                ", mMiwokTranslation='" + mMiwokTranslation + '\'' +
                ", mImageResourceId=" + mImageResourceId +
                ", mAudioResourceId=" + mAudioResourceId +
                '}';
    }
}
