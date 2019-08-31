this example shows how to use self signed ssl certificate

use paid ssl ceritficate for production


command : 

        terminal>> :~$ 
        keytool -genkey -alias spring-https -storetype JKS -keyalg RSA -keysize 2048 -validity 365 -keystore javatechie.jks

        Enter keystore password:  
        What is your first and last name?
          [Unknown]:  mit 

        What is the name of your organizational unit?
          [Unknown]:  mit

        What is the name of your organization?
          [Unknown]:  mit

        What is the name of your City or Locality?
          [Unknown]:  mit

        What is the name of your State or Province?
          [Unknown]:  mit

        What is the two-letter country code for this unit?
          [Unknown]:  IN

        Is CN="\\mit", OU=mit, O=mit, L=mit, ST=mit, C=IN correct?
          [no]:  yes

        Enter key password for <spring-https>
          (RETURN if same as keystore password):  

        Re-enter new password: 

        Warning:
        The JKS keystore uses a proprietary format. 
        It is recommended to migrate to PKCS12 which is an industry standard format using 
        "keytool -importkeystore -srckeystore javatechie.jks -destkeystore javatechie.jks -deststoretype pkcs12".

        note : 
        keystore and alias password was "password" itself



check application.yml file

          server:
            ssl: 
              key-alias: spring-https
              key-store: classpath:javatechie.jks
              key-store-type: JKS
              key-password: password

            port: 7777
            
            
            
   jks file will be generated in home directory , paste in resources folder

