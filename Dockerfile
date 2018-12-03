FROM jboss/wildfly

RUN /opt/jboss/wildfly/bin/add-user.sh root root --silent

USER root

# CONFIG JBOSS SERVER WITH H2
ADD standalone.xml  /opt/jboss/wildfly/standalone/configuration/standalone.xml

# RUNTIME
ADD run.sh run.sh
RUN chmod +x run.sh

USER jboss

ADD build/libs/cars-commerce-1.0-SNAPSHOT.ear /opt/jboss/wildfly/standalone/deployments/

EXPOSE 8080
EXPOSE 9990
EXPOSE 8082

CMD ["./run.sh"]
