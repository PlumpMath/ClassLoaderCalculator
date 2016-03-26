# ClassLoaderCalculator

Wildfly 10

Run server :

```bash
   ./standalone.sh
```
or

```bash
   %JBOSS_HOME%\bin\standalone.bat
```

Build and deploy :
```bash
   mvn clean install wildfly:deploy
```

Undeploy :
```bash
   mvn wildfly:undeploy
```

Redeploy :
```bash
   mvn wildfly:redeploy
```
