ZPIMON
========

*** WORK IN PROGRESS ***


pimon - an application for monitoring SAP NetWeaver PI-AEX (7.31).


See releases for the entire SCA file which can be downloaded and deployed to your PI server using the NWDS Deployment perspective.
Once deployed you can access the app with the url: http://your_server:your_port/zpimonui/index.html.

First thing to do is go into the Settings dialog and enter the host server. This is just a pointer to the backend app (running on your PI seerver).
e.g. host server: http://pi.mycompany.com.au:58000.
If you want the link to your connected SAP systems SXMB_MONI transaction to also work, then fill in the ERP Server Client and Server details. e.g. 030 and http://app-sap.mycompany.com.au:8002.

Second thing you need to do is to enter the credentials to your PI server as application properties in NetWeaver Administrator. Navigate to NWA -> Java System Properties with this link: 
http://app1poy.inpex.com.au:58000/webdynpro/resources/sap.com/tc~lm~itsam~ui~mainframe~wd/FloorPlanApp?applicationID=com.sap.itsam.cfg.java.systemproperties&applicationViewID=systemproperties
Select the applications tab and search for zpi_app. Enter the host_url (and port), username and password for the PI server. The user need priveleges for PI monitoring.

Now you're ready to go and start monitoring.....


Note: 
Typically there is a background job that needs some slight config to start - details for this is still to come.
For now - just click the "update (lightning bolt)" button whcih triggers a read of your PI messages into the cache and will allow you to see them in the app.


Includes Development Components for:
* zpi_dict : Java Dicionary project
* zpi_app  : Java EE application (contains the following modules)
* zpi_ejb  : EJB's providing the application logic and DB access
* zpi_web  : Jersey servlet and relevant helper classes to provide a REST api for the app
* zpi_html : The static client app using jQuery, Twitter Bootstrap
 
zpi_dict needs to be deployed on it own and before zpi_app which is made up of the ejb, web and html modules.

URL: http://&lt;host&gt;:&lt;port&gt;/zpimonui/index.html

Note: the zpi_html module contains the distribution files for the frontend app.