def name = 'JDK_6'
def home = '/opt/java/jdk6'
jdk = new hudson.model.JDK(name, home);
jdklist = []
jdklist.add(jdk)
jenkins.model.Jenkins.instance.JDKs = jdk;
println "JDK settings updated!"