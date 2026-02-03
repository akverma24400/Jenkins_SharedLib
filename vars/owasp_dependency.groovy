def call() {
  dependencyCheck(
    additionalArguments: '''
      --scan ./
      --format XML
      --out dependency-check-report
      --noupdate
      --disableAssembly
      --failOnCVSS 11
    ''',
    odcInstallation: 'OWASP'
  )

  dependencyCheckPublisher(
    pattern: '**/dependency-check-report.xml'
  )
}
