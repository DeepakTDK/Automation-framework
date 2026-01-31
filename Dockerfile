FROM selenium/standalone-chrome:latest

USER root
RUN apt-get update && apt-get install -y maven

WORKDIR /tests
COPY . .

CMD ["mvn", "clean", "test"]
