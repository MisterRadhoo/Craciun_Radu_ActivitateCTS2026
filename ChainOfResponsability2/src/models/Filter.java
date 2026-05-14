package models;

// handler
public abstract class Filter {

    private Filter nextFilter;

    public Filter getNextFilter() {
        return nextFilter;
    }

    public void setNextFilter(Filter filter) {
        this.nextFilter = filter;
    }

    public abstract void filter(Item item, String message);
}
