
/* Users Table */
CREATE TABLE users (
    user_id SERIAL PRIMARY KEY,
    user_name VARCHAR NOT NULL,
    user_date_birth TIMESTAMP,
    user_profile_picture VARCHAR(4000),
    user_telephone VARCHAR(128),
    user_email VARCHAR(128) NOT NULL UNIQUE,
    user_password BYTEA NOT NULL,
    create_dt TIMESTAMP,
    dt_begin TIMESTAMP,
    dt_update TIMESTAMP,
    dt_end TIMESTAMP
);

/* Notification Table */
CREATE TABLE notification (
    message_id SERIAL PRIMARY KEY,
    user_notificated_id INTEGER NOT NULL,
    notification_quantity INTEGER,
    dt_begin TIMESTAMP,
    dt_end TIMESTAMP,
    FOREIGN KEY (user_notificated_id) REFERENCES users (user_id)
);

/* Posts Table */
CREATE TABLE posts (
    post_id SERIAL PRIMARY KEY,
    user_id INTEGER,
    post_status VARCHAR,
    post_content VARCHAR(4000) NOT NULL,
    post_created_at TIMESTAMP,
    dt_begin TIMESTAMP,
    dt_update TIMESTAMP,
    dt_end TIMESTAMP,
    FOREIGN KEY (user_id) REFERENCES users (user_id)
);

/* Conversation Table*/
CREATE TABLE chats (
    chat_id SERIAL PRIMARY KEY,
    chat_sender_id INTEGER NOT NULL,
    chat_receiver_id INTEGER NOT NULL,
    chat_message_id INTEGER NOT NULL,
    chat_message VARCHAR(4000),
    dt_begin TIMESTAMP,
    dt_update TIMESTAMP,
    dt_end TIMESTAMP,
    FOREIGN KEY (chat_sender_id) REFERENCES users (user_id),
    FOREIGN KEY (chat_receiver_id) REFERENCES users (user_id),
    FOREIGN KEY (chat_message_id) REFERENCES notification (message_id)
);

/* Friends Table */
CREATE TABLE friends (
    user_id INTEGER,
    friend_id INTEGER NOT NULL,
    dt_begin TIMESTAMP,
    dt_end TIMESTAMP,
    PRIMARY KEY (user_id, friend_id),
    FOREIGN KEY (user_id) REFERENCES users (user_id),
    FOREIGN KEY (friend_id) REFERENCES users (user_id)
);


/* Rollback */
DROP TABLE users;
DROP TABLE posts;
DROP TABLE chats;
DROP TABLE user_friends;
DROP TABLE notification;
