package edu.disease.asn1;

import java.util.Arrays;
import java.util.UUID;

/**
 * @author Ahmed Rifdhan M.S
 */
public class Patient {
	private UUID patientId; // I declare a variable by name patientId of type UUID with private access Specifier.
	private String firstName;// I declare a variable by name firstName of type String with private access Specifier.
	private String lastName;// I declare a variable by name lastName of type String with private access Specifier.
	private Exposure[] exposures;// I declare a variable by name exposures of type Exposure Array with private access Specifier.
	private UUID[] diseaseIds;// I declare a variable by name diseaseIds of type UUID Array with private access Specifier.

	/**
	 * @param patientId
	 * @param firstName
	 * @param lastName
	 * @param exposures
	 * @param diseaseIds
	 */

	public Patient() {

	}

	public Patient(Exposure es) {
		this.exposures = new Exposure[] { es };
	}

	public Patient(UUID patient) {
		this.patientId = patient;
	}

	public Patient(UUID patient, String fname, String lname) {
		this.patientId = patient;
		this.firstName = fname;
		this.lastName = lname;
	}

	public Patient(String fname, String lname) {
		this.firstName = fname;
		this.lastName = lname;
	}

	public Patient(int[] maxDiseases, int[] maxExposures) {
		if (maxDiseases == null || maxExposures == null || maxDiseases.length != 1 || maxExposures.length != 1
				|| maxDiseases[0] <= 0 || maxExposures[0] <= 0) {
			throw new IllegalArgumentException("Invalid maxDiseases or maxExposures values");
		}

		this.diseaseIds = new UUID[maxDiseases[0]];
		this.exposures = new Exposure[maxExposures[0]];
	}

	public void addDiseaseId(UUID valueToAdd) {
		// Find an empty index to add the UUID
		int emptyIndex = -1;
		for (int i = 0; i < diseaseIds.length; i++) {
			if (diseaseIds[i] == null) {
				emptyIndex = i;
				break;
			}
		}

		if (emptyIndex != -1) {
			diseaseIds[emptyIndex] = valueToAdd;
		} else {
			throw new ArrayIndexOutOfBoundsException("diseaseIds array is full");
		}
	}

	public void addExposure(Exposure exposureToAdd) {
		// Find an empty index to add the exposure
		int emptyIndex = -1;
		for (int i = 0; i < exposures.length; i++) {
			if (exposures[i] == null) {
				emptyIndex = i;
				break;
			}
		}

		if (emptyIndex != -1) {
			exposures[emptyIndex] = exposureToAdd;
		} else {
			throw new ArrayIndexOutOfBoundsException("exposures array has reached its maximum capacity ");
		}
	}

	/**
	 * @return patientId
	 */
	public UUID getPatientId() {
		return patientId;
	}

	/**
	 * @param patientId the patientId to set
	 */

	public void setPatientId(UUID patientId) {
		this.patientId = patientId;
	}

	/**
	 * @return firstName
	 */

	public String getFirstName() {
		return firstName;
	}

	/**
	 * @param firstName the firstName to set
	 */

	public void setFirstName(String firstname) {
		this.firstName = firstname;
	}

	/**
	 * @return lastName
	 */

	public String getLastName() {
		return lastName;
	}

	/**
	 * @param lastName the lastName to set
	 */

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * @return exposures
	 */

	public Exposure[] getExposures() {
		return exposures;
	}

	/**
	 * @param exposures the exposures to set
	 */

	public void setExposures(Exposure[] exposures) {
		this.exposures = exposures;
	}

	/**
	 * @return diseaseIds
	 */

	public UUID[] getDiseaseIds() {
		return diseaseIds;
	}

	/**
	 * @param diseaseIds the diseaseIds to set
	 */

	public void setDiseaseIds(UUID[] diseaseIds) {
		this.diseaseIds = diseaseIds;
	}

	@Override
	public int hashCode() {
		int result = 17; // Prime number to start with

		// Include patientId
		if (patientId != null) {
			result = 31 * result + patientId.hashCode();
		}

		// Include firstname and lastname
		if (firstName != null) {
			result = 31 * result + firstName.hashCode();
		}
		if (lastName != null) {
			result = 31 * result + lastName.hashCode();
		}

		return result;
	}

	@Override   // shortcut   alt + shift + s
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null || getClass() != obj.getClass()) {
			return false;
		}
		Patient other = (Patient) obj;

		// Compare patientId if it's not null
		if (patientId != null) {
			return patientId.equals(other.patientId);
		}

		// Compare diseaseIds and exposures if patientId is null
		if (diseaseIds != null && exposures != null) {
			return Arrays.equals(diseaseIds, other.diseaseIds) && Arrays.equals(exposures, other.exposures);
		}

		// Compare exposures if patientId and diseaseIds are null
		if (exposures != null) {
			return Arrays.equals(exposures, other.exposures);
		}

		// Compare firstname and lastname if all else is null
		if (firstName != null && lastName != null) {
			return firstName.equals(other.firstName) && lastName.equals(other.lastName);
		}

		return false;
	}

	@Override
	public String toString() {
		return "[ PatentId :" + this.patientId + " firstName : " + this.firstName + " lastName : " + this.lastName
				+ " DiseaseId : " + this.diseaseIds + " Exposures : ]" + this.exposures;
	}

}
