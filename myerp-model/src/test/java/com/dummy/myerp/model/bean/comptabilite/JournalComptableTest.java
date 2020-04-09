package com.dummy.myerp.model.bean.comptabilite;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class JournalComptableTest {

	@Test
	public void getByCodeTest_OK() {
		List<JournalComptable> journauxComptables = new ArrayList<JournalComptable>();
		JournalComptable journal1 = new JournalComptable("AC","Achat");
		journauxComptables.add(journal1);
		JournalComptable journal2 = new JournalComptable("VE","Vente");
		journauxComptables.add(journal2);
    	JournalComptable journal3 = new JournalComptable("BQ","Banque");
    	journauxComptables.add(journal3);
    	JournalComptable journalActual = JournalComptable.getByCode(journauxComptables, "VE");
    	assertSame(journal2, journalActual);
	}
	
	@Test
	public void getByCodeTest_NoJournalFound() {
		List<JournalComptable> journauxComptables = new ArrayList<JournalComptable>();
		JournalComptable journal1 = new JournalComptable("AC","Achat");
		journauxComptables.add(journal1);
		JournalComptable journal2 = new JournalComptable("VE","Vente");
		journauxComptables.add(journal2);
    	JournalComptable journal3 = new JournalComptable("BQ","Banque");
    	journauxComptables.add(journal3);
    	JournalComptable journalActual = JournalComptable.getByCode(journauxComptables, "PK");
    	assertNull(journalActual);
	}
	
	@Test
	public void toStringTest() {
		JournalComptable journal = new JournalComptable("AC","Achat");
		assertEquals("JournalComptable{code='AC', libelle='Achat'}",journal.toString());
	}
	
	
//	@Test
//	public void toStringTestNull() {
//		LigneEcritureComptable ligne =  new LigneEcritureComptable(new CompteComptable(1),
//	                                                                                null, new BigDecimal(123),
//	                                                                                null);
//	           
//		AssertNotEquals("JournalComptable{code='AC', libelle='Achat'}",ligne.toString());
//	}
//	@Test
//	public void toStringTestNull1() {
//		SequenceEcritureComptable seq = null;
//	           
//		AssertNotEquals("JournalComptable{code='AC', libelle='Achat'}",Seq.toString());
//	}
//	@Test
//	public void toStringTestNull2() {
//		SoldeCompteComptable sol = new SoldeCompteComptable();
//	           
//		AssertNotEquals("JournalComptable{code='AC', libelle='Achat'}",sol.toString());
//	}
}
