
def buildMaven(){
   env.MAVEN_HOME=tool name: 'MAVEN_3.3.9', type: 'hudson.tasks.Maven$MavenInstallation'
   sh MAVEN_HOME+"/bin/mvn -DskipTests install"
}

def buildMavenTest(){
   env.MAVEN_HOME=tool name: 'MAVEN_3.3.9', type: 'hudson.tasks.Maven$MavenInstallation'
   sh MAVEN_HOME+"/bin/mvn compile test-compile"
}
