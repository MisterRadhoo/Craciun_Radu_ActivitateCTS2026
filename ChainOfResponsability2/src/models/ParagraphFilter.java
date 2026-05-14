package models;

public class ParagraphFilter extends Filter {

    @Override
    public void filter(Item item, String message) {
        if(item.getTip().equals("paragraph")) {
            Paragraph paragraph = (Paragraph) item;
            paragraph.setColor("black");
            System.out.println("Paragraph simplified!");
        } else if( super.getNextFilter() != null)  {
            super.getNextFilter().filter(item, message);
        }
    }
}
