package iterator;

public class BrowserHistory implements Container<String> {
    private final String[] urls;

    public BrowserHistory(String[] urls) {
        this.urls = urls;
    }

    @Override
    public Iterator<String> getIterator() {
        return new BrowserHistoryIterator();
    }

    private class BrowserHistoryIterator implements Iterator<String> {
        private int index;

        @Override
        public boolean hasNext() {
            return index < urls.length;
        }

        @Override
        public String next() {
            if (this.hasNext()) {
                return urls[index++];
            }
            return null;
        }
    }
}
