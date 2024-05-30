package corejava.composition;

public class GraphicsCard {
    private String brand;
    private String series;
    private String meomroy;

    public GraphicsCard() {

        this.brand = "Nvidia";
        this.series = "RTX 3060";
        this.meomroy = "6GB";

    }

    public GraphicsCard(String brand, String series, String meomroy) {
        this.brand = brand;
        this.series = series;
        this.meomroy = meomroy;
    }

    @Override
    public String toString() {
        return "GraphicsCard{" +
                "brand='" + brand + '\'' +
                ", series='" + series + '\'' +
                ", meomroy='" + meomroy + '\'' +
                '}';
    }
}
