🚀 TP 16 : Supervision et Journalisation (Spring Boot + Prometheus + Grafana)
Ce projet démontre la mise en place d'une architecture d'observabilité complète pour une application Spring Boot.
🛠️ Stack Technique
Java / Spring Boot : Application principale.
Spring Actuator : Exposition des points de terminaison (endpoints) de santé et de métriques.
Prometheus : Base de données de séries chronologiques pour collecter les métriques.
Grafana : Outil de visualisation et de création de tableaux de bord.
include=health,info,prometheus
Use code with caution.
Lancer Prometheus : docker run -p 9090:9090 -v /path/to/prometheus.yml:/etc/prometheus/prometheus.yml prom/prometheus
3. Visualisation avec Grafana
Lancez Grafana : docker run -p 3000:3000 grafana/grafana
Accédez à http://localhost:3000 (admin/admin).
Ajoutez une Data Source : Type Prometheus, URL http://host.docker.internal:9090.
Importez un Dashboard Spring Boot (ex: ID 4701 ou 11378).
<img width="962" height="900" alt="Screenshot 2026-03-27 153712" src="https://github.com/user-attachments/assets/e88f55dd-7b07-4780-a006-b14f920ec8b4" />
<img width="1917" height="830" alt="Screenshot 2026-03-27 153723" src="https://github.com/user-attachments/assets/360bfb02-038a-4575-9e13-35820e826132" />
<img width="1919" height="995" alt="Screenshot 2026-03-27 153830" src="https://github.com/user-attachments/assets/90aee950-52d0-4d17-bbf6-796cc3573aa1" />
<img width="1899" height="621" alt="Screenshot 2026-03-27 154001" src="https://github.com/user-attachments/assets/fae8659a-d2f8-4ec6-8a56-bf82f9826f53" />
<img width="1552" height="1016" alt="Screenshot 2026-03-27 154053" src="https://github.com/user-attachments/assets/d64b3c07-c319-4f24-b422-c379b73297f0" />
<img width="1243" height="859" alt="Screenshot 2026-03-27 154102" src="https://github.com/user-attachments/assets/8e84f200-003e-4c9b-88f6-1caccf647969" />
