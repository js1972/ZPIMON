ZPIMONSC
========

*** WORK IN PROGRESS ***


pimon - an application for monitoring SAP NetWeaver PI-AEX.


Includes Development Components for:
* zpi_dict : Java Dicionary project
* zpi_app  : Java EE application (contains the following modules)
* zpi_ejb  : EJB's providing the application logic and DB access
* zpi_web  : Jersey servlet and relevant helper classes to provide a REST api for the app
* zpi_html : The static client app using jQuery, Twitter Bootstrap
 
zpi_dict needs to be deployed on it own and before zpi_app which is made up of the ejb, web and html modules.

URL: http://&lt;host&gt;:&lt;port&gt;/zpimonui/index.html

Note: the zpi_html module contains the distribution files for the frontend app. See https://github.com/js1972/pimon for the full repo.