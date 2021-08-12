Aqui está o código utilizado para aula de microserviços, com alguns apontamentos e atualizações.

Inicialmente com entradas estáticas e depois com algumas portas dinâmicas.

OBS1: Nunca coloque no pom.xml uma dependência OATH que não configurou, se não arruinara seu roteador zuul como ocorreu em um certo momento.
OBS2: Use a versão Hoxton.SR9 pelo menos (Não a que estava na aula que era a 8), pois parece que o zuul e o Eureka funcionam com um release do Spring 2.3.X próximo
