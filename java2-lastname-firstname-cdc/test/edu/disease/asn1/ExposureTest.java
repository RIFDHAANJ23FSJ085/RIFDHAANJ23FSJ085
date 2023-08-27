package edu.disease.asn1;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.time.LocalDateTime;
import java.util.UUID;

import org.junit.jupiter.api.Test;

class ExposureTest {
	
	@Test
	public void testSamePatientId() {
		UUID u1=UUID.randomUUID();
		UUID u2=UUID.randomUUID();
		
		Exposure e1=new Exposure(null,u1,null);
		Exposure e2=new Exposure(null,u2,null);
		System.out.println(e1.hashCode());
		System.out.println(e2.hashCode());
		
		boolean result=e1.equals(e2);
		assertFalse(result);
	}
	
	@Test
	public void testExposureTypeNotSame() {
		Exposure e1=new Exposure(null,null,"Direct Exposure");
		Exposure e2=new Exposure(null,null,"InDirect Exposure");
		
		boolean result=e1.equals(e2);
		assertFalse(result);
	}
	
	@Test
	public void testExposureTypeSame() {
		Exposure e1=new Exposure(null,null,"Direct Exposure");
		Exposure e2=new Exposure(null,null,"Direct Exposure");
		
		boolean result=e1.equals(e2);
		assertTrue(result);
	}
	@Test
	public void testPatientIdandExposureType() {
		UUID u1=UUID.randomUUID();
		UUID u2=UUID.randomUUID();
		
		Exposure e1=new Exposure(null,u1,"InDirect Exposure");
		Exposure e2=new Exposure(null,u2,"Direct Exposure");
		System.out.println(e1.hashCode());
		System.out.println(e2.hashCode());
		
		boolean result=e1.equals(e2);
		assertFalse(result);
	}
	 @Test
	    public void testHashCodeWithExposureType() {
	        UUID patientId = UUID.randomUUID();
	        LocalDateTime dateTime = LocalDateTime.now();
	        String exposureType = "Direct Exposure";

	        Exposure e = new Exposure(null,patientId, exposureType);
	        e.setDateTime(dateTime);

	        int expectedHashCode = patientId.hashCode() + exposureType.hashCode();
	        int actualHashCode = e.hashCode();

	        assertEquals(expectedHashCode, actualHashCode);
	    }
	 
	 @Test
	    public void testHashCodeWithoutExposureType() {
	        UUID patientId = UUID.randomUUID();
	        LocalDateTime dateTime = LocalDateTime.now();

	        Exposure e = new Exposure(null,patientId,null);
	        e.setDateTime(dateTime);

	        int expectedHashCode = patientId.hashCode();
	        int actualHashCode = e.hashCode();

	        assertEquals(expectedHashCode, actualHashCode);
	    }
	 @Test
	    public void testToString() {
	        UUID patientId = UUID.randomUUID();
	        LocalDateTime dateTime = LocalDateTime.of(2023, 8, 20, 15, 30);
	        String exposureType = "Direct Exposure";

	        Exposure e = new Exposure(null,patientId, exposureType);
	        e.setDateTime(dateTime);

	        String expectedToString = "PatientID: " + patientId + " DateTime: 2023-08-20T15:30 ExposureType: Direct Exposure";
	        String actualToString = e.toString();

	        assertEquals(expectedToString, actualToString);
	    }
	 
	 @Test
	    public void testSetExposureTypeValid() {
	        Exposure e = new Exposure();
	        e.setExposureType("I");

	        assertEquals("I", e.getExposureType());
	    }

	    @Test
	    public void testSetExposureTypeInvalid() {
	        Exposure e = new Exposure(null,null,"Direct Exposure");

	        assertThrows(IllegalArgumentException.class, () -> { e.setExposureType("X");});}
	    
	    @Test
	    public void testGetPatientId() {
	        UUID patientId = UUID.randomUUID();
	        Exposure e = new Exposure(null,patientId,null);

	        assertEquals(patientId, e.getPatientId());
	    }

	    @Test
	    public void testGetDateTime() {
	        LocalDateTime dateTime = LocalDateTime.now();
	        Exposure e = new Exposure(null,null,"Direct Exposure");
	        e.setDateTime(dateTime);

	        assertEquals(dateTime, e.getDateTime());
	    }
	    
	    @Test
	    public void testEqualsWithNullPatientId() {
	        Exposure e1 = new Exposure(null,null,"Direct Exposure");
	        Exposure e2 = new Exposure(null,null,"Direct Exposure");

	        boolean result = e1.equals(e2);

	        assertTrue(result);
	    }

	    @Test
	    public void testEqualsWithSamePatientIdAndExposureType() {
	        UUID patientId = UUID.randomUUID();
	        Exposure e1 = new Exposure(null,patientId, "Direct Exposure");
	        Exposure e2 = new Exposure(null,patientId, "Direct Exposure");

	        boolean result = e1.equals(e2);

	        assertTrue(result);
	    }

	    @Test
	    public void testEqualsWithDifferentExposureType() {
	        UUID patientId = UUID.randomUUID();
	        Exposure e1 = new Exposure(null,patientId, "Direct Exposure");
	        Exposure e2 = new Exposure(null,patientId, "InDirect Exposure");

	        boolean result = e1.equals(e2);

	        assertFalse(result);
	    }

	    @Test
	    public void testEqualsWithDifferentPatientIdAndExposureType() {
	        UUID patientId1 = UUID.randomUUID();
	        UUID patientId2 = UUID.randomUUID();
	        Exposure e1 = new Exposure(null,patientId1, "Direct Exposure");
	        Exposure e2 = new Exposure(null,patientId2, "InDirect Exposure");

	        boolean result = e1.equals(e2);

	        assertFalse(result);
	    }
	    
	    @Test
	    void testExposureConstructor() {
	        // Arrange

	        // Act
	        Exposure exposure = new Exposure();

	        // Assert
	        assertNotNull(exposure);
	    }
	    
	    @Test
	    void testExposureConstructorWithParameters() {
	        // Arrange
	        String exposureType = "D";
	        LocalDateTime dateTime = LocalDateTime.now();

	        // Act
	        Exposure exposure = new Exposure(dateTime,null,exposureType);

	        // Assert
	        assertNotNull(exposure);
	        assertEquals(exposureType, exposure.getExposureType());
	        assertEquals(dateTime, exposure.getDateTime());
	    }
	    
	    @Test
	    void testExposureConstructor3() {
	        // Arrange
	        LocalDateTime lc = LocalDateTime.of(2023, 8, 19, 12, 0); // Example date and time
	        UUID patientId = UUID.randomUUID();
	        String exposureType = "COVID-19";

	        // Act
	        Exposure exposure = new Exposure(lc, patientId, exposureType);

	        // Assert
	        assertEquals(exposureType, exposure.getExposureType());
	        assertEquals(patientId, exposure.getPatientId());
	        assertEquals(lc, exposure.getDateTime());
	    }

}
