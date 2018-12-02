FROM jboss/wildfly

RUN /opt/jboss/wildfly/bin/add-user.sh root root --silent

#ADD build/libs/cars-commerce-1.0-SNAPSHOT.ear /opt/jboss/wildfly/standalone/deployments/
ADD postgresql-42.2.5.jre6.jar /opt/jboss/wildfly/standalone/deployments/

RUN sed -n '/default-bindings/!p' wildfly/standalone/configuration/standalone.xml

CMD ["/opt/jboss/wildfly/bin/standalone.sh", "-b", "0.0.0.0", "-bmanagement", "0.0.0.0"]
