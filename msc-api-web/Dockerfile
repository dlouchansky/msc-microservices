FROM node:slim

RUN mkdir -p /usr/src/msc-api-web
WORKDIR /usr/src/msc-api-web

COPY . /usr/src/msc-api-web

CMD ["npm", "start"]


# If you EXPOSE a port, the service in the container is not accessible from
# outside Docker, but from inside other Docker containers.
# So this is good for inter-container communication.

# If you EXPOSE and -p a port, the service in the container is accessible
# from anywhere, even outside Docker.
