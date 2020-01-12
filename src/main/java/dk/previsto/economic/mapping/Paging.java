package dk.previsto.economic.mapping;

public class Paging {
    int maxPageSizeAllowed;
    int skipPages;
    int pageSize;
    int results;
    int resultsWithoutFilter;

    public int getMaxPageSizeAllowed() {
        return maxPageSizeAllowed;
    }

    public void setMaxPageSizeAllowed(int maxPageSizeAllowed) {
        this.maxPageSizeAllowed = maxPageSizeAllowed;
    }

    public int getSkipPages() {
        return skipPages;
    }

    public void setSkipPages(int skipPages) {
        this.skipPages = skipPages;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getResults() {
        return results;
    }

    public void setResults(int results) {
        this.results = results;
    }

    public int getResultsWithoutFilter() {
        return resultsWithoutFilter;
    }

    public void setResultsWithoutFilter(int resultsWithoutFilter) {
        this.resultsWithoutFilter = resultsWithoutFilter;
    }
}
