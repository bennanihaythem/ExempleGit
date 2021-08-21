pipeline
{
    agent any
    stages {
        stage("Git")
        {
            steps{
              git "https://github.com/bennanihaythem/ExempleGit.git"  
            }
           
        }
        stage("compile")
        {
            steps{
                sh "mvn clean compile"
            }
        }
        stage("test")
        {
            steps{
                sh "mvn test"
            }
        }
        stage("install")
        {
            steps{
                sh "mvn clean install package"
            }
        }
        stage("Build docker")
        {
            steps{
                sh "docker build -f Dockerfile -t exemple-git ."
            }
        }
        stage("run docker")
        {
            steps{
                sh "docker run -p 8088:8088 -d exemple-git"
            }
            post{
                success{
                    archiveArtifacts "target/*.war"
                }
            }
           
        }
       
    }
   
}