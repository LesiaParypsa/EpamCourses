package homework.lesson6_part1_University;

public enum GroupsList {
    FICT_2_06("2FICT-06"),
    FBT_3_08("3FBT-08");

    public final String fullGroupName;

    GroupsList(String fullGroupName) {
        this.fullGroupName = fullGroupName;
    }

    @Override
    public String toString() {
        return fullGroupName;
    }
}
