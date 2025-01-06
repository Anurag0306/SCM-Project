let currentTheme = getTheme();
setThemeOnPage(currentTheme);

document.querySelector("#change_theme_button").addEventListener("click", switchTheme);

function setThemeOnPage(theme) {
    document.documentElement.className = theme === "Dark" ? "dark" : ""; 
    document.querySelector("#change_theme_button span").textContent = 
        theme === "Light" ? "Dark" : "Light"; 
}

function switchTheme() {
    currentTheme = currentTheme === "Dark" ? "Light" : "Dark";
    setTheme(currentTheme);
    setThemeOnPage(currentTheme);
    console.log("Theme switched to:", currentTheme);
}

function setTheme(theme) {
    localStorage.setItem("theme", theme);
}

function getTheme() {
    return localStorage.getItem("theme") || "Light";
}
