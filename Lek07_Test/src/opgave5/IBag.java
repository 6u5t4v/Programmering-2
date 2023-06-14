package opgave5;

public interface IBag {
    /**
     * Add a String to the bag
     */
    public void add(String s);

    /**
     * Remove a String from the bag
     */
    public void remove(String s);

    /**
     * Get the count of Strings equal to s in the bag
     */
    public int getCount(String s);
}
