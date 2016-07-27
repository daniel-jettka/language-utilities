/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package langUtils;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Path;
import javax.ws.rs.GET;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import org.codehaus.jettison.json.JSONException;
import org.codehaus.jettison.json.JSONObject;

/**
 * REST Web Service
 *
 * @author sesv009
 */
@Path("")
public class LanguageCodes {

    @Context
    private UriInfo context;
    private HttpServletRequest request;

    /**
     * Creates a new instance of LanguageCodes
     */
    public LanguageCodes() {
    }

    /**
     * Retrieves representation of an instance of langUtils.LanguageCodes
     * @return an instance of java.lang.String
     */
    @GET
    @Path("/name")
    @Produces("text/plain")
    public String getLanguageName(@QueryParam("iso-639-3") String code, @QueryParam("lang") String returnLang) 
            throws IOException, JSONException {
        byte[] encoded = Files.readAllBytes(Paths.get("/opt/tomcat7/webapps/language-utilities/WEB-INF/classes/langUtils/langCodes.json"));
        String jsonData = new String(encoded, "UTF-8");
        
        String languageName;
        
        //get language name from JSON data
        try{
            JSONObject json = new JSONObject(jsonData);        
            JSONObject lang = json.getJSONObject(code);

            returnLang = (returnLang == null) ? "eng"  : returnLang;
            languageName = lang.getString(returnLang);
            
            json = null;
            lang = null;
          
            return languageName;
        } catch(JSONException e){
            languageName = "";
        }
        
        encoded = null;
        jsonData = null;
        
        return languageName;
    }

}
