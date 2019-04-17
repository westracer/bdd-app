package model;

public class Chord {
    public ChordRoot root;
    public ChordType type;

    public Chord(ChordRoot root, ChordType type) {
        this.root = root;
        this.type = type;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj.getClass() == Chord.class) {
            Chord c2 = (Chord) obj;

            return this.root == c2.root && this.type == c2.type;
        } else {
            return super.equals(obj);
        }
    }
}
