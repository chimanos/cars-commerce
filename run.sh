#!/bin/sh

# RUN DATABASE H2
java -cp /opt/jboss/wildfly/modules/system/layers/base/com/h2database/h2/main/h2-*.jar org.h2.tools.Server -tcp -web &

# RUN JBOSS
/opt/jboss/wildfly/bin/standalone.sh -b 0.0.0.0 -bmanagement 0.0.0.0