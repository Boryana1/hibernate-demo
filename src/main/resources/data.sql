insert into Location(id, name) values(1, 'Budapest, Hungary');
insert into Location(id, name) values(2, 'Owerri, Nigeria');
insert into Location(id, name) values(3, 'Califonia, USA');

insert into CLIENT(id, firstname, lastname, email, location_id) values(1, 'Kindson', 'Munonye', 'kany@gmail.com', 1);
insert into CLIENT(id, firstname, lastname, email, location_id) values(2, 'Jeffrey', 'Yuba', 'yuba@gmail.com', 2);
insert into CLIENT(id, firstname, lastname, email, location_id) values(3, 'Solace', 'Okeke', 'solace@gmail.com', 3);

insert into Post(id, post_date, details, user_id) values(1, CURRENT_TIMESTAMP(), 'Very good post', 1);
insert into Post(id, post_date, details, user_id) values(2, CURRENT_TIMESTAMP(), 'A rainy day', 2);
insert into Post(id, post_date, details, user_id) values(3, CURRENT_TIMESTAMP(), 'nice tutorials', 3);