package com.dummy.myerp.model.bean.comptabilite;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class SoldeEcritureComptableTest {


	
	@Test
	public void toStringTestNull() {
		SoldeCompteComptable sol = null;
	           
		assertEquals(null,sol.toString());
	}

	}
