package yatsekk.example.com.myweatherkt

data class Weather(
    var cityName: String,
    var currentTemp: Int,
    var currentWeather: String,
    var comfortTemp: String,
    var humidity: String,
    var pressure: String,
    var wind: String
)