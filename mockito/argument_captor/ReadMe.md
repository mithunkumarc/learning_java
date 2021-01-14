argument captor : helpful in verifying whether method is called with specific arguments

#### verify/assert argument values

        final LibraryService service = mock(LibraryService.class);
        final ArgumentCaptor<Integer> captor = ArgumentCaptor.forClass(Integer.class);

        service.hasBookWithId(42);    //value 42 tobe verified

        verify(service).hasBookWithId(captor.capture());  // first check whether hasBookWithId() called or not. capture argument
        assertThat(captor.getValue(), is(equalTo(42));    // next check arugment match with 42 using argument captor

        // source : https://www.youtube.com/playlist?list=PLxbRjI3sr4mwDtHoQbM_xJmLLGTDSSScp
