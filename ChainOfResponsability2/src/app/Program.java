package app;

import models.*;

import java.util.ArrayList;

public class Program {

    static void main(String[] args) {
        PaginaWeb paginaWeb = new PaginaWeb( new ArrayList<Item>());

        // images and paragraph
        Image image = new Image("image");
        Image imag2 = new Image("svg-image");
        Paragraph paragraph2 = new Paragraph("paragraph", "black");

        // add to list of items from PaginaWeb class
        paginaWeb.addItem(image);
        paginaWeb.addItem(imag2);
        paginaWeb.addItem(paragraph2);

        // handler
        Filter imageFilter = new ImageFilter();
        Filter paragraphFilter = new ParagraphFilter();

        imageFilter.setNextFilter(paragraphFilter);

        for(Item item : paginaWeb.getItems()) {
            imageFilter.filter(item, "");
        }



    }

}
