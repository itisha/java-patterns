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

    private void index(T weblink) {
        if (weblink.getWebPage() != null) {
            System.out.println("Weblink with id=" + weblink.getId() + " has been indexed. Size=" + weblink.getWebPage().getBytes().length / 1000 + "k");
        } else {
            System.out.println("ERROR: Weblink with id=" + weblink.getId() + " indexing timeout!");
        }
    }
}
