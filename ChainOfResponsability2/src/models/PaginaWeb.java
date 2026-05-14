package models;

import java.util.List;

// list with items from webPage
public class PaginaWeb {

    private List<Item> items;

    public PaginaWeb(List<Item> items) {
        this.items = items;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }
    public void addItem(Item item) {
        this.items.add(item);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("PaginaWeb{");
        sb.append("items=").append(items);
        sb.append('}');
        return sb.toString();
    }
}
