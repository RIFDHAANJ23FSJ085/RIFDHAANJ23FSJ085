package edu.disease.asn1;

import java.util.UUID;
import java.time.LocalDateTime;

/**
 * 
 * @author Ahmed Rifdhan M.S
 * 
 */

public class Exposure {

	/*
	 * In Java, UUID stands for "Universally Unique Identifier." It's a 128-bit
	 * value used to uniquely identify information. UUIDs are often used to label
	 * and identify resources in a distributed computing environment, such as
	 * databases, distributed systems, and more. UUIDs are designed to be unique
	 * across time and space, which means that the likelihood of two randomly
	 * generated UUIDs colliding is extremely low.
	 */

	/*
	 * The UUID class in Java provides methods to generate and work with UUIDs. You
	 * can use it to create new UUIDs, parse existing UUID strings, and perform
	 * comparisons between UUIDs. Here's a brief overview of the methods and some
	 * examples of usage:
	 */

	private UUID patientID; // Creating UUIDs: UUID.randomUUID(): Generates a new random UUID.
	private LocalDateTime dateTime;
	private String exposureType;

	/**
	 * @param patientID
	 * @param dateTime
	 * @param exposureType
	 * 
	 */

	public Exposure() {

	}

	public Exposure(LocalDateTime lc, UUID patientId, String exposureType) {
		super();
		this.exposureType = exposureType;
		this.patientID = patientId;
		this.dateTime = lc;
	}

	/**
	 * @return the patientID
	 */

	public UUID getPatientId() {
		return patientID;
	}

	/**
	 * @return the dateTime
	 */
	public LocalDateTime getDateTime() {
		return dateTime;
	}

	/**
	 * @param dateTime the dateTime to set
	 */

	public void setDateTime(LocalDateTime dateTime) {
		this.dateTime = dateTime;
	}

	/**
	 * @return the exposureType
	 */
	public String getExposureType() {
		return exposureType;
	}

	/**
	 * @param exposureType the exposureType to set
	 */

	public void setExposureType(String exposureType) {

		if (exposureType.equals("D") || exposureType.equals("I")) { // D for Direct Exposure && I for Indirect Exposure
			this.exposureType = exposureType;

		} else {
			throw new IllegalArgumentException("Exposure type must be 'D' or 'I'");
		}
	}

	/*
	 * In this code snippet, we are overriding the hashCode() method from the Object
	 * class in the Exposure class. The hashCode() method is used to generate a hash
	 * code for an object, which is an integer value that's often used in hash-based
	 * data structures like hash maps or hash sets.
	 */

	/*
	 * The line return Objects.hash(patientID, dateTime); is using the
	 * Objects.hash() method to generate a hash code based on the patientID and
	 * dateTime properties of the Exposure object.
	 * 
	 * The Objects.hash() method takes a variable number of arguments (using
	 * varargs) and computes a hash code by combining the hash codes of those
	 * arguments.
	 * 
	 * It internally performs some calculations to ensure that the resulting hash
	 * code is uniformly distributed across the range of possible hash codes.
	 */

	@Override
	public int hashCode() {
		if (exposureType == null) {
			return patientID.hashCode();
		} else {
			return patientID.hashCode() + exposureType.hashCode();
		}
	}

	@Override
	public boolean equals(Object obj) {
		Exposure e = (Exposure) obj;
		if (this.patientID == null) {
			if (this.exposureType.hashCode() == e.exposureType.hashCode()) {
				return true;
			} else {
				return false;
			}
		} else {
			if (this.patientID.hashCode() == e.patientID.hashCode()
					&& this.exposureType.hashCode() == e.exposureType.hashCode()) {
				return true;
			} else {
				return false;
			}
		}
	}

	@Override
	public String toString() {
		return "PatientID: " + patientID + " DateTime: " + dateTime + " ExposureType: " + exposureType;
	}
}
