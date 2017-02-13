# CamelLab

## Lab Description
In this Lab I'm testing Apache Camel as a Content Orchestrator for handling the acquisition of new items. Key aspects to proof:
* Modeling and Implementation of Enterprise Integration Patterns
* Instances Tracking and Monitoring
* AWS integration
* How it helps to the Workflow development lifecycle (improvements velocity/TTM)

## Design
The workflow defined takes journals from an input folder in different file formats (XML, CSV), split those journals into articles to process each one (filter, enrich,etc) and the consolidates all the articles of the same journal into a single JSON file.
There are 2 routes:
* content.journal.acquisition
* content.journal.curation
that communicate through SQS in an asynchronous way.

## Tracking instances - Database Persistence
Improvement. Instead of keeping it in  memory, Camel stores the instances history into a non-embedded Apache Derby database.
More info at http://camel.apache.org/tracer-example.html

First install Derby and an instance at: jdbc:derby://localhost/C:/Workspace/Playground/CamelLab/target/derby
You can change that URI by opening the file C:\Workspace\Playground\CamelLab\src\main\resources\META-INF\persistence.xml

Then start Derby server:
<db-derby-home>\bin>NetworkServerControl start

To explode the content, SQuirreL (https://db.apache.org/derby/integrate/SQuirreL_Derby.html) can be easily configured as an SQL client.

## How to use it
git clone https://github.com/garciapau/CamelLab.git

cd CamelLab

mvn hawtio:camel

It automatically starts the Hawtio UI to model, monitor, track... the workflows at http://localhost:8090/hawtio/
