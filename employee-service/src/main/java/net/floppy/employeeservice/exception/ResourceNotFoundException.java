package net.floppy.employeeservice.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class ResourceNotFoundException extends RuntimeException{
   private String resource;
   private String fieldName;
   private Long field_value;

   public ResourceNotFoundException(String resource, String fieldName, Long field_value)
   {
       super(String.format("%s is Not found with %s : %s",resource,fieldName,field_value));
       this.fieldName = fieldName;
       this.resource = resource;
       this.field_value = field_value;
   }

}
