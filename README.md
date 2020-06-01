[![License](https://img.shields.io/badge/License-Apache%202.0-blue.svg)](https://www.apache.org/licenses/LICENSE-2.0)
![Java CD](https://github.com/infor-cloud/xtendm3-sdk-java/workflows/Java%20CD/badge.svg?event=push)
[![Maven Central](https://img.shields.io/maven-central/v/com.infor.m3/xtendm3-sdk.svg?label=Maven%20Central)](https://search.maven.org/search?q=g:%22com.infor.m3%22%20AND%20a:%22xtendm3-sdk%22)
# XtendM3 SDK

## Introduction
This SDK provides the interfaces for the internal APIs available to XtendM3 Extensions. This SDK can be used to build, 
test and debug Extensions locally without needing to have any M3 environment up and running.

## How to use

### Instructions
The SDK is a JAR file that can be used as a Maven dependencies in the Groovy Maven projects set up locally. Since this 
SDK is not publicly available yet, the Maven dependency cannot be resolved. To use this SDK ahead of the official 
release, you should build the project with the instructions below.

#### Building project

##### Prerequisites
- Git
- Groovy SDK version 2.5.6
- A terminal of choice Command Prompt, PowerShell, Cygwin or any *nix based terminal

##### Building SDK locally
To build the project locally
 
- Clone/Download the latest tag from the repository
- Go to the project directory using the terminal
- Build and install SDK to your local Maven repository
  - On *nix based terminals, run `./mvnw clean install`
  - On Windows based terminals, run `mvnw.cmd clean install`

You should now see the project compiling, building and being installed to your local Maven repository. You'll get a 
`BUILD SUCCESS` message in the end

### Using SDK
In your Groovy Maven project you should add a dependency similar to the following:

```xml
<dependency>
  <groupId>com.infor.m3</groupId>
  <artifactId>xtendm3-sdk</artifactId>
  <version>0.12.0</version>
</dependency>
```

Note that the version here is an example, you should check the latest version either from the official release or from 
package you have built locally 
