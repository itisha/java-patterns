package concurrency.future;

public class Indexer<T extends Weblink> implements Runnable {

    private T weblink;

    public Indexer(T weblink) {
        this.weblink = weblink;
    }

    @Override
    public void run() {
        index(weblink);
    }

    private void index(Weblink weblink) {
        if (weblink.getResponseCode() != null && weblink.getResponseCode() >= 200 && weblink.getResponseCode() < 300) {
            weblink.setIndexingInfo("Success: " + weblink.getWebPage());
        } else {
            weblink.setIndexingInfo("Error!");
        }
    }
}
