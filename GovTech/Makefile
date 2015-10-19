WILDFLY_HOME=/Data/wildfly/wildfly-10.0.0.CR2/
WAR=za.co.egov.cn.web-1.0.0-SNAPSHOT.war

clean:
	cd za.co.egov.cn.web;  mvn clean
	cd za.co.egov.cn.ws;  mvn clean
	cd za.co.egov.epart.web;  mvn clean
	cd za.co.egov.integration;  mvn clean
deploy:
	$(WILDFLY_HOME)/bin/jboss-cli.sh --connect --command="deploy --force $(WAR)"
undeploy:
	$(WILDFLY_HOME)/bin/jboss-cli.sh --connect --command="undeploy $(WAR)"
