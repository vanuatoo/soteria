FROM airhacks/glassfish
COPY ./target/soteria.war ${DEPLOYMENT_DIR}
