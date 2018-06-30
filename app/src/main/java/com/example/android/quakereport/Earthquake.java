package com.example.android.quakereport;

public class Earthquake {
    private double mMagnitude;
    private String mLocation;
    private long mTimeInMilliseconds;
    private String mUrl;

    public Earthquake(double Magnitude, String Location, long timeInMilliseconds, String Url) {
        this.mMagnitude = Magnitude;
        this.mLocation = Location;
        this.mTimeInMilliseconds = timeInMilliseconds;
        this.mUrl = Url;
    }

    public double getMagnitude() {
        return mMagnitude;
    }

    public String getLocation() {
        return mLocation;
    }

    public long getTimeInMilliseconds() {
        return mTimeInMilliseconds;
    }

    public String getUrl() {
        return mUrl;
    }
}
