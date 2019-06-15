public interface MyDoubleList {
    void addl(Object data);
    void addf(Object data);
    void deletef();
    void deletel();
    void delete(int index);
    void add(int index, Object data);
    int getSize();
    String showList();
    Object getFirst();
    Object getLast();
    //Object[] transform();
    String[] toArray();
}

