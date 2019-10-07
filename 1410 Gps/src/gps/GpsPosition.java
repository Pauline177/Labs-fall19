
package gps;

/**
 * @author paulinemakoma
 * assignment A03
 */

public class GpsPosition {
	
	
	private Double latitude, longitude, elevation;
	
/**
 * GpsPosition - creates an instance of the GpsPosition object with 3 parameters passed by the calling
 * @param lat double value to initialize latitude
 * @param lon double value to initialize longitude
 * @param ele double value to initialize elevation
 * 
 * @throws IllegalArgumentException - checks for out of range inputs from calling methods
 */
	public GpsPosition(double lat,double lon,double ele) {
		
		   if (lat < -90 || lat > 90 || lon < -180 || lon > 180){
	            throw new IllegalArgumentException("Invalid Latitude and/or Longitude");
	        }else if (ele < 0){
	            throw new IllegalArgumentException("Invalid Elevation");
	        }else {
	            this.latitude = lat;
	            this.longitude = lon;
	            this.elevation = ele;
	        }
	    
		
	}
	
	
	public Double getLatitude(){
		
		return latitude;
	}
	
	public Double getLongitude(){
		
		return longitude;
	}

	public Double getElevation(){
		
		return elevation;
	}
	
	@Override
	public String toString() {
		
		return String.format("%.6f, %.6f (%.1f)", latitude, longitude, elevation);
	}
	
	
	
}
