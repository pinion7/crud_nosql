#!/bin/bash
set -e

mongo <<EOF
use $MONGO_INITDB_DATABASE
db.createUser({
  user:  '$MONGO_INITDB_ROOT_USERNAME',
  pwd: '$MONGO_INITDB_ROOT_PASSWORD',
  roles: [{
    role: 'readWrite',
    db: '$MONGO_INITDB_DATABASE'
  }]
})
EOF

#mongosh <<EOF
#var config = {
#    "_id": "dbrs",
#    "version": 1,
#    "members": [
#        {
#            "_id": 1,
#            "host": "mongo1:27017",
#            "priority": 2
#        },
#        {
#            "_id": 2,
#            "host": "mongo2:27017",
#            "priority": 1
#        },
#        {
#            "_id": 3,
#            "host": "mongo3:27017",
#            "priority": 1
#        }
#    ]
#};
#rs.initiate(config, { force: true });
#EOF

