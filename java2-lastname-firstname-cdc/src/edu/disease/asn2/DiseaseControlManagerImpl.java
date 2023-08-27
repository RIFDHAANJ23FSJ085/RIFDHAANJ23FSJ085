package edu.disease.asn2;

/**
 * @author Ahmed Rifdhan M.S
 * */

import java.util.UUID;

import edu.disease.asn1.Exposure;

public class DiseaseControlManagerImpl implements DiseaseControlManager {

	protected Disease2[] diseases; // i declared a variable by name diseases of type DiseaseArray 
	protected Patient2[] patients;
	
	/**
	 * @param diseases
	 * @param patients
	 * */
	
	public DiseaseControlManagerImpl() {

	}
	
	
	public DiseaseControlManagerImpl(Integer[] maxDiseases,Integer[] maxPatients) {
		 if (maxDiseases == null || maxPatients == null || maxDiseases.length != maxPatients.length) {
	            throw new IllegalArgumentException("Invalid input: maxDiseases and maxPatients must have the same length.");
	        }
		this.diseases = new Disease2[maxDiseases.length]; // Initialize the diseases array with the provided length
        this.patients = new Patient2[maxPatients.length];
	}
	
	
	// ... Other methods ...
	@Override
	public Disease2 addDisease(String name, boolean infectious) {
	    UUID diseaseId = UUID.randomUUID();

	    Disease2 newDisease;
	    if (infectious) {
	        newDisease = new Disease2.InfectiousDisease(diseaseId, name);
	    } else {
	        newDisease = new Disease2.NonInfectiousDisease(diseaseId, name);
	    }

	    // Find an empty index in the diseases array
	    int emptyIndex = findEmptyIndex(diseases);
	    if (emptyIndex != -1) {
	        diseases[emptyIndex] = newDisease;
	        return newDisease;
	    } else {
	        throw new IllegalStateException("Diseases array is full");
	    }
	}

	protected int findEmptyIndex(Object[] array) {
	    for (int i = 0; i < array.length; i++) {
	        if (array[i] == null) {
	            return i;
	        }
	    }
	    return -1;
	}
	
	@Override
	public void addDiseaseToPatient(UUID patientId, UUID diseaseId) {
			Patient2 patient = new Patient2();
			
			if(patientId == patient.getPatientId()) {
				patient.addDiseaseId(diseaseId);
			}
			else {
				throw new IllegalArgumentException("Patient is not found.");
				
			}
	}
	
	@Override
	public void addExposureToPatient(UUID patientId, Exposure exposure) {
			Patient2 patient = new Patient2(); // Get the patient using the provided patientId
		    if (patientId == patient.getPatientId() ) {
		        patient.addExposure(exposure);
		    } 
		    else {
		    	throw new IllegalArgumentException("Patient is not found.");
		    }
	}
	
	
	@Override
	public Patient2 addPatient(String firstname, String lastname, int maxDiseases, int maxExposures) {

		Patient2 p=new Patient2();

			
			UUID a=UUID.randomUUID();
			p.setPatientId(a);
			p.setFirstName(firstname);
			p.setLastName(lastname);
			 p.setDiseaseIds(new UUID[maxDiseases]);
		        
		        // Set exposures array with appropriate size
		        p.setExposures(new Exposure[maxExposures]);
		     
		return p;
		
	}
	
	@Override
	public Disease2 getDisease(UUID diseaseId) {
		 for (Disease2 disease : diseases) {// enhanced for Loop (foreach loop) introduced in jdk5 it is only used for array and collections. 
		        if (disease != null && disease.getDiseaseId().equals(diseaseId)) {
		            return disease;
		        }
		    }
		    return null;
	}
	
	@Override
	public Patient2 getPatient(UUID patientId) {
		for (Patient2 patient : patients) {
	        if (patient != null && patient.getPatientId().equals(patientId)) {
	            return patient;
	        }
	    }
		return null;
	}
	
	
	
	
}
