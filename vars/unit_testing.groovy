def unit_testing()
{
  sh 'go version'
  sh 'go test -v -cover ./...'  
}
