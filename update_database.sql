CREATE TABLE users (
	user_id BIGSERIAL primary key,
	user_name VARCHAR(140),
	user_profile_picture VARCHAR(4000),
	user_age INTEGER
);

INSERT INTO public.users (user_id, user_name, user_profile_picture, user_age)
VALUES
    (1, 'Josh Furigan', 'exemplo', 30),
    (2, 'Stan Pilots', 'exemplo', 28),
    (3, 'Mack Orange', 'exemplo', 20),
    (4, 'Mango Query', 'exemplo', 40),
    (5, 'Duff Pineapple', 'exemplo', 35);
