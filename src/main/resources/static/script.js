
        const data = {
      "pais": "Russia",
    "capital": "Moscou"
        };

        const contentDiv = document.getElementById('content');

        const titleElement = document.createElement('h1');
        titleElement.textContent = data.title;

        const contentElement = document.createElement('p');
        contentElement.textContent = data.content;

        contentDiv.appendChild(titleElement);
        contentDiv.appendChild(contentElement);

