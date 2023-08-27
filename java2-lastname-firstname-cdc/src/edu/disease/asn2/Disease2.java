package edu.disease.asn2;

import java.util.UUID;

/**
 * @author Ahmed Rifdhan M.S
 */

public abstract class Disease2 {

	public abstract String[] getExamples();

	protected UUID diseaseId; // i declare a variable by name diseaseId of type UUID with protected access
								// specifier
	protected String name; // i declare a variable by name Name of type String with protected access
							// specifier

	/**
	 * @param diseaseId
	 * @param name
	 */

	public Disease2() {

	}

	public Disease2(UUID diseaseId) {
		this.diseaseId = diseaseId;
	}

	public Disease2(UUID diseaseId, String name) {
		this.diseaseId = diseaseId;
		this.name = name;
	}

	public Disease2(String name) {
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
		if (this == obj) {
			return true;
		}
		if (obj == null || getClass() != obj.getClass()) {
			return false;
		}
		Disease2 d = (Disease2) obj;

		if (diseaseId != null ? !diseaseId.equals(d.diseaseId) : d.diseaseId != null) {
			return false;
		}
		return name != null ? name.equals(d.name) : d.name == null;
	}

	@Override
	public String toString() {
		return "[ DiseaseId : " + this.diseaseId + " Name : ]" + this.name;
	}

	public static class InfectiousDisease extends Disease2 {

		public InfectiousDisease() {
			// TODO Auto-generated constructor stub
		}

		public InfectiousDisease(String name) {
			this.name = name;
		}

		public InfectiousDisease(UUID a) {
			this.diseaseId = a;
		}

		public InfectiousDisease(UUID a, String n) {
			this.name = n;
			this.diseaseId = a;
		}

		@Override
		public String[] getExamples() {
			return new String[] { "COVID-19", "Influenza", "Measles", "Tuberculosis" };
		}
	}

	public static class NonInfectiousDisease extends Disease2 {

		public NonInfectiousDisease() {
			// TODO Auto-generated constructor stub
		}

		public NonInfectiousDisease(String name) {
			this.name = name;
		}

		public NonInfectiousDisease(UUID a) {
			this.diseaseId = a;
		}

		public NonInfectiousDisease(UUID a, String n) {
			this.name = n;
			this.diseaseId = a;
		}

		@Override
		public String[] getExamples() {
			return new String[] { "Diabetes", "Heart disease", "Cancer", "Alzheimer's disease" };
		}
	}
}
