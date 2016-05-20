# should be executed on Vagrant ubuntu machine
# http://kubernetes.io/docs/getting-started-guides/ubuntu/

sudo mkdir /kube-sources
cd /kube-sources
sudo git clone https://github.com/kubernetes/kubernetes.git
cd kubernetes/

# set up component versions
export KUBE_VERSION=1.1.8
export FLANNEL_VERSION=0.5.0
export ETCD_VERSION=2.2.0

# edit cluster/ubuntu/config-default.sh

export nodes="root@192.168.50.4" # set up one node
export role="ai" # node is master and node
export NUM_NODES=${NUM_NODES:-1}

cd cluster/


# set up some auth things if you're logged in as root user
sudo -s
# http://containertutorials.com/get_started_kubernetes/index.html
ssh-keygen -t rsa
# Your public key has been saved in /root/.ssh/id_rsa.pub.
cat /root/.ssh/id_rsa.pub >> /root/.ssh/authorized_keys

# run
KUBERNETES_PROVIDER=ubuntu ./kube-up.sh
cd cluster/ubuntu
KUBERNETES_PROVIDER=ubuntu ./deployAddons.sh
