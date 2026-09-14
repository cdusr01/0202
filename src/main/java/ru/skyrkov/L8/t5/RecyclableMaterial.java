package ru.skyrkov.L8.t5;

public class RecyclableMaterial {

    private final int code;
    private final MaterialType type;
    private final boolean isRecyclable;
    private final String description;

    RecyclableMaterial(int code, MaterialType type, boolean isRecyclable, String description) {
        this.code = code;
        this.type = type;
        this.isRecyclable = isRecyclable;
        this.description = description;
    }

    public int getCode() {
        return code;
    }

    public MaterialType getType() {
        return type;
    }

    public boolean isRecyclable() {
        return isRecyclable;
    }

    public String getDescription() {
        return description;
    }
}
