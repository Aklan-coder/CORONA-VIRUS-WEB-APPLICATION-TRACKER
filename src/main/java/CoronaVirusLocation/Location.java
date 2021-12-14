package CoronaVirusLocation;

public class Location {
    private String country;
    private int LatestTotalCases;
    private int diffFromPrevDay;

    public int getDiffFromPrevDay() {
        return diffFromPrevDay;
    }

    public void setDiffFromPrevDay(int diffFromPrevDay) {
        this.diffFromPrevDay = diffFromPrevDay;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getLatestTotalCases() {
        return LatestTotalCases;
    }

    public void setLatestTotalCases(int latestTotalCases) {
        LatestTotalCases = latestTotalCases;
    }

    @Override
    public String toString() {
        return "Location{" +
                "country='" + country + '\'' +
                ", LatestTotalCases=" + LatestTotalCases +
                '}';
    }
}
