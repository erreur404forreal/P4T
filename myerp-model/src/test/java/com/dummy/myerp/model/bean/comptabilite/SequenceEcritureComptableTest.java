package com.dummy.myerp.model.bean.comptabilite;

import static org.junit.Assert.assertNull;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class SequenceEcritureComptableTest {

    SequenceEcritureComptable seq = new SequenceEcritureComptable();

	@Test
	public void getSet() {
		seq.setAnnee(null);
		seq.setDerniereValeur(null);
		seq.setJournal(null);
		assertNull(seq.getAnnee());
		assertNull(seq.getDerniereValeur());
		assertNull(seq.getJournal());
		
		
	}



}