def call() {
    sh 'trivy fs --scanners vuln .'
}
