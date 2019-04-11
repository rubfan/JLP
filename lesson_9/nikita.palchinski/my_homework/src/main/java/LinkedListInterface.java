public interface LinkedListInterface {
    void add(String string);
    void add(Integer index, String string);
    void remove();
    void remove(Integer index);
    String[] transform();
    String iSearch(Integer index);
    Integer vSearch(String string);
    Integer getSize();
    String getLast();
    void showList();
}