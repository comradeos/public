params = new URLSearchParams(window.location.search)
post = params.get('post') ? params.get('post') : 1;
post = parseInt(post);
limit = post + 10;

GOOGLE_SHEET_DATA = `https://sheets.googleapis.com/v4/spreadsheets/14kAxmAOnmcKzVrMXvDOj5UH9wotudkLg5BgBJZS2vIs/values/A${post}:B${limit}?alt=json&key=AIzaSyAGGbFDiCtylTz0CJuF0gmbtscp_LOsyYI`;

function file_get_contents(url) {
    let request = null;
    try { request = new XMLHttpRequest(); } catch (e) { }
    request.open("GET", url, false);
    request.send(null);
    return JSON.parse(request.responseText).values;
}

posts = file_get_contents(GOOGLE_SHEET_DATA);

try {
    for (let i = 0; i < posts.length; i++) {
        let item = posts[i];
        for (let key in item) {
            let value = item[key];
            document.write(value);
        }
        document.write("<hr>");
    }
} catch (error) {
    document.write("<h3>Тут зараз нема нічого, але може буде колись, так шо ти заходь час від часу...</h3><hr>");
}

document.write("<div class=\"posts\">");
document.write(`<a href="?post=${post - 10}">Сюди</a>`);
document.write(`<a href="?post=1">Останнє</a>`);
document.write(`<a href="?post=${post + 10}">Туди</a>`);
document.write("</div>");
