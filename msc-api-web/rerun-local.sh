docker stop msc-api-web
docker rm msc-api-web
docker build -t dlouchansky/msc-api-web .
docker run -p 8008:8008 --env-file ./local.env --name msc-api-web -d dlouchansky/msc-api-web
