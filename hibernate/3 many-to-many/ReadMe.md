
#### many to many

project dependencies

           mysqla and jpa



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



#### Trasactional

              @Transactional
               public void addTournamentsAndPlayers() {

                   Tournament t1 = new Tournament();
                   t1.setName("Wimbledon");
                   Tournament t2 = new Tournament();
                   t2.setName("Roland Garros");

                   Player p1 = new Player();
                   p1.setName("Roger Federer");
                   Player p2 = new Player();
                   p2.setName("Rafael Nadal");
                   Player p3 = new Player();
                   p3.setName("David Ferer");

                   t1.addPlayer(p1);
                   t1.addPlayer(p2);
                   t2.addPlayer(p1);
                   t2.addPlayer(p2);
                   t2.addPlayer(p3);

                   tournamentRepository.save(t1);
                   tournamentRepository.save(t2);
           }



#### Transactional : considering more than one transaction as one

> by default jparepository handles transaction for individual crud operation
  for multiple transaction/crud use @Transactional to consider multiple crud as one operation
           

           below example stores book items to database along with publisher
           two individual save info considered as one.



                        //important : transactional
                          @Transactional
                          @Override
                          public void run(String...args) {
                              // Create a couple of Book and Publisher
                                 var publisher_a = new Publisher("Publisher A");
                                 var publisher_b = new Publisher("Publisher B");
                                 var book1 = new Book("Book 1", publisher_a , publisher_b);           
           

                                 //first save
                                 bookRepository.save(book1);

                                 // dont reuse publisher_a and publisher_b , 
                                 // they have detached now, (dont remembered by hibernate)
                                 //get data from database                                 
                                 var get_pub_a = publisherRepository.getOne(1);//add new book for existing publisher 
                                 var get_pub_b = publisherRepository.getOne(2);
                                 System.out.println(get_pub_a.getName());
                                 System.out.println(get_pub_b.getName());
                                 var book2 = new Book("Book 2", get_pub_a , get_pub_b);

                                 bookRepository.save(book2);
                      }
