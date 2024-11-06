@extends('master.master');

@section('content')
<section class="bg-gray-50 dark:bg-gray-900">
    <div class="flex flex-col items-center justify-center px-6 py-8 mx-auto md:h-screen lg:py-0">
        <a href="#" class="flex items-center mb-6 text-2xl font-semibold text-gray-900 dark:text-white">
            <img class="w-8 h-8 mr-2" src="https://flowbite.s3.amazonaws.com/blocks/marketing-ui/logo.svg" alt="logo">
            To Do App    
        </a>
        <div class="mb-4">
            <form class="flex mt-4" action={{ route('todo_add') }} method="POST">
                @csrf
                <input class="shadow appearance-none border rounded w-full py-2 px-3 mr-4 text-grey-darker" placeholder="Add Todo" name="todo">
                <button class="flex-no-shrink p-1 ml-2 mr-2 border-2 rounded text-white bg-primary-600 hover:bg-primary-700 focus:ring-4 focus:outline-none focus:ring-primary-300 font-medium rounded-lg text-sm px-2.5 py-2.5 text-center dark:bg-primary-600 dark:hover:bg-primary-700 dark:focus:ring-primary-800">Add</button>
            </form>
        </div>
        <div class="items-center justify-center text-center">
            <p class="w-full py-2 px-3 mr-4 text-sm font-medium">Hello {{ $users->name }}</p>
            <hr>
            <p class="w-full py-2 px-3 mr-4 text-sm font-medium text-primary-500 italic">{{ session()->get('message') }}</p>
        </div>
        <div class="h-100 w-full flex items-center justify-center bg-teal-lightest font-sans">
            <div class="bg-white rounded shadow p-6 m-4 w-full lg:w-3/4 lg:max-w-lg">
                <div class="mb-4">
                    @foreach ($todos as $todo)
                        <div class="flex mb-3 items-center">
                            <p class="w-full text-grey-darkest">{{ $todo->todo }}</p>
                            {{-- <div>
                                <button class="flex-no-shrink p-2 ml-2 mr-2 border-2 rounded text-white bg-primary-600 hover:bg-primary-700 focus:ring-4 focus:outline-none focus:ring-primary-300 font-medium rounded-lg text-sm px-2.5 py-2.5 text-center dark:bg-primary-600 dark:hover:bg-primary-700 dark:focus:ring-primary-800"><a href="/todoapp/edit/{{ $todo->id }}"></a>Edit</button>
                            </div> --}}
                            <form action="/todoapp/edit/{{ $todo->id }}">
                                @csrf
                                <input type="hidden" name="id" value={{ $todo->id }}>
                                <button class="mt-4 flex-no-shrink p-2 ml-2 mr-2 border-2 rounded text-white bg-primary-600 hover:bg-primary-700 focus:ring-4 focus:outline-none focus:ring-primary-300 font-medium rounded-lg text-sm px-2.5 py-2.5 text-center dark:bg-primary-600 dark:hover:bg-primary-700 dark:focus:ring-primary-800">Edit</button>
                            </form>
                            <form action={{ route('todo_delete') }} method="POST">
                                @csrf
                                <input type="hidden" name="id" value={{ $todo->id }}>
                                <button class="mt-4 flex-no-shrink p-2 mr-2 border-2 rounded text-white bg-red-600 hover:bg-red-700 focus:ring-4 focus:outline-none focus:ring-red-300 font-medium rounded-lg text-sm px-2.5 py-2.5 text-center dark:bg-red-600 dark:hover:bg-red-700 dark:focus:ring-red-800">Remove</button>
                            </form>
                        </div>
                        <hr>
                    @endforeach
                </div>
            </div>
        </div>
        
        <div>
            <form action={{ route('logout_action') }} method="POST" class="flex-no-shrink p-1 mr-2 border-2 rounded text-white bg-red-600 hover:bg-red-700 focus:ring-4 focus:outline-none focus:ring-red-300 font-medium rounded-lg text-sm px-1 py-2.5 text-center dark:bg-red-600 dark:hover:bg-red-700 dark:focus:ring-red-800 w-full">
                @csrf
                <input name="token" type="hidden" value={{ $userslogout->token }}>
                <button>Sign Out</button>
            </form>
        </div>
    </div>
  </section>
@endsection

{{-- <div class="h-100 w-full flex items-center justify-center bg-teal-lightest font-sans">
    <div class="bg-white rounded shadow p-6 m-4 w-full lg:w-3/4 lg:max-w-lg">
        <div class="flex mb-4 items-center">
            <tbody>
                <tr>
                    @foreach ($todos as $todo)
                        <p class="w-full text-grey-darkest">{{ $todo->todo }}</p>
                        <button class="flex-no-shrink p-2 ml-2 mr-2 border-2 rounded text-white bg-primary-600 hover:bg-primary-700 focus:ring-4 focus:outline-none focus:ring-primary-300 font-medium rounded-lg text-sm px-2.5 py-2.5 text-center dark:bg-primary-600 dark:hover:bg-primary-700 dark:focus:ring-primary-800">Edit</button>
                        <button class="flex-no-shrink p-2 mr-2 border-2 rounded text-white bg-red-600 hover:bg-red-700 focus:ring-4 focus:outline-none focus:ring-red-300 font-medium rounded-lg text-sm px-2.5 py-2.5 text-center dark:bg-red-600 dark:hover:bg-red-700 dark:focus:ring-red-800">Remove</button>
                    @endforeach
                </tr>
            </tbody>
        </div>
    </div>
</div> --}}


