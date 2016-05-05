package mailqueue.external;

import org.springframework.stereotype.Component;

/**
 * Created by bekas on 04/05/16.
 */

@Component
public class ScrapingResultHandler {

    public void handleMessage(ScrapingResultMessage scrapingResultMessage)
    {
        System.out.println("Received summary: " + scrapingResultMessage.getSummary());
        final String url = scrapingResultMessage.getUrl();
        final List<Bookmark> bookmarks = bookmarkRepository.findByUrl(url);
        if (bookmarks.size() == 0)
        {
            System.out.println("No bookmark of url: " + url + " found.");
        }
        else
        {
            for (Bookmark bookmark : bookmarks)
            {
                bookmark.setSummary(scrapingResultMessage.getSummary());
                bookmarkRepository.save(bookmarks);
                System.out.println("updated bookmark: " + url);
            }
        }
    }


}
