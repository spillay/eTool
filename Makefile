MVN=mvn
OPTS=install

all: core model external infra pres dsl product
	
core:
	cd  com.dsleng.etool.parent/; \
	$(MVN) $(OPTS) 
external:
	cd External/com.dsleng.etool.external.parent; \
	$(MVN) $(OPTS) 
infra:
	cd Infrastructure/Common/com.dsleng.etool.infra.common.parent/; \
	$(MVN) $(OPTS) 
	cd Infrastructure/Utilities/com.dsleng.etool.semantic.map.parent/; \
	$(MVN) $(OPTS) 
pres:
	cd Presentation/com.dsleng.etool.xtext.parent/; \
	$(MVN) $(OPTS) 
model:
	cd Models/com.dsleng.etool.models.parent/; \
	$(MVN) $(OPTS) 
dsl:
	cd DSL/com.dsleng.etool.dsl.egov.parent/; \
	$(MVN) $(OPTS)
product:
	cd Product/com.dsleng.etool.tycho.releng.p2/; \
	$(MVN) $(OPTS) 

