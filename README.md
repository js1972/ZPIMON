ZPIMON
========

*** WORK IN PROGRESS ***


pimon - an application for monitoring SAP NetWeaver PI-AEX (7.31).

Installation
------------
See releases for the entire SCA file which can be downloaded and deployed to your PI server using the NWDS Deployment perspective.
Once deployed you can access the app with the url:
        
        http://your_server:your_port/zpimonui/index.html.

First thing to do is go into the Settings dialog and enter the host server. This is just a pointer to the backend app (running on your PI seerver).
e.g.

        host server: http://pi.mycompany.com.au:58000.
        
If you want the link to your connected SAP systems SXMB_MONI transaction to also work, then fill in the ERP Server Client and Server details. e.g.

        030 and http://app-sap.mycompany.com.au:8002.

Second thing you need to do is to enter the credentials to your PI server as application properties in NetWeaver Administrator. Navigate to NWA -> Java System Properties with this link:

        http://app1poy.inpex.com.au:58000/webdynpro/resources/sap.com/tc~lm~itsam~ui~mainframe~wd/FloorPlanApp?applicationID=com.sap.itsam.cfg.java.systemproperties&applicationViewID=systemproperties
        
Select the applications tab and search for zpi_app. Enter the host_url (and port), username and password for the PI server. The user needs priveleges for PI monitoring.

Now you're ready to go and start monitoring.....


*Note: 
Typically there is a background job configured that automatically reads the PI messages. I'll provide details of how to set this up later. In the meantime you can manually trigger the read with the "update (lightning bolt)".*


Architecture
------------
Following the SAP Software Component / Development Component architecture, pimon is made up of the following DC's:
* zpi_dict : Java Dicionary project
* zpi_app  : Java EE application (contains the following modules)
* zpi_ejb  : EJB's providing the application logic and DB access
* zpi_web  : Jersey servlet and relevant helper classes to provide a REST api for the app
* zpi_html : The static client app using jQuery, Twitter Bootstrap, build version - concat and minimised
* zpi\_jersey_lib : The Jersey library is used for REST (https://jersey.java.net/)
* zpimon   : Software Component (container for all the above DC's)
 
If you wish to build the source and deploy the components individually, then you must deploy zpi\_dict first and then zpi_app which is made up of the ejb, web and html modules.

Contributing
------------
Contributions are very welcome. Pimon is light years ahead of SAP's standard toolset in usability and performance, but there is still allot to do to make this the best way to monitor your PI systems.

To setup NWDS for editing the source and contributing via Github there is a little bit of painful setup that needs to be done first. It all to do with SAP's antiquated NWDS and Development Component model. Maybe there are better ways, but the below seems to work:

1. Download the sca file from the GitHub releases page
2. Import the sca into NWDS. Switch the the Development Component perspective and right-click the LocalDevelopment folder and choose Import.
3. Create Eclipse projects. Right-click each Development Component and choose "Sync / Create Project"
4. Close NWDS
5. In Windows Explorer, navigate to the Development Component Workspace -> LocalDevelopment. If your NWDS Workspace is called "myworkspace", then the folder is myworkspace.jdi. Therefore the path would be /myworkspace.jdi/LocalDevelopment/. Rename the ZPIMON SC to something else
6. While still in /myworkspace.jdi/LocalDevelopment/ use git to clone this repo
7. Open NWDS again and manage your changes with git and send pull requests.


URL: http://&lt;host&gt;:&lt;port&gt;/zpimonui/index.html

Note: the zpi_html module contains the distribution files for the frontend web app. This will be hosted on GitHub soon with the build process. For now, it contains the minimised and concatenated sources.

Project Contributors
--------------------
Jason Scott (@js1972)
Chris Mills (@chrismills)
