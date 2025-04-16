// URL for the request
let url = 'https://jsonplaceholder.typicode.com/todos/1';

// Making our request
fetch(url, { method: 'GET' })
    .then(response => response.json())  // Changed variable name to response
    .then(data => {
        // Printing our response
        console.log(data);

        // Printing the field of our response
        console.log(`Title of our response: ${data.title}`); // Fixed template literal
    })
    .catch(error => { console.log(error); });  // Changed variable name to error
