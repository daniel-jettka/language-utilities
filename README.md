# language-utilities
Webservices for language names &amp; ISO codes

After building and deploying this project, the REST webservice at "/language-utilties/name" can be used to retrieve many translations of language names by providing the GET parameters "iso-639-3" und "lang". 
Currently, a considerable amount of language names can be found in:

English ("eng" - 8127 language names)<br/> 
Chinese ("zho" - 1311 language names)<br/>
Russian ("rus" - 1099 language names)<br/>
French ("fra" - 861 language names)<br/>
German ("deu" - 776 language names)<br/>
Spanish ("spa" - 694 language names)<br/>
Italian ("ita" - 181 language names)<br/>
Portuguese ("por" - 181 language names)<br/>
Catalan ("cat" - 181 language names)<br/>
native language names ("native" - 574 language names)

For instance, if you want to get the name of the language Japanese (jpn) in Italian (ita) call the webservice as follows: http://example.com/language-utilities/name?iso-639-3=jpn&lang=ita

It is also possible to test the webservice currently running on HZSK server by accessing URL formatted in a following way:

https://corpora.uni-hamburg.de/apps/language-utilities/name?iso-639-3=jpn&lang=ita
