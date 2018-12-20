STEPS

1. Execute application netflix-eureka-naming-server
2. Execute application currency-exchange-service
3. Execute application currency-conversion-service
4. Execute on a browser
* http://localhost:8100/currency-converter/from/USD/to/INR/quantity/25
* http://localhost:8100/currency-converter-feign/from/USD/to/INR/quantity/25
5. Or Execute:
* curl  http://localhost:8100/currency-converter/from/USD/to/INR/quantity/25
* curl  http://localhost:8100/currency-converter-feign/from/USD/to/INR/quantity/25

Note: If you get an error when execute http://localhost:8100/currency-converter-feign/from/USD/to/INR/quantity/25, please try to refresh.