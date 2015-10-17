package com.dsleng.etool.external.maven.tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.dsleng.etool.external.maven.SPPrimefacesGen;

public class SPPrimefacesGenTest {
	private SPPrimefacesGen pT;
	@Before
	public void setUp() throws Exception {
		pT = new SPPrimefacesGen("/Data/maventest/");
	}

	

	@Test
	public void testCreateBaseProj() {
		pT.createBaseProj("za.co.gov", "za.co.gov.eservices", "1.0.0-SNAPSHOT","za.co.gov","beaninput");
	}

}
