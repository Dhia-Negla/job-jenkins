
properties([
        buildDiscarder(logRotator(numToKeepStr: '10')),
        disableConcurrentBuilds(),
        parameters([
                string(defaultValue: 'WEBSHOPS', description: 'Apache config to compare ( , sep)', name: 'ServerGroups'),
                string(defaultValue: 'master', description: '', name: 'BranchTagName'),
        ])
])

node {
    git https://github.com/Dhia-Negla/job-jenkins
    def file = load 'job-jenkins/jobs/file.groovy'
    file.fct2()
}
