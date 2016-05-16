MVN=mvn
#OPTS=deploy
OPTS=clean

.PHONY: core model external pres infra  dsl  product base
all: core model external pres infra  dsl  product base

clean-repo:
	rm -rf /Data/m2/repository/com/dsleng/etool/	
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
base:
	cd Base/com.dsleng.etool.base.parent/; \
	$(MVN) $(OPTS) 
dsl:
	cd DSL/com.dsleng.etool.dsl.bobjs.parent/; \
	$(MVN) $(OPTS)
	cd DSL/com.dsleng.etool.dsl.controls.parent/; \
	$(MVN) $(OPTS)
	cd DSL/com.dsleng.etool.dsl.egov.parent/; \
	$(MVN) $(OPTS)
product:
	cd Product/com.dsleng.etool.tycho.releng.p2/; \
	$(MVN) $(OPTS) 
primefaces:
	cd PrimeFaces/com.dsleng.etool.primefaces.parent/; \
	$(MVN) $(OPTS) 

