# InduraSC
InduraSC is a terminal based network scanner and web scraper. It has been developed using Java and Maven. It is recommended to use it on Linux. It can be used in Windows but the banner won´t be shown as is it because is using figlet to generate the ascii art. It has also a bash script to execute it directly in the terminal, note that the JAR file has to be in the same directory as the bash script to run it properly.

InduraSC offers some functionalities to scan hosts on your network, scan ports, show IP´s and doing web scraping, it also offers the chance to generate passwords specifying the length of the password. This is a small preview of the main menu of InduraSC.

<img src="media/banner.png">

## Disclaimer

The InduraSC software is provided "as is", without warranty of any kind, express or implied, including but not limited to the warranties of merchantability, fitness for a particular purpose, and noninfringement. In no event shall the authors, copyright holders, or contributors be liable for any claim, damages, or other liability, whether in an action of contract, tort, or otherwise, arising from, out of, or in connection with the Software or the use or other dealings in the Software.

This Software is intended for educational and informational purposes only. It is the responsibility of the user to ensure their use of the Software complies with all applicable laws and regulations. The developer of this Software does not endorse or encourage any illegal use of the Software, nor will they be responsible for any such use by others.

By using the Software, you acknowledge and agree that you have read this disclaimer, understand it, and agree to be bound by its terms. The user assumes all responsibility and risk for the use of this Software. The developer disclaims all liability for any damage, direct or indirect, resulting from the use of the Software.

## Installation

To install InduraSC you need to have the JDK or JRE (minimum requirement) installed, you can easily install the JDK in this way:

- sudo apt install openjdk-21-jdk

Then you need to clone the repository or download the source code

- git clone https://github.com/UnknownArtistt/InduraSC

In the case of using Linux you need to give execution permissions to the bash script

- chmod +x induraSC.sh

Run it

On Linux:

- ./induraSC.sh

On Windows (being in the same directory as the JAR file):

- java -jar indura-1.0-SNAPSHOT.jar

