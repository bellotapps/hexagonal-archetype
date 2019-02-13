# Hexagonal Archetype [![GitHub license](https://img.shields.io/badge/license-Apache%20License%202.0-blue.svg?style=flat)](http://www.apache.org/licenses/LICENSE-2.0)

A Maven archetype that structures an application using the Hexagonal Architecture. 


## Getting Started

These instructions will install the archetype into your local machine

### Prerequisites

1. Clone the repository or download source code:

	```
	$ git clone https://github.com/juanmbellini/hexagonal-archetype.git
	```
	or
	
	```
	$ wget https://github.com/juanmbellini/hexagonal-archetype/archive/master.zip
	```

2. Install Maven

	#### Mac OS X
	```
	$ brew install maven
	```
	
	#### Ubuntu
	```
	$ sudo apt-get install maven
	```
	
	#### Other OSes
	Check https://maven.apache.org/install.html.
	

### Build

1. Change working directory to ```./hexagonal-archetype```

	```
	$ cd ./hexagonal-archetype
	```
	
2. Install the archetype

	```
	$ mvn clean install
	```

## Usage

1. Create a new project from a local archetype

	```
	$ mvn archetype:generate -DarchetypeCatalog=local
	```

2. Select the ```com.bellotapps.archetypes:hexagonal-archetype``` option.

3.	Follow the instructions, setting ```groupId```, ```artifactId```, ```version``` and  ```package```.


## License

Copyright 2019 BellotApps

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

   http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.

## Author

* [Juan Marcos Bellini](https://github.com/juanmbellini)