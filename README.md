<b>Build the Whole Project:</b>

        mvn clean install

![image](https://github.com/user-attachments/assets/c6999b9c-0dbb-4b8c-af0a-c489cfe663b8)


<b>Build a Specific Module:</b>

      mvn clean install -pl module-name -am
      
      -pl: Build this module
      -am: Also build its dependencies


<b>Ex:</b>

      mvn clean install -pl common-module -am

![image](https://github.com/user-attachments/assets/6229de23-8c16-40b7-8650-6baecabfd44f)
