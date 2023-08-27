package edu.disease.asn1;

import java.util.UUID;

/**
 * @author Ahmed Rifdhan M.S
 */

public class Disease {

	private UUID diseaseId;
	private String name;

	/**
	 * @param diseaseId
	 * @param name
	 */

	public Disease() {
		// TODO Auto-generated constructor stub
	}

	public Disease(UUID diseaseId) {
		this.diseaseId = diseaseId;
	}

	public Disease(UUID diseaseId, String name) {
		this.diseaseId = diseaseId;
		this.name = name;
	}

	public Disease(String name) {
		this.name = name;
	}

	/**
	 * @return diseaseId
	 */
	public UUID getDiseaseId() {
		return diseaseId;
	}

	/**
	 * @param diseaseId the diseaseId to set
	 */

	public void setDiseaseId(UUID diseaseId) {
		this.diseaseId = diseaseId;
	}

	/**
	 * @return name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int hashCode() {
		if (name == null) {
			return diseaseId.hashCode();
		} else {
			return diseaseId.hashCode() + name.hashCode();
		}
	}

	@Override
	public boolean equals(Object obj) {
		Disease d = (Disease) obj;
		if (this.name == null) {
			if (this.diseaseId.hashCode() == d.diseaseId.hashCode()) {
				return true;
			} else {
				return false;
			}
		} else {
			if (this.diseaseId.hashCode() == d.diseaseId.hashCode() && this.name.hashCode() == d.name.hashCode()) {
				return true;
			} else {
				return false;
			}
		}
	}

	@Override
	public String toString() {
		return "[ DiseaseId : " + this.diseaseId + " Name : ]" + this.name;
	}

}
