#!/bin/bash

docker-compose up -d

sleep 5

docker exec -it mongo1 /scripts/rs-init.sh

docker exec -it mongo1 /setup/mongo-setup_init.sh