package lab7;

interface ISeries {
    void setStart(int start);

    int getNext();

    void reset();
}

class ByTwos implements ISeries {
    private int start = 0;
    private int delta = 0;

    @Override
    public void setStart(int start) {
        this.start = start;
    }

    @Override
    public int getNext() {
        return start + (2 * delta++);
    }

    @Override
    public void reset() {
        start = 0;
    }
}

public class Q3 { }
