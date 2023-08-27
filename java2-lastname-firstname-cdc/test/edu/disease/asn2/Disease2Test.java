package edu.disease.asn2;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import java.util.UUID;

import org.junit.jupiter.api.Test;

class Disease2Test {
		    
	 @Test
	    void testAbstractMethod() {
	        Disease2 disease = new Disease2() {
	            @Override
	            public String[] getExamples() {
	                return new String[0];
	            }
	        };

	        assertNotNull(disease.getExamples());
	        assertEquals(0, disease.getExamples().length);
	    }
	 @Test
	    public void testDisease2DefaultConstructor() {
	        Disease2 disease = new Disease2() {
	            @Override
	            public String[] getExamples() {
	                return null; // Not needed for this test
	            }
	        };

	        assertNotNull(disease);
	    }

	    @Test
	    public void testDisease2UUIDConstructor() {
	        UUID diseaseId = UUID.randomUUID();
	        Disease2 disease = new Disease2(diseaseId) {
	            @Override
	            public String[] getExamples() {
	                return null; // Not needed for this test
	            }
	        };

	        assertNotNull(disease);
	        assertEquals(diseaseId, disease.getDiseaseId());
	    }

	    @Test
	    public void testDisease2UUIDNameConstructor() {
	        UUID diseaseId = UUID.randomUUID();
	        String name = "Test Disease";
	        Disease2 disease = new Disease2(diseaseId, name) {
	            @Override
	            public String[] getExamples() {
	                return null; // Not needed for this test
	            }
	        };

	        assertNotNull(disease);
	        assertEquals(diseaseId, disease.getDiseaseId());
	        assertEquals(name, disease.getName());
	    }

	    @Test
	    void testConstructorWithName() {
	        String name = "Test Disease";
	        Disease2.InfectiousDisease infectiousDiseaseWithName = new Disease2.InfectiousDisease(name);

	        assertNull(infectiousDiseaseWithName.getDiseaseId());
	        assertEquals(name, infectiousDiseaseWithName.getName());
	    }

	   

	    @Test
	    void testInfectiousDiseaseExamples() {
	        Disease2.InfectiousDisease infectiousDisease = new Disease2.InfectiousDisease();

	        assertNotNull(infectiousDisease.getExamples());
	        assertTrue(infectiousDisease.getExamples().length > 0);
	    }

	    @Test
	    void testNonInfectiousDiseaseExamples() {
	        Disease2.NonInfectiousDisease nonInfectiousDisease = new Disease2.NonInfectiousDisease();

	        assertNotNull(nonInfectiousDisease.getExamples());
	        assertTrue(nonInfectiousDisease.getExamples().length > 0);
	    }
	    
	    @Test
	    void testInfectiousDiseaseConstructor() {
	        UUID diseaseId = UUID.randomUUID();
	        String name = "COVID-19";
	        Disease2.InfectiousDisease disease = new Disease2.InfectiousDisease(diseaseId, name);
	        assertNotNull(disease);
	        assertEquals(diseaseId, disease.getDiseaseId());
	        assertEquals(name, disease.getName());
	    }

	    
	    @Test
	    public void testDisease2NameConstructor() {
	        String name = "Test Disease";
	        Disease2 disease = new Disease2(name) {
	            @Override
	            public String[] getExamples() {
	                return null; // Not needed for this test
	            }
	        };

	        assertNotNull(disease);
	        assertNull(disease.getDiseaseId());
	        assertEquals(name, disease.getName());
	    }
	    @Test
	    public void testSetDiseaseId() {
	        Disease2 disease = new Disease2() {
	            @Override
	            public String[] getExamples() {
	                return null; // Not needed for this test
	            }
	        };

	        UUID diseaseId = UUID.randomUUID();
	        disease.setDiseaseId(diseaseId);

	        assertEquals(diseaseId, disease.getDiseaseId());
	    }

	    @Test
	    public void testSetName() {
	        Disease2 disease = new Disease2() {
	            @Override
	            public String[] getExamples() {
	                return null; // Not needed for this test
	            }
	        };

	        String name = "Test Disease";
	        disease.setName(name);

	        assertEquals(name, disease.getName());
	    }
	   


	    @Test
	    void testHashCodeWithDifferentName() {
	        Disease2 disease1 = new Disease2.InfectiousDisease(UUID.randomUUID(), "COVID-19");
	        Disease2 disease2 = new Disease2.InfectiousDisease(UUID.randomUUID(), "Influenza");

	        assertNotEquals(disease1.hashCode(), disease2.hashCode());
	    }

	    @Test
	    void testEqualsWithEqualObjects() {
	        UUID diseaseId = UUID.randomUUID();
	        Disease2 disease1 = new Disease2.InfectiousDisease(diseaseId, "COVID-19");
	        Disease2 disease2 = new Disease2.InfectiousDisease(diseaseId, "COVID-19");

	        assertTrue(disease1.equals(disease2));
	        assertTrue(disease2.equals(disease1));
	    }

	    @Test
	    void testEqualsWithDifferentObjects() {
	        Disease2 disease1 = new Disease2.InfectiousDisease(UUID.randomUUID(), "COVID-19");
	        Disease2 disease2 = new Disease2.InfectiousDisease(UUID.randomUUID(), "Influenza");

	        assertFalse(disease1.equals(disease2));
	        assertFalse(disease2.equals(disease1));
	    }

	    @Test
	    void testEqualsWithNullObject() {
	        Disease2 disease = new Disease2.InfectiousDisease(UUID.randomUUID(), "COVID-19");
	        assertFalse(disease.equals(null));
	    }

	    @Test
	    void testEqualsWithSameObject() {
	        Disease2 disease = new Disease2.InfectiousDisease(UUID.randomUUID(), "COVID-19");
	        assertTrue(disease.equals(disease));
	    }
	    
	    @Test
	    void testNonInfectiousDiseaseConstructor() {
	        String testName = "Diabetes";
	        Disease2  disease = new Disease2.NonInfectiousDisease(testName);

	        assertEquals(testName, disease.getName());
	    }
	    
	    @Test
	    void testToString() {
	        String testName = "COVID-19";
	        UUID testId = UUID.randomUUID();
	        Disease2 disease = new Disease2.InfectiousDisease(testId, testName);

	        String expectedString = "[ DiseaseId : " + testId + " Name : ]" + testName;
	        assertEquals(expectedString, disease.toString());
	    }
	    @Test
	    void testNonInfectiousDiseaseConstructorWithId() {
	        UUID testId = UUID.randomUUID();
	        Disease2 disease = new Disease2.NonInfectiousDisease(testId);

	        assertEquals(testId, disease.getDiseaseId());
	        assertNull(disease.getName());
	    }

	    @Test
	    void testNonInfectiousDiseaseConstructorWithNameAndId() {
	        UUID testId = UUID.randomUUID();
	        String testName = "Diabetes";
	        Disease2 disease = new Disease2.NonInfectiousDisease(testId, testName);

	        assertEquals(testId, disease.getDiseaseId());
	        assertEquals(testName, disease.getName());
	    }
	    
	    @Test
	    void testInfectiousDiseaseConstructorWithId() {
	        UUID testId = UUID.randomUUID();
	        Disease2 disease = new Disease2.InfectiousDisease(testId);

	        assertEquals(testId, disease.getDiseaseId());
	        assertNull(disease.getName());
	    }
	    @Test
	    void testHashCodeWithNullName() {
	        UUID testId = UUID.randomUUID();
	        Disease2 disease = new Disease2.InfectiousDisease(testId);

	        int expectedHashCode = testId.hashCode();
	        int actualHashCode = disease.hashCode();

	        assertEquals(expectedHashCode, actualHashCode);
	    }
	    
	  

	    @Test
	    void testEqualsWithDifferentClass() {
	        Disease2 disease = new Disease2.InfectiousDisease(UUID.randomUUID());

	        boolean result = disease.equals(new Object());

	        assertFalse(result);
	    }
	    @Test
	    void testEqualsWithDifferentDiseaseId() {
	        UUID diseaseId1 = UUID.randomUUID();
	        UUID diseaseId2 = UUID.randomUUID();

	        Disease2 disease1 = new Disease2.InfectiousDisease(diseaseId1);
	        Disease2 disease2 = new Disease2.InfectiousDisease(diseaseId2);

	        boolean result = disease1.equals(disease2);

	        assertFalse(result);
	    }

	    @Test
	    void testEqualsWithSameDiseaseId() {
	        UUID diseaseId = UUID.randomUUID();

	        Disease2 disease1 = new Disease2.InfectiousDisease(diseaseId);
	        Disease2 disease2 = new Disease2.InfectiousDisease(diseaseId);

	        boolean result = disease1.equals(disease2);

	        assertTrue(result);
	    }
	    
}
