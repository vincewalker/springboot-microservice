package net.pulsesecure.licensing;

public class License {
    private final long id;
    private final String content;

    public License(long id, String content) {
        this.id = id;
        this.content = content;
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }
}
