import iterator.BrowserHistory;
import iterator.Iterator;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class IteratorTest {
    String[] urls = {"stackoverflow", "github", "linkedin", "hackerrank", "gitlab"};
    BrowserHistory browserHistory = new BrowserHistory(urls);

    @Test
    public void testIteration() {
        List<String> fetchedUrls = new ArrayList<>();
        for (Iterator<String> browserHistoryIterator = browserHistory.getIterator(); browserHistoryIterator.hasNext(); ) {
            fetchedUrls.add(browserHistoryIterator.next());
        }
        Assert.assertArrayEquals(urls, fetchedUrls.toArray());
    }
}
