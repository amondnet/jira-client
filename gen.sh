java -jar openapi-generator-cli.jar generate \
    -i ./swagger-v3.v3.json \
    -g java \
    -o ./ \
    -c config.json