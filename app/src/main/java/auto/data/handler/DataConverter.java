package auto.data.handler;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.List;

import auto.data.model.ScrapedDataHolder;
import auto.data.model.VehicleRawData;

public class DataConverter {
	public static VehicleRawData convertdataHolderListToVehicle(List<ScrapedDataHolder> dataHolderList)  {
		VehicleRawData vehicle = new VehicleRawData();
		for (Iterator<ScrapedDataHolder> iterator = dataHolderList.iterator(); iterator.hasNext();) {
			ScrapedDataHolder informationText = (ScrapedDataHolder) iterator.next();
			transformFieldValue(vehicle,informationText.getName(), informationText.getValue());
		}
		return vehicle;
		
		

	}
	
	
	
	private static void transformFieldValue(Object obj, String fieldName, Object value)  {
			Class<?> clazz = obj.getClass();
			Method method;
			try {
				if(methodExists(clazz,"transform"+fieldName, String.class)) {
					method = clazz.getMethod("transform"+fieldName, String.class);
					method.invoke(obj,value);
				}else {
					Field field = clazz.getDeclaredField(fieldName); // Get the field by name
					field.setAccessible(true); // Allow access to private fields
					field.set(obj, value);
				}
			} catch (NoSuchMethodException | SecurityException | IllegalAccessException | InvocationTargetException
					| NoSuchFieldException | IllegalArgumentException e) {
				System.err.println("Encountered following error during data processing : " + fieldName+ ":" + value + ":" + e.getClass()+ ":" + e.getMessage());
			}
			
			
			
			
	}
	
	public static boolean methodExists(Class<?> clazz, String methodName, Class<?>... paramTypes) {
        try {
            clazz.getMethod(methodName, paramTypes); // Checks only public methods
            return true;
        } catch (NoSuchMethodException e) {
            return false;
        }
    }

}
