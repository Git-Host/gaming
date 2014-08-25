var properties = { harness:"live" };

// The playerhandle to use when launching a game.
// In Standalone mode: Value is N/A.
// In Live mode: Value is required to be a valid playerhandle.
properties.playerHandle = "{playerHandle}";

// The displayable name of the game. Appears on the loading screen.
// In Standalone mode: Value is required.
// In Live mode: Value is required.
properties.displayName = "{displayName}";

// The start game name of the game as defined in the DB.
// In Standalone mode: Value is required to match the game name defined in the profile xml.
// In Live mode: Value is required to be the start game name from the DB.
properties.gameName = "{gameName}";

// The game id of the game as defined in the DB.
// In Standalone mode: Value is N/A.
// In Live mode: Value is required to be the correct game id.
properties.gameId = "{gameId}";

// The domain of the server running a CGS instance.
// In Standalone mode: Value is N/A.
// In Live mode: Value defines which server to send messages to.
properties.domain = "{domain}";

// The protocol to use when connecting to the server.
// In Standalone mode: Value is N/A.
// In Live mode: Value is "http" or "https" depending on how the server set as "domain" is configured.
properties.protocol = "{protocol}";

// The 2-character language code to use when playing the game.
// In Standalone mode: Value is required.
// In Live mode: Value is required.
properties.lang = "{lang}";

// The 3-character account code to use.
// In Standalone mode: Value is only used for currency formatting purposes.
// In Live mode: Value is required and is used to access the funded account (as well as currency formatting).
properties.account = "{account}";

// Indicates if the game is a full-size (false) or mini (true) game client.
// In Standalone mode: Value specifies the mode to operate the framework in.
// In Live mode: Value specifies the mode to operate the framework in.
properties.mode = "{mode}";

// The base path to set for the framework.
// Leave the value blank if no base path is needed.
properties.base = "{base}";

// Additional data expected tp be returned by the data service
// Leave the value blank if no additional is data expected.
// In most cases, this value is not used.
properties.data = "{data}";

// A comma-delimited list of urls pointing to additional javascript files to insert on the page at runtime.
// Leave the value blank if no additional javascript files are used.
// In most cases, this value is not used.
properties.js = "{js}";

// URL to the external game file to be loaded.
// This is only relevant when build egi games.
// Leave the value blank if this is not an egi game.
properties.egiUrl = "{egiUrl}";

// External game id (vendor specific) of the game.
// This is only relevant when build egi games.
// Leave the value blank if this is not an egi game.
properties.egiExtGameId = "{egiExtGameId}";