mvn clean package
docker build -t dlouchansky/msc-invoices .
docker push dlouchansky/msc-invoices
kubectl delete po msc-invoices-pod
kubectl create -f msc-invoices-pod.yaml
