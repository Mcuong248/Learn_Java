public class Film {
    public int id;
    public String name;
    public String category;
    public int length;
    public String producer;
    public int releaseYear;


    public Film(int id, String name, String category, int length, String producer, int releaseYear) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.length = length;
        this.producer = producer;
        this.releaseYear = releaseYear;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    @Override
    public String toString() {
        return id+" - "+ name+" - "+category+" - "+length+" - "+producer+" - "+releaseYear;
    }
}
