package edu.disease.asn2;

import static org.junit.jupiter.api.Assertions.*;

import java.util.UUID;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import edu.disease.asn1.Exposure;

class DiseaseControlManagerTest {
	private DiseaseControlManagerImpl manager;

	@BeforeEach
	void setUp() {
		manager = new DiseaseControlManagerImpl(new Integer[5], new Integer[5]);
	}

	@Test
	void testConstructorWithNullMaxDiseases() {
		Integer[] maxDiseases = null;
		Integer[] maxPatients = { 5, 3, 7 };

		assertThrows(IllegalArgumentException.class, () -> new DiseaseControlManagerImpl(maxDiseases, maxPatients));
	}

	@Test
	void testConstructorWithNullMaxPatients() {
		Integer[] maxDiseases = { 5, 3, 7 };
		Integer[] maxPatients = null;

		assertThrows(IllegalArgumentException.class, () -> new DiseaseControlManagerImpl(maxDiseases, maxPatients));
	}

	@Test
	void testConstructorWithMismatchedArrays() {
		Integer[] maxDiseases = { 5, 3, 7 };
		Integer[] maxPatients = { 5, 3, 7, 2 };

		assertThrows(IllegalArgumentException.class, () -> new DiseaseControlManagerImpl(maxDiseases, maxPatients));
	}

	@Test
	void testAddPatient() {
		String firstname = "John";
		String lastname = "Doe";
		int maxDiseases = 5;
		int maxExposures = 10;

//	        Patient2Manager manager = new Patient2Manager(); // Assuming you have a Patient2Manager class

		Patient2 patient = manager.addPatient(firstname, lastname, maxDiseases, maxExposures);

		assertNotNull(patient);
		assertNotNull(patient.getPatientId());
		assertEquals(firstname, patient.getFirstName());
		assertEquals(lastname, patient.getLastName());
		assertNotNull(patient.getDiseaseIds());
		assertEquals(maxDiseases, patient.getDiseaseIds().length);
		assertNotNull(patient.getExposures());
		assertEquals(maxExposures, patient.getExposures().length);
	}

	@Test
	void testConstructorWithValidInput() {
		Integer[] maxDiseases = { 3, 4, 5 };
		Integer[] maxPatients = { 3, 4, 5 };

		DiseaseControlManagerImpl manager = new DiseaseControlManagerImpl(maxDiseases, maxPatients);

		assertEquals(maxDiseases.length, manager.diseases.length);
		assertEquals(maxPatients.length, manager.patients.length);
	}

	@Test
	void testConstructorWithMismatchedInputLength() {
		Integer[] maxDiseases = { 3, 4, 5 };
		Integer[] maxPatients = { 3, 4 };

		assertThrows(IllegalArgumentException.class, () -> {
			new DiseaseControlManagerImpl(maxDiseases, maxPatients);
		});
	}

	@Test
	void testAddDisease() {
		Disease2 disease = manager.addDisease("COVID-19", true);
		assertNotNull(disease);
		assertEquals("COVID-19", disease.getName());
		assertTrue(disease instanceof Disease2.InfectiousDisease);
	}

//	@Test
//	void testAddDiseaseToPatient() {
//		// Arrange
//		UUID patientId = UUID.randomUUID();
//		UUID diseaseId = UUID.randomUUID();
//
//		// Act & Assert
//		assertThrows(IllegalArgumentException.class, () -> manager.addDiseaseToPatient(patientId, diseaseId));
//	}

	@Test
	void testGetDisease() {
		UUID diseaseId = UUID.randomUUID();
		Disease2 disease = new Disease2.InfectiousDisease(diseaseId, "COVID-19");
		manager.diseases[0] = disease;

		Disease2 retrievedDisease = manager.getDisease(diseaseId);
		assertEquals(disease, retrievedDisease);
	}

	@Test
	void testGetPatient() {
		UUID patientId = UUID.randomUUID();
		Patient2 patient = new Patient2(patientId, "Jane", "Smith");
		manager.patients[0] = patient;

		Patient2 retrievedPatient = manager.getPatient(patientId);
		assertEquals(patient, retrievedPatient);
	}

	@Test
	void testDefaultConstructor() {
		DiseaseControlManagerImpl manager = new DiseaseControlManagerImpl();
		assertNotNull(manager);
		// You can add more assertions based on your requirements
	}

	@Test
	void testAddInfectiousDisease() {
		String diseaseName = "COVID-19";

		Disease2 disease = manager.addDisease(diseaseName, true);

		assertNotNull(disease);
		assertEquals(diseaseName, disease.getName());
		assertTrue(disease instanceof Disease2.InfectiousDisease);
	}

	@Test
	void testAddNonInfectiousDisease() {
		String diseaseName = "Diabetes";

		Disease2 disease = manager.addDisease(diseaseName, false);

		assertNotNull(disease);
		assertEquals(diseaseName, disease.getName());
		assertTrue(disease instanceof Disease2.NonInfectiousDisease);
	}

	@Test
	void testAddDiseaseWhenArrayIsFull() {
		// Fill the diseases array to capacity
		for (int i = 0; i < manager.diseases.length; i++) {
			manager.diseases[i] = new Disease2.InfectiousDisease(UUID.randomUUID(), "Disease" + i);
		}

		assertThrows(IllegalStateException.class, () -> {
			manager.addDisease("New Disease", true);
		});
	}

	@Test
	void testGetExistingDisease() {
		UUID diseaseId = UUID.randomUUID();
		Disease2 disease = new Disease2.InfectiousDisease(diseaseId, "COVID-19");
		manager.diseases[0] = disease;

		Disease2 retrievedDisease = manager.getDisease(diseaseId);

		assertNotNull(retrievedDisease);
		assertEquals(diseaseId, retrievedDisease.getDiseaseId());
		assertEquals(disease.getName(), retrievedDisease.getName());
	}

	@Test
	void testGetNonExistingDisease() {
		UUID diseaseId = UUID.randomUUID();

		Disease2 retrievedDisease = manager.getDisease(diseaseId);

		assertNull(retrievedDisease);
	}

	@Test
	void testGetPatientWhenNotFound() {
		// Arrange
		UUID patientId = UUID.randomUUID();

		// Act
		Patient2 result = manager.getPatient(patientId);

		// Assert
		assertNull(result);
	}

	@Test
	void testGetPatientWhenFound() {
		// Arrange
		UUID patientId = UUID.randomUUID();
		Patient2 patient = new Patient2(patientId);
		manager.patients[0] = patient;

		// Act
		Patient2 result = manager.getPatient(patientId);

		// Assert
		assertNotNull(result);
		assertEquals(patientId, result.getPatientId());
	}

	@Test
	void testAddDiseaseToPatientWithNonMatchingIds() {
		DiseaseControlManagerImpl manager = new DiseaseControlManagerImpl();

		UUID patientId = UUID.randomUUID();
		UUID diseaseId = UUID.randomUUID();

		assertThrows(IllegalArgumentException.class, () -> manager.addDiseaseToPatient(patientId, diseaseId));
	}

	@Test
	void testAddExposureToPatientExceptionCheck() {
		// Arrange
		UUID patientId = UUID.randomUUID();
		Exposure exposure = new Exposure(null, null, "D");

		// Act
		assertThrows(IllegalArgumentException.class, () -> manager.addExposureToPatient(patientId, exposure));
	}

	@Test
	void testAddDiseaseInfectious() {
		String diseaseName = "COVID-19";
		Disease2 disease = manager.addDisease(diseaseName, true);

		assertNotNull(disease);
		assertEquals(diseaseName, disease.getName());
		assertTrue(disease instanceof Disease2.InfectiousDisease);
	}

	@Test
	void testAddDiseaseNonInfectious() {
		String diseaseName = "Diabetes";
		Disease2 disease = manager.addDisease(diseaseName, false);

		assertNotNull(disease);
		assertEquals(diseaseName, disease.getName());
		assertTrue(disease instanceof Disease2.NonInfectiousDisease);
	}

	@Test
	void testAddPatientWithMaxDiseasesAndExposures() {
		String firstname = "Alice";
		String lastname = "Johnson";
		int maxDiseases = 3;
		int maxExposures = 5;

		// Assuming you have a DiseaseControlManager instance with proper maxDiseases
		// and maxPatients
		DiseaseControlManager manager = new DiseaseControlManagerImpl(new Integer[3], new Integer[3]);

		Patient2 patient = manager.addPatient(firstname, lastname, maxDiseases, maxExposures);

		assertNotNull(patient);
		assertNotNull(patient.getPatientId());
		assertEquals(firstname, patient.getFirstName());
		assertEquals(lastname, patient.getLastName());
		assertNotNull(patient.getDiseaseIds());
		assertEquals(maxDiseases, patient.getDiseaseIds().length);
		assertNotNull(patient.getExposures());
		assertEquals(maxExposures, patient.getExposures().length);
	}

	@Test
	void testGetNonExistingPatient() {
		UUID nonExistingPatientId = UUID.randomUUID();

		Patient2 retrievedPatient = manager.getPatient(nonExistingPatientId);

		assertNull(retrievedPatient);
	}

}
