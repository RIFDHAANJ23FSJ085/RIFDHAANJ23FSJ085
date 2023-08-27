package edu.disease.asn1;


import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.UUID;

import org.junit.jupiter.api.Test;

class DiseaseTest {

	@Test
    public void testDiseaseEqualityWithDiseaseId() {
        UUID diseaseId1 = UUID.randomUUID();
        UUID diseaseId2 = UUID.randomUUID();

        Disease disease1 = new Disease(diseaseId1);
        Disease disease2 = new Disease(diseaseId2);

        assertFalse(disease1.equals(disease2));
        assertTrue(disease1.equals(disease1));
    }

    @Test
    public void testDiseaseEqualityWithName() {
        UUID diseaseId1 = UUID.randomUUID();
//        UUID diseaseId2 = UUID.randomUUID();
        Disease disease1 = new Disease(diseaseId1,"Flu");
        Disease disease2 = new Disease(diseaseId1,"Flu");

        assertTrue(disease1.equals(disease2));
    }

    @Test
    public void testDiseaseEqualityWithBothFields() {
        UUID diseaseId = UUID.randomUUID();

        Disease disease1 = new Disease(diseaseId, "Flu");
        Disease disease2 = new Disease(diseaseId, "Flu");
        Disease disease3 = new Disease(diseaseId, "COVID-19");

        assertTrue(disease1.equals(disease2));
        assertFalse(disease1.equals(disease3));
    }

    @Test
    public void testDiseaseInequality() {
        UUID diseaseId = UUID.randomUUID();

        Disease disease1 = new Disease(diseaseId, "Flu");
        Disease disease2 = new Disease(UUID.randomUUID(), "COVID-19");

        assertFalse(disease1.equals(disease2));
    }

    @Test
    public void testDiseaseHashCodeWithDiseaseId() {
        UUID diseaseId = UUID.randomUUID();
        Disease disease = new Disease(diseaseId);

        assertEquals(diseaseId.hashCode(), disease.hashCode());
    }

   

    @Test
    public void testDiseaseToString() {
        UUID diseaseId = UUID.randomUUID();
        String name = "COVID-19";

        Disease disease = new Disease(diseaseId);
        disease.setName(name);

        String expected = "[ DiseaseId : " + diseaseId + " Name : ]" + name;
        assertEquals(expected, disease.toString());
    }
    @Test
    public void testGetDiseaseId() {
        UUID diseaseId = UUID.randomUUID();
        Disease disease = new Disease(diseaseId);

        assertEquals(diseaseId, disease.getDiseaseId());
    }

    @Test
    public void testSetDiseaseId() {
        UUID diseaseId1 = UUID.randomUUID();
        UUID diseaseId2 = UUID.randomUUID();
        Disease disease = new Disease(diseaseId1);

        disease.setDiseaseId(diseaseId2);
        assertEquals(diseaseId2, disease.getDiseaseId());
    }

    @Test
    public void testGetName() {
        String name = "COVID-19";
        Disease disease = new Disease(name);

        assertEquals(name, disease.getName());
    }
    @Test
    public void testDefaultConstructor() {
        Disease disease = new Disease();

        assertNotNull(disease); // Ensure the instance is not null
        assertNull(disease.getDiseaseId()); // Check that diseaseId is null
        assertNull(disease.getName()); // Check that name is null
    }
    @Test
    public void testHashCodeWithNameNotNull() {
        UUID diseaseId = UUID.randomUUID();
        String name = "COVID-19";
        Disease disease = new Disease();
        disease.setDiseaseId(diseaseId);
        disease.setName(name);

        int expectedHashCode = diseaseId.hashCode() + name.hashCode();
        int actualHashCode = disease.hashCode();

        assertEquals(expectedHashCode, actualHashCode);
    }
}
