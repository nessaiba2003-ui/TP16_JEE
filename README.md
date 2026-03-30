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
<img width="882" height="731" alt="Screenshot 2026-03-29 000951" src="https://github.com/user-attachments/assets/9db4a356-a35e-4f84-8624-2afad80a7953" />
<img width="1872" height="781" alt="Screenshot 2026-03-29 001534" src="https://github.com/user-attachments/assets/8479e783-cbdb-48a1-962f-41c071137089" />
<img width="1913" height="810" alt="Screenshot 2026-03-29 001609" src="https://github.com/user-attachments/assets/a3c44ba7-01e1-4dc1-a954-ad0789c33a0a" />
<img width="1919" height="797" alt="Screenshot 2026-03-29 001731" src="https://github.com/user-attachments/assets/87a59fe8-def6-442e-bc58-792ae981c1a4" />
<img width="1919" height="956" alt="Screenshot 2026-03-29 002056" src="https://github.com/user-attachments/assets/e034b499-66e8-44db-965b-e9df435b73ba" />
<img width="1895" height="561" alt="Screenshot 2026-03-29 002420" src="https://github.com/user-attachments/assets/788b3c87-178f-4732-93cb-d26401a358c4" />
<img width="1919" height="565" alt="Screenshot 2026-03-29 002727" src="https://github.com/user-attachments/assets/85458cb4-4a8e-4383-85f3-a0a94e37545e" />
<img width="1919" height="948" alt="Screenshot 2026-03-29 171902" src="https://github.com/user-attachments/assets/a6ebe32a-0c87-411f-a200-6d4edf00d68c" />
<img width="1918" height="935" alt="Screenshot 2026-03-29 172020" src="https://github.com/user-attachments/assets/401d08fa-c5db-4569-8ec6-5d9361867ff4" />
<img width="1919" height="945" alt="Screenshot 2026-03-29 172108" src="https://github.com/user-attachments/assets/81c33937-b152-4293-b405-85bde0337eab" />
<img width="1916" height="865" alt="Screenshot 2026-03-29 172208" src="https://github.com/user-attachments/assets/7625e48b-4465-4600-91e7-092ddde7c072" />
<img width="1919" height="943" alt="Screenshot 2026-03-29 172259" src="https://github.com/user-attachments/assets/a782ced8-e5fe-42cc-96c6-44563b915716" />
<img width="1919" height="954" alt="Screenshot 2026-03-29 173037" src="https://github.com/user-attachments/assets/ff9eba82-f705-457a-b069-4e5dfb51a938" />
<img width="1919" height="716" alt="Screenshot 2026-03-29 173243" src="https://github.com/user-attachments/assets/dedd3521-7f95-483f-9539-6317067831b8" />
<img width="1919" height="866" alt="Screenshot 2026-03-29 173317" src="https://github.com/user-attachments/assets/c9c15b0b-8fb3-44ca-a917-0c11e1cab7cf" />
<img width="1919" height="850" alt="Screenshot 2026-03-29 173458" src="https://github.com/user-attachments/assets/9998f085-884f-4ec4-bcb6-8547da0c4a2f" />
![WhatsApp Image 2026-03-30 at 08 57 10](https://github.com/user-attachments/assets/01b5c233-f412-44a3-95d7-47da5d4f014f)
![WhatsApp Image 2026-03-30 at 08 57 28](https://github.com/user-attachments/assets/c85c6905-0d8b-4c2c-a306-db3b990ab7c0)
![WhatsApp Image 2026-03-30 at 08 57 48](https://github.com/user-attachments/assets/d9c141a0-c881-4b55-bf1e-75ac2cf39483)
![WhatsApp Image 2026-03-30 at 08 58 00](https://github.com/user-attachments/assets/1fa65989-27e0-4539-b150-1c43cb91d81c)
