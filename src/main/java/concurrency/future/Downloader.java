package concurrency.future;

import concurrency.future.utils.HttpConnect;

import java.util.concurrent.Callable;

public class Downloader<T extends Weblink> implements Callable<T> {

    private T weblink;

    public Downloader(T weblink) {
        this.weblink = weblink;
    }

    @Override
    public T call() throws Exception {
        weblink.setStartTime(System.nanoTime());
        String webPage = HttpConnect.download(weblink);
        weblink.setWebPage(webPage);
        weblink.setEndTime(System.nanoTime());
        return weblink;
    }
}
