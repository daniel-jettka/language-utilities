<%-- 
    Document   : index
    Created on : 28.07.2014, 12:59:16
    Author     : Daniel Jettka
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Language Utilities Webservices by HZSK</title>
    </head>
    <body>
        <h1>Language Utilities as Webservices by HZSK</h1>
        <h2>Retrieval of language names by their ISO codes (ISO-639-3)Hello World!</h2>
        <p>
            At https://corpora.uni-hamburg.de:8443/language-utilities/name many translations can be retrieved 
            by providing the GET parameters "iso-639-3" und "lang". 
            Currently, a considerable amount of language names can be found in:
        </p>
        <ul>
            <li>English (eng - 8127 language names)</li>
            <li>Chinese (zho - 1311 language names)</li>
            <li>Russian (rus - 1099 language names)</li>
            <li>French (fra - 861 language names)</li>
            <li>German (deu - 755 language names)</li>
            <li>Spanish (spa - 694 language names)</li>
            <li>Italian (ita - 181 language names)</li>
            <li>Portuguese (por - 181 language names)</li>
            <li>Catalan (cat - 181 language names)</li>
            <li>native language (native - 574 language names)</li>
        </ul>
        <p>
            For instance, if you want to get the name of the language Japanese (jpn) in Italian (ita) call 
            the webservice as follows:<code>https://corpora.uni-hamburg.de:8443/language-utilities/name?iso-639-3=jpn&lang=ita</code>
        </p>


    
    
    
    
    
    
    
    
    
    


    </body>
</html>
