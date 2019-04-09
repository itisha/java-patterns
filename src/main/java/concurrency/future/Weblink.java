package concurrency.future;

public class Weblink {

    private int id;
    private String url;
    private String webPage;
    private Integer responseCode;
    private boolean downloadAttempted;
    private String indexingInfo;
    private long startTime;
    private long endTime;

    public Weblink(int id, String url) {
        this.id = id;
        this.url = url;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getWebPage() {
        return webPage != null ? webPage.getBytes().length / 1000 + "k" : "0k";
    }

    public void setWebPage(String webPage) {
        this.webPage = webPage;
    }

    public Integer getResponseCode() {
        return responseCode;
    }

    public void setResponseCode(Integer responseCode) {
        this.responseCode = responseCode;
    }

    public boolean isDownloadAttempted() {
        return downloadAttempted;
    }

    public void setDownloadAttempted(boolean downloadAttempted) {
        this.downloadAttempted = downloadAttempted;
    }

    public String getIndexingInfo() {
        return indexingInfo;
    }

    public void setIndexingInfo(String indexingInfo) {
        this.indexingInfo = indexingInfo;
    }

    public long getStartTime() {
        return startTime;
    }

    public void setStartTime(long startTime) {
        this.startTime = startTime;
    }

    public long getEndTime() {
        return endTime;
    }

    public void setEndTime(long endTime) {
        this.endTime = endTime;
    }

    @Override
    public String toString() {
        return "Weblink{" +
                "id=" + id +
                ",\t url='" + url + '\'' +
                ",\t webPage='" + getWebPage() + '\'' +
                ",\t responseCode=" + responseCode +
                ",\t downloadAttempted=" + downloadAttempted +
                ",\t indexingInfo='" + indexingInfo + '\'' +
                ",\t startTime=" + startTime +
                ",\t endTime=" + endTime +
                ",\t downloadTime=" + (endTime - startTime) / 1000000000.00 +
                '}';
    }
}
