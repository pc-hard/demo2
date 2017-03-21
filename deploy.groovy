scp /var/lib/jenkins/jobs/Demo2/jobs/deploy/workspace/hello.py user@172.31.119.21:/var/lib/jenkins
ssh -i /var/lib/jenkins/.ssh/id_rsa user@172.31.119.21 'sudo service uwsgi restart'
