def static_code_analysis()
{
  // installing 'golangci-lint' 
   sh 'curl -sSfL https://raw.githubusercontent.com/golangci/golangci-lint/master/install.sh | sh'
  // moving 'golangci-lint' to another directory
   sh 'mv ./bin/golangci-lint /var/lib/jenkins/workspace/bhavin/'
  //using 'golangci-lint' for static code analysis        
   sh '/var/lib/jenkins/workspace/bhavin/golangci-lint run'
}
