package edu.disease.asn1;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.UUID;

import org.junit.jupiter.api.Test;

class PatientTest {
	@Test
	public void testPatientEqualityWithPatientId() {
		UUID patientId1 = UUID.randomUUID();
		UUID patientId2 = UUID.randomUUID();

		Patient patient1 = new Patient(patientId1);
		Patient patient2 = new Patient(patientId2);

		assertFalse(patient1.equals(patient2));
		assertTrue(patient1.equals(patient1));
	}

	@Test
	public void testPatientEqualityWithFirstnameAndLastname() {
		Patient patient1 = new Patient("John", "Doe");
		Patient patient2 = new Patient("Jane", "Smith");

		assertFalse(patient1.equals(patient2));
		assertTrue(patient1.equals(patient1));
	}

	@Test
	public void testPatientEqualityWithMixedFields() {
		UUID patientId = UUID.randomUUID();

		Patient patient1 = new Patient(patientId, "John", "Doe");
		Patient patient2 = new Patient(patientId, "John", "Doe");
		patient1.setDiseaseIds(new UUID[] { UUID.randomUUID() });
		patient2.setDiseaseIds(new UUID[] { UUID.randomUUID() });
		patient1.setExposures(new Exposure[] { new Exposure(null, patientId, null) });
		patient2.setExposures(new Exposure[] { new Exposure(null, patientId, null) });

		assertTrue(patient1.equals(patient2));
	}

	@Test
	public void testPatientInequality() {
		UUID patientId = UUID.randomUUID();

		Patient patient1 = new Patient(patientId, "John", "Doe");
		Patient patient2 = new Patient(UUID.randomUUID(), "Jane", "Smith");

		assertFalse(patient1.equals(patient2));
	}

	@Test
	public void testEqualsAndHashCodeWithPatientId() {
		UUID patientId1 = UUID.randomUUID();
		UUID patientId2 = UUID.randomUUID();

		Patient patient1 = new Patient(patientId1);
		Patient patient2 = new Patient(patientId1);
		Patient patient3 = new Patient(patientId2);

		assertTrue(patient1.equals(patient2));
		assertFalse(patient1.equals(patient3));

		assertEquals(patient1.hashCode(), patient2.hashCode());
		assertNotEquals(patient1.hashCode(), patient3.hashCode());
	}

	@Test
	public void testEqualsAndHashCodeWithFirstnameAndLastname() {
		Patient patient1 = new Patient("John", "Doe");
		Patient patient2 = new Patient("John", "Doe");
		Patient patient3 = new Patient("Jane", "Doe");

		assertTrue(patient1.equals(patient2));
		assertFalse(patient1.equals(patient3));

		assertEquals(patient1.hashCode(), patient2.hashCode());
		assertNotEquals(patient1.hashCode(), patient3.hashCode());
	}

	@Test
	public void testConstructorWithValidValues() {
		int[] maxDiseases = { 5 };
		int[] maxExposures = { 3 };

		Patient patient = new Patient(maxDiseases, maxExposures);

		assertNotNull(patient.getDiseaseIds());
		assertNotNull(patient.getExposures());
		assertEquals(maxDiseases[0], patient.getDiseaseIds().length);
		assertEquals(maxExposures[0], patient.getExposures().length);
	}

	@Test
	public void testConstructorWithInvalidValues() {
		int[] invalidMaxDiseases = { 0 };
		int[] invalidMaxExposures = { -1 };

		assertThrows(IllegalArgumentException.class, () -> new Patient(invalidMaxDiseases, invalidMaxExposures));
	}

	@Test
	public void testAddDiseaseId() {
		UUID id1 = UUID.randomUUID();
		UUID id2 = UUID.randomUUID();
		UUID id3 = UUID.randomUUID();

		int maxDiseases = 3;
		int maxExposures = 5;
		Patient patient = new Patient(new int[] { maxDiseases }, new int[] { maxExposures });

		patient.addDiseaseId(id1);
		assertEquals(id1, patient.getDiseaseIds()[0]);

		patient.addDiseaseId(id2);
		assertEquals(id2, patient.getDiseaseIds()[1]);

		patient.addDiseaseId(id3);
		assertEquals(id3, patient.getDiseaseIds()[2]);

		// Adding one more should throw an exception
		assertThrows(ArrayIndexOutOfBoundsException.class, () -> patient.addDiseaseId(UUID.randomUUID()));
	}

//    @Test
//    public void testAddExposure() {
//        Exposure exposure1 = new Exposure(UUID.randomUUID());
//        Exposure exposure2 = new Exposure(UUID.randomUUID());
//
//        int maxDiseases = 3;
//        int maxExposures = 2;
//        Patient patient = new Patient(new int[]{maxDiseases}, new int[]{maxExposures});
//
//        patient.addExposure(exposure1);
//        assertEquals(exposure1, patient.getExposures()[0]);
//
//        patient.addExposure(exposure2);
//        assertEquals(exposure2, patient.getExposures()[1]);
//
//        // Adding one more should throw an exception
//        assertThrows(ArrayIndexOutOfBoundsException.class, () -> patient.addExposure(new Exposure(UUID.randomUUID())));
//    }

	@Test
	public void testEqualsWithSameObject() {
		Patient patient = new Patient();
		assertTrue(patient.equals(patient));
	}

	@Test
	public void testEqualsWithNullObject() {
		Patient patient = new Patient();
		assertFalse(patient.equals(null));
	}

	@Test
	public void testEqualsWithDifferentClass() {
		Patient patient = new Patient();
		assertFalse(patient.equals("Not a Patient object"));
	}

	@Test
	public void testEqualsWithEqualPatientIds() {
		UUID patientId = UUID.randomUUID();
		Patient patient1 = new Patient(patientId);
		Patient patient2 = new Patient(patientId);
		assertTrue(patient1.equals(patient2));
	}

	@Test
	public void testEqualsWithDifferentPatientIds() {
		Patient patient1 = new Patient(UUID.randomUUID());
		Patient patient2 = new Patient(UUID.randomUUID());
		assertFalse(patient1.equals(patient2));
	}

	@Test
	public void testEqualsWithEqualDiseaseIdsAndExposures() {
		Exposure exposure1 = new Exposure();
		Exposure exposure2 = new Exposure();
		UUID[] diseaseIds1 = { UUID.randomUUID() };
		UUID[] diseaseIds2 = { UUID.randomUUID() };
		Exposure[] exposures1 = { exposure1 };
		Exposure[] exposures2 = { exposure2 };

		Patient patient1 = new Patient();
		Patient patient2 = new Patient();
		Patient patient3 = new Patient();

		patient1.setDiseaseIds(diseaseIds1);
		patient1.setExposures(exposures1);

		patient2.setDiseaseIds(diseaseIds1);
		patient2.setExposures(exposures1);

		patient3.setDiseaseIds(diseaseIds2);
		patient3.setExposures(exposures2);

		assertTrue(patient1.equals(patient2));
		assertFalse(patient1.equals(patient3));
	}

	@Test
	public void testEqualsWithEqualFirstAndLastNames() {
		Patient patient1 = new Patient("John", "Doe");
		Patient patient2 = new Patient("John", "Doe");
		assertTrue(patient1.equals(patient2));
	}

	@Test
	public void testEqualsWithDifferentFirstNames() {
		Patient patient1 = new Patient("John", "Doe");
		Patient patient2 = new Patient("Jane", "Doe");
		assertFalse(patient1.equals(patient2));
	}

	@Test
	public void testEqualsWithDifferentLastNames() {
		Patient patient1 = new Patient("John", "Doe");
		Patient patient2 = new Patient("John", "Smith");
		assertFalse(patient1.equals(patient2));
	}

	@Test
	public void testGetSetPatientId() {
		UUID patientId = UUID.randomUUID();
		Patient patient = new Patient();

		patient.setPatientId(patientId);
		assertEquals(patientId, patient.getPatientId());
	}

	@Test
	public void testGetSetFirstname() {
		String firstname = "John";
		Patient patient = new Patient();

		patient.setFirstName(firstname);
		assertEquals(firstname, patient.getFirstName());
	}

	@Test
	public void testGetSetLastname() {
		String lastname = "Doe";
		Patient patient = new Patient();

		patient.setLastName(lastname);
		assertEquals(lastname, patient.getLastName());
	}

	@Test
	public void testHashCodeWithDifferentFields() {
		Patient patient1 = new Patient();
		patient1.setPatientId(UUID.randomUUID());
		patient1.setFirstName("John");

		Patient patient2 = new Patient();
		patient2.setLastName("Doe");

		assertNotEquals(patient1.hashCode(), patient2.hashCode());
	}

	@Test
	public void testHashCodeWithNullFields() {
		Patient patient1 = new Patient();
		patient1.setPatientId(null);

		Patient patient2 = new Patient();
		patient2.setLastName(null);

		assertEquals(patient1.hashCode(), patient2.hashCode());
	}

	@Test
	public void testEqualsWithPatientId() {
		Patient patient1 = new Patient();
		patient1.setPatientId(UUID.randomUUID());

		Patient patient2 = new Patient();
		patient2.setPatientId(patient1.getPatientId());

		assertTrue(patient1.equals(patient2));
	}

	@Test
	public void testEqualsWithDiseaseIdsAndExposures() {
		Patient patient1 = new Patient();
		patient1.setDiseaseIds(new UUID[] { UUID.randomUUID() });
		patient1.setExposures(new Exposure[] { new Exposure() });

		Patient patient2 = new Patient();
		patient2.setDiseaseIds(patient1.getDiseaseIds());
		patient2.setExposures(patient1.getExposures());

		assertTrue(patient1.equals(patient2));
	}

	@Test
	public void testEqualsWithExposuresOnly() {
		Patient patient1 = new Patient();
		patient1.setExposures(new Exposure[] { new Exposure() });

		Patient patient2 = new Patient();
		patient2.setExposures(patient1.getExposures());

		assertTrue(patient1.equals(patient2));
	}

	@Test
	public void testEqualsWithFirstnameAndLastname() {
		Patient patient1 = new Patient();
		patient1.setFirstName("John");
		patient1.setLastName("Doe");

		Patient patient2 = new Patient();
		patient2.setFirstName(patient1.getFirstName());
		patient2.setLastName(patient1.getLastName());

		assertTrue(patient1.equals(patient2));
	}

	@Test
	public void testEqualsWithDifferentFields() {
		Patient patient1 = new Patient();
		patient1.setPatientId(UUID.randomUUID());

		Patient patient2 = new Patient();
		patient2.setFirstName("John");

		assertFalse(patient1.equals(patient2));
	}

	@Test
	public void testToString() {
		UUID patientId = UUID.randomUUID();
		String firstName = "John";
		String lastName = "Doe";
		UUID[] diseaseIds = { UUID.randomUUID(), UUID.randomUUID() };
		Exposure[] exposures = { new Exposure() };

		Patient patient = new Patient();
		patient.setPatientId(patientId);
		patient.setFirstName(firstName);
		patient.setLastName(lastName);
		patient.setDiseaseIds(diseaseIds);
		patient.setExposures(exposures);

		String expected = "[ PatentId :" + patientId + " firstName : " + firstName + " lastName : " + lastName
				+ " DiseaseId : " + diseaseIds + " Exposures : ]" + exposures;

		assertEquals(expected, patient.toString());

	}

	@Test
	public void testAddExposureWithFullExposuresArray() {
		Patient patient = new Patient();
		Exposure exposure1 = new Exposure();
		Exposure exposure2 = new Exposure();
		patient.setExposures(new Exposure[] { exposure1, exposure2 });

		assertThrows(ArrayIndexOutOfBoundsException.class, () -> patient.addExposure(new Exposure()));
	}

	@Test
	public void testConstructorWithFirstnameAndLastname() {
		String firstName = "John";
		String lastName = "Doe";
		Patient patient = new Patient(firstName, lastName);

		assertEquals(firstName, patient.getFirstName());
		assertEquals(lastName, patient.getLastName());
	}

	@Test
	public void testAddDiseaseIdSuccessful() {
		UUID id1 = UUID.randomUUID();
		UUID id2 = UUID.randomUUID();
		int maxDiseases = 3;
		int maxExposures = 5;
		Patient patient = new Patient(new int[] { maxDiseases }, new int[] { maxExposures });

		patient.addDiseaseId(id1);
		assertEquals(id1, patient.getDiseaseIds()[0]);

		patient.addDiseaseId(id2);
		assertEquals(id2, patient.getDiseaseIds()[1]);
	}

	@Test
	public void testAddDiseaseIdArrayFull() {
		UUID id1 = UUID.randomUUID();
		int maxDiseases = 1;
		int maxExposures = 5;
		Patient patient = new Patient(new int[] { maxDiseases }, new int[] { maxExposures });
		patient.addDiseaseId(id1);

		assertThrows(ArrayIndexOutOfBoundsException.class, () -> patient.addDiseaseId(UUID.randomUUID()));
	}

	@Test
	public void testAddExposureArrayFull() {
		Exposure exposure1 = new Exposure(null, UUID.randomUUID(), null);
		int maxDiseases = 3;
		int maxExposures = 1;
		Patient patient = new Patient(new int[] { maxDiseases }, new int[] { maxExposures });
		patient.addExposure(exposure1);

		assertThrows(ArrayIndexOutOfBoundsException.class,
				() -> patient.addExposure(new Exposure(null, UUID.randomUUID(), null)));
	}

	@Test
	public void testConstructorWithExposure() {
		Exposure exposure = new Exposure(null, UUID.randomUUID(), null);
		Patient patient = new Patient(exposure);

		assertEquals(1, patient.getExposures().length);
	}

	@Test
	public void testConstructorWithValidMaxValues() {
		int[] maxDiseases = { 5 };
		int[] maxExposures = { 3 };
		Patient patient = new Patient(maxDiseases, maxExposures);

		assertNotNull(patient.getDiseaseIds());
		assertNotNull(patient.getExposures());
		assertEquals(maxDiseases[0], patient.getDiseaseIds().length);
		assertEquals(maxExposures[0], patient.getExposures().length);
	}

	@Test
	public void testConstructorWithInvalidMaxValues() {
		int[] invalidMaxDiseases = { 0 };
		int[] invalidMaxExposures = { -1 };

		assertThrows(IllegalArgumentException.class, () -> new Patient(invalidMaxDiseases, invalidMaxExposures));
	}

}
