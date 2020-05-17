package ro.pub.cs.systems.eim.practicaltest02;

public class WeatherForecastInformation {
    private String temperature;
    private String windSpeed;
    private String condition;
    private String pressure;
    private String humidity;

    public WeatherForecastInformation() {
        this.temperature = null;
        this.windSpeed = null;
        this.condition = null;
        this.pressure = null;
        this.humidity = null;
    }

    public WeatherForecastInformation(String temperature, String windSpeed, String condition, String pressure, String humidity) {
        this.temperature = temperature;
        this.windSpeed = windSpeed;
        this.condition = condition;
        this.pressure = pressure;
        this.humidity = humidity;
    }

    public String getTemperature() {
        return temperature;
    }

    public void setTemperature(String temperature) {
        this.temperature = temperature;
    }

    public String getWindSpeed() {
        return windSpeed;
    }

    public void setWindSpeed(String windSpeed) {
        this.windSpeed = windSpeed;
    }

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    public String getPressure() {
        return pressure;
    }

    public void setPressure(String pressure) {
        this.pressure = pressure;
    }

    public String getHumidity() {
        return humidity;
    }

    public void setHumidity(String humidity) {
        this.humidity = humidity;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("WeatherForecastInformation{");
        sb.append("temperature='").append(temperature).append('\'');
        sb.append(", windSpeed='").append(windSpeed).append('\'');
        sb.append(", condition='").append(condition).append('\'');
        sb.append(", pressure='").append(pressure).append('\'');
        sb.append(", humidity='").append(humidity).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
