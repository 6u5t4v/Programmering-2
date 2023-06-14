package opgave5;

public interface Bag extends Subject {
    /**
     * Add a String to the bag
     */
    public void addString(String s);

    /**
     * Remove a String from the bag
     */
    public void removeString(String s);

    /**
     * Get the count of Strings equal to s in the bag
     */
    public int getCount(String s);
}
