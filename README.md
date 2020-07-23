# Poc Kafka

This proof of concept created to validate the behaviour of the app using Kafka.

## Test Service By Postman

### Producer

* Send message request 

     Curl Example local : 
  
    ```bash
  curl --location --request POST 'http://localhost:9000/poc-kafka-api/v1/kafka/publish' \
  --header 'Content-Type: application/json' \
  --data-raw '{
      "message": "Wake up buddy, there isn'\''t time to sleep!"
  }'
     ```

* Health check API

     Curl Example local : 
  
    ```bash
  curl --location --request GET 'http://localhost:9000/poc-kafka-api/v1/status/validate'
     ```

### Consumer

* Get messages send to Buffer

     Curl Example local : 
  
    ```bash
  ./kafka-console-consumer.bat --bootstrap-server localhost:9093 --topic test --from-beginning
     ```
