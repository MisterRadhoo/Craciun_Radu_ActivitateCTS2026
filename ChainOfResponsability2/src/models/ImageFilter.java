package models;

public class ImageFilter extends Filter {

    @Override
    public void filter(Item item, String message ) {
        if(item.getTip().equals("image")) {
            System.out.println("Image has been removed from page.");
        } else if (super.getNextFilter() != null ){
            super.getNextFilter().filter(item, message);
        }
    }
}
