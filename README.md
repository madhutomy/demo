# demo
Spring boot application with gradle which accepts a string
</br>
curl -i \ -H "Accept: application/json" \ -H "Content-Type:application/json" \ -X POST --data  '{"phrase": "madhu"}' "http://localhost:9005/api/v1/reverse" </br>
curl -d "{\"phrase\":\"madhu\"}" -H "Content-Type: application/json"  http://localhost:9005/api/v1/reverse
