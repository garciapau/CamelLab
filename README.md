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

## How to use it
git clone https://github.com/garciapau/CamelLab.git

cd CamelLab

mvn hawtio:camel

It automatically starts the Hawtio UI to model, monitor, track... the workflows at http://localhost:8090/hawtio/
