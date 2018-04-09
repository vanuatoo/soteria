# Build
mvn clean package && docker build -t soteria/soteria .

# RUN

docker rm -f soteria || true && docker run -d -p 8080:8080 -p 4848:4848 --name soteria soteria/soteria 