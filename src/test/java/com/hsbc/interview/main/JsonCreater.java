package com.hsbc.interview.main;


import java.io.File;  
import java.io.IOException;  
import java.net.MalformedURLException;  
import java.net.URL;  
import org.jsonschema2pojo.DefaultGenerationConfig;  
import org.jsonschema2pojo.GenerationConfig;  
import org.jsonschema2pojo.Jackson2Annotator;  
import org.jsonschema2pojo.SchemaGenerator;  
import org.jsonschema2pojo.SchemaMapper;  
import org.jsonschema2pojo.SchemaStore;  
import org.jsonschema2pojo.SourceType;  
import org.jsonschema2pojo.rules.RuleFactory;  
import com.sun.codemodel.JCodeModel;  

public class JsonCreater {
	
	
	
	     /**  
	      * @param args  
	      */  
	     public static void main(String[] args) {  
	          String packageName="com.hsbc.interview.main";  
	          File inputJson= new File("/Users/MyApplications/sts_workspace/CitySearchClientApp/src/test/java/com/hsbc/interview/main/data.json");  
	          File outputPojoDirectory=new File("/Users/MyApplications/sts_workspace/CitySearchClientApp/src/test/java/convertedPojo");  
	          outputPojoDirectory.mkdirs();  
	          try {  
	               new JsonCreater().convert2JSON(inputJson.toURI().toURL(), outputPojoDirectory, packageName, inputJson.getName().replace(".json", ""));  
	          } catch (IOException e) {  
	               // TODO Auto-generated catch block  
	               System.out.println("Encountered issue while converting to pojo: "+e.getMessage());  
	               e.printStackTrace();  
	          }  
	     }  
	     public void convert2JSON(URL inputJson, File outputPojoDirectory, String packageName, String className) throws IOException{  
	          JCodeModel codeModel = new JCodeModel();  
	          URL source = inputJson;  
	          GenerationConfig config = new DefaultGenerationConfig() {  
	          @Override  
	          public boolean isGenerateBuilders() { // set config option by overriding method  
	              return true;  
	          }  
	          public SourceType getSourceType(){  
	      return SourceType.JSON;  
	    }  
	          };  
	          SchemaMapper mapper = new SchemaMapper(new RuleFactory(config, new Jackson2Annotator(config), new SchemaStore()), new SchemaGenerator());  
	          mapper.generate(codeModel, className, packageName, source);  
	          codeModel.build(outputPojoDirectory);  
	     }  
	}  


