package corejava.composition;

public class Processor {

    private String brand;
    private String series;
    private int generation;
    private int cores;
    private int threads;
    private String cacheMemory;
    private String frequency;
    private String minFrequency;
    private String maxFrequency;

    public Processor() {

        this.brand = "Intel";
        this.series = "1100H";
        this.generation = 11;
        this.cores = 8;
        this.threads = 16;
        this.cacheMemory = "5MB";
        this.frequency = "4GHz";
        this.minFrequency = "1.2GHz";
        this.maxFrequency = "6GHz";


    }

    public Processor(String brand, String series, int generation, int cores, int threads, String cacheMemory, String frequency, String minFrequency, String maxFrequency) {
        this.brand = brand;
        this.series = series;
        this.generation = generation;
        this.cores = cores;
        this.threads = threads;
        this.cacheMemory = cacheMemory;
        this.frequency = frequency;
        this.minFrequency = minFrequency;
        this.maxFrequency = maxFrequency;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getSeries() {
        return series;
    }

    public void setSeries(String series) {
        this.series = series;
    }

    public int getGeneration() {
        return generation;
    }

    public void setGeneration(int generation) {
        this.generation = generation;
    }

    public int getCores() {
        return cores;
    }

    public void setCores(int cores) {
        this.cores = cores;
    }

    public int getThreads() {
        return threads;
    }

    public void setThreads(int threads) {
        this.threads = threads;
    }

    public String getCacheMemory() {
        return cacheMemory;
    }

    public void setCacheMemory(String cacheMemory) {
        this.cacheMemory = cacheMemory;
    }

    public String getFrequency() {
        return frequency;
    }

    public void setFrequency(String frequency) {
        this.frequency = frequency;
    }

    public String getMinFrequency() {
        return minFrequency;
    }

    public void setMinFrequency(String minFrequency) {
        this.minFrequency = minFrequency;
    }

    public String getMaxFrequency() {
        return maxFrequency;
    }

    public void setMaxFrequency(String maxFrequency) {
        this.maxFrequency = maxFrequency;
    }

    @Override
    public String toString() {
        return "Processor{" +
                "brand='" + brand + '\'' +
                ", series='" + series + '\'' +
                ", generation=" + generation +
                ", cores=" + cores +
                ", threads=" + threads +
                ", cacheMemory='" + cacheMemory + '\'' +
                ", frequency='" + frequency + '\'' +
                ", minFrequency='" + minFrequency + '\'' +
                ", maxFrequency='" + maxFrequency + '\'' +
                '}';
    }
}
