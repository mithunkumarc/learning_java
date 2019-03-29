#### mysqla and jpa

#### many to many


book : 

          id,   name
          '1', 'Book 1'
          '2', 'Book 2'


publisher

    id,   name
    '1', 'Publisher A'
    '2', 'Publisher B'


book_publisher

        book_id, publisher_id
        '1', '1'
        '2', '1'
        '1', '2'
        '2', '2'
