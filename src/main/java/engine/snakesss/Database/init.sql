CREATE TABLE `users` (
    `user_id` INT NOT NULL AUTO_INCREMENT ,
    `user_name` VARCHAR(75) NOT NULL UNIQUE ,
    `date_joined` DATE DEFAULT (CURRENT_DATE) ,
    PRIMARY KEY (`user_id`)
);

CREATE TABLE `games` (
    `game_id` INT NOT NULL AUTO_INCREMENT ,
    `game_name` VARCHAR(75) NOT NULL ,
    `creation_date` DATE DEFAULT (CURRENT_DATE) ,
    PRIMARY KEY (game_id)
);

CREATE TABLE users_games (
    user_id INT NOT NULL,
    game_id INT NOT NULL,
    PRIMARY KEY (user_id, game_id),
    FOREIGN KEY (user_id) REFERENCES users(user_id) ON DELETE CASCADE,
    FOREIGN KEY (game_id) REFERENCES games(game_id) ON DELETE CASCADE
);
