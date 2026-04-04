package app;

public interface INod {
     String getProducator();
     String getModel();
     double getCaiPutere();
     void printeaza();

    void adaugaNod(INod nod);
    void stergeNod(INod nod);
    INod getNod(int index);
}
