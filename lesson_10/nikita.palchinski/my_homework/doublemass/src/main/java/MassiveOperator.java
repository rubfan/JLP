public interface MassiveOperator {
    void addMassive(String[] massiveToAdd);
    void addElement(String elementToAdd);
    Integer getSize();
    String getElementWith(Integer index);
    String[] getArray();
}
