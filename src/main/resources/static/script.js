// script.js

document.addEventListener("DOMContentLoaded", function() {
  fetch('http://localhost:8080/exibir/12')
      .then(response => response.json())
      .then(data => {
          document.getElementById('tituloRussia').textContent = data.pais;
          document.getElementById('ParagrafoRussia').textContent = data.capital;
      })
      .catch(error => console.error('Erro ao buscar dados:', error));
});
