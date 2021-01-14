usage of argThat :

        Library.DAO dao = mock(LibraryService.DAO.class);
        LibraryService service = new LibraryService(dao);

        service.hasBookWithId(42);

        //verify(dao).fetchBookById(anyInt());

        // instead of using anyInt, use argThat with lambda expression
        verify(dao).fetchBookById(argThat(argument -> argument.equals(42));

        //source : https://www.youtube.com/playlist?list=PLxbRjI3sr4mwDtHoQbM_xJmLLGTDSSScp
