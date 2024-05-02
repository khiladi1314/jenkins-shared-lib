def bugs_analysis()
{
  sh "${scannerHome}/bin/sonar-scanner -X -Dsonar.projectKey=bug-analysis"
}
