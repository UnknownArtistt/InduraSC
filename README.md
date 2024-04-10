# InduraSC
InduraSC is a terminal based network scanner and web scraper. It has been developed using Java and Maven. It is recommended to use it on Linux. It can be used in Windows but the banner won´t be shown as is it because is using figlet to generate the ascii art. It has also a bash script to execute it directly in the terminal, note that the JAR file has to be in the same directory as the bash script to run it properly.

InduraSC offers some functionalities to scan hosts on your network, scan ports, show IP´s and doing web scraping, it also offers the chance to generate passwords specifying the length of the password. This is a small preview of the main menu of InduraSC.

<img src="media/banner.png">

## Installation

To install InduraSC you need to have the JDK or JRE (minimum requirement) installed, you can easily install the JDK in this way:

- sudo apt install openjdk-21-jdk

Then you need to clone the repository or download the source code

- git clone https://github.com/Julen-H/InduraSC

In the case of using Linux you need to give execution permissions to the bash script

- chmod +x induraSC.sh

Run it

On Linux:

- ./induraSC.sh

On Windows (being in the same directory as the JAR file):

- java -jar indura-1.0-SNAPSHOT.jar

