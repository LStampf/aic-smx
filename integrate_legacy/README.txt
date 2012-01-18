ESB Group A example 2 - CALLING A LEGACY CORBA APPLICATION

This example takes CSV input files from a drop-directory and calls a CORBA service with the received and parsed data.

Prerequesites: Apache ServiceMix 4.4.0
	Installed features: camel-csv
		Use: features:install camel-csv/2.8.3
	JRE-Packages: com.sun.corba.se.impl.activation
		Add com.sun.corba.se.impl.activation to /service-mix/etc/jre.properties

		
Instructions:
1) mvn install

2) Start the legacy test application at.ac.tuwien.infosys.aic11.legacy.App (it binds a CORBA object with the name "Investment")

3) Copy the build (target/integrate_legacy-1.0-SNAPSHOT.jar) into the ServiceMix deploy directory

4) Check if the bundle has been started (osgi:list, osgi:start)

5) Put an example CSV file into the /service-mix/esb-example/input directory

6) Check via log:tail if the file has been processed

7) Check on the legacy application's console if the logger outputted the CORBA call receivement


Notes:

In the beginning I tried different CORBA connectors for Apache ServiceMix but found no suitable package. jbi4cobra was the most promising project, but it doesn't work on the newest version 4 of Apache ServiceMix. Therefore the current implementation runs by passing the CSV input data to a bean which is in fact a CORBA client which calls the object provided by the CORBA servant (the legacy app).

