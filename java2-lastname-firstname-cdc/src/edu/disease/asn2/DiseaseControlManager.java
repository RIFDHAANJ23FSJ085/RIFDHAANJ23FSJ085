package edu.disease.asn2;

import java.util.UUID;

import edu.disease.asn1.Exposure;

public interface DiseaseControlManager {

	Disease2 addDisease(String name, boolean infectious);

	Disease2 getDisease(UUID diseaseId);

	Patient2 addPatient(String firstname, String lastname, int maxDiseases, int maxExposures);

	Patient2 getPatient(UUID patientId);

	void addDiseaseToPatient(UUID patientId, UUID diseaseId);

	void addExposureToPatient(UUID patientId, Exposure exposure);
}
