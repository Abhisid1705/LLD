Consistent Hashing is an algorithm which helps in efficient redistribution of keys in case a new server is added
or a faulty server is removed .
This makes it an efficient approach for load balancing in distributed systems .

In this package we will design a consistent hashing algorithm

LLD -Consistent hashing

Components -Node ,Requests
Node ->virtual ,physical
Requests->{
id:
ip:
user_id:
}
physical_node {
id :
weight://total virtual nodes
capacity: ram ..etc
status: 'active' || 'inactive'
}
virtual_node {
id :
PhysicalNode:
}

