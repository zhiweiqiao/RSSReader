package qzw.android.rssreader;

import qzw.android.rssreader.IRssReaderServiceCallback;

interface IRssReaderService {

    void registerCallback(IRssReaderServiceCallback cb);
    void unregisterCallback(IRssReaderServiceCallback cb);
    
    void insertRss( String link, String title, String pubDate );
    void downloadRss( long rssId, String link );
    void downloadRssAll( int interval );   
    void deleteRss( long rssId );
    void deleteRssAll( );
    
    void deleteRssData( long rssId, long dataId );
    void deleteRssDataAll( long rssId );
    void markReadedRssData( long rssId, long dataId );
    void markNotReadedRssData( long rssId, long dataId );
    void markReadedRssDataAll( long rssId );
    void markNotReadedRssDataAll( long rssId );
    
    
    void setAutoRefreshForbit( boolean isAutoRefresh, int interval, boolean isNotification );
    void setAutoRefresh( boolean isAutoRefresh, int interval, boolean isNotification );
}
