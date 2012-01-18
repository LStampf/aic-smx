For running this example it is necessary to install the following bundles (in addition 
to the core-bundles already shipped with servicemix):
 * camel-csv (features:install camel-csv/2.8.3)
 * camel-rmi (features:install camel-rmi/2.8.3)


This example consists of two bundles:
 * ESB Group A - RMI-Consumer based on DSL and blueprint -> aic.esb.a.rmi.rmiserver
 * ESB Group A - RMIServer -> aic.esb.a.csvrmi


Building instructions:
for both bundles
1) mvn install

2) copy the build target/[bundlename].jar into the servicemix-deploy-folder

3) start the RMIServer
   osgi:start bundle-number

4) start the RMI-Consumer
   osgi:start bundle-number

5) put input-files into the created "esb-example/input" folder

6) use 'log:display' to check the output


The main technology used is Apache Camel.

The "RMI-Consumer" bundle waits until a csv-file gets dropped in a specified directory (i.e. esb-examples/input). Afterwards, the file-contents are converted into corresponding java-objects (InvestmentForm) and for each object the remote method 'addInvestmentForm' is called.
The RMI-Consumer is based on blueprint and uses Java DSL, so instead of writing Camel Routes directly into the blueprint-file, the routes are specified in java-files (i.e. the package aic.esb.a.route).

The bundle RMIServer creates a remote-registry-entry, such that methods of the interface PrivateBankingService can be consumed using a remote-call. This bundle is based on Spring-OSGi.


Note:
I have tried using camel-bindy, which is another camel-bundle for dealing with csv-inputs. camel-bindy offers the possibility to annotate java-classes in a similar way than jaxb and the marshalling/unmarshalling between csv and java objects would be automated. But unfortunately, I wasn't able to get it to work in my blueprint based bundle. So I decided to use the more basic "camel-csv" for handling the csv-inputs. For converting a csv-row into a java-object a custom converter have to be provided.
In addition, there were some troubles with implementing the RMIServer in a blueprint-based bundle, therefore I provided a spring-osgi bundle.


