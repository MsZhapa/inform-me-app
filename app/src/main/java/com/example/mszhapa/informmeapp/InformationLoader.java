package com.example.mszhapa.informmeapp;

import android.content.AsyncTaskLoader;
import android.content.Context;

import java.util.List;

/**
 * Created by MsZhapa on 19/07/2017.
 */

public class InformationLoader extends AsyncTaskLoader<List<Information>> {

    /**
     * Tag for log messages
     */
    private static final String LOG_TAG = InformationLoader.class.getName();

    /**
     * Query URL
     */
    private String mUrl;

    /**
     * Constructs a new {@link InformationLoader}.
     *
     * @param context of the activity
     * @param url     to load data from
     */
    public InformationLoader(Context context, String url) {
        super(context);
        mUrl = url;
    }

    @Override
    protected void onStartLoading() {
        forceLoad();
    }

    /**
     * This is on a background thread.
     */
    @Override
    public List<Information> loadInBackground() {
        if (mUrl == null) {
            return null;
        }

        // Perform the network request, parse the response, and extract a list of articles.
        List<Information> news = QueryUtils.fetchInformationData(mUrl);
        return news;
    }
}
