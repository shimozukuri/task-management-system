insert into users (username, password)
values ('johndoe@gmail.com', '$2a$10$Xl0yhvzLIaJCDdKBS0Lld.ksK7c2Zytg/ZKFdtIYYQUv8rUfvCR4W'),
       ('mikesmith@yahoo.com', '$2a$10$fFLij9aYgaNCFPTL9WcA/uoCRukxnwf.vOQ8nrEEOskrCNmGsxY7m');

insert into tasks (title, description, author_id, executor_id, status, priority)
values ('Buy cheese', null, '1', '2', 'TODO', 'MEDIUM'),
       ('Do homework', 'Math, Physics, Literature', '1', '2', 'IN_PROGRESS', 'HIGH'),
       ('Clean rooms', null, '1', '2', 'DONE', 'LOW'),
       ('Call Mike', 'Ask about meeting', '1', '2', 'TODO', 'MEDIUM');

insert into comments (commentator_id, content, comment_date)
values (2, 'Which one?', '2024-11-15 12:00:00'),
       (1, 'Dorblu.', '2024-11-15 13:00:00'),
       (2, 'Can I do it tomorrow?', '2024-11-15 12:00:00'),
       (1, 'No!', '2024-11-15 12:00:00');

insert into users_roles (user_id, role)
values (1, 'ROLE_ADMIN'),
       (1, 'ROLE_USER'),
       (2, 'ROLE_USER');

insert into tasks_comments (task_id, comment_id)
values (1, 1),
       (1, 2),
       (2, 3),
       (2, 4)