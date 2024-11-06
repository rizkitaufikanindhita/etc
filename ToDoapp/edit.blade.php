@extends('master.master');

@section('content')
<section class="bg-gray-50 dark:bg-gray-900">
    <div class="flex flex-col items-center justify-center px-6 py-8 mx-auto md:h-screen lg:py-0">
        <a href="#" class="flex items-center mb-6 text-2xl font-semibold text-gray-900 dark:text-white">
            <img class="w-8 h-8 mr-2" src="https://flowbite.s3.amazonaws.com/blocks/marketing-ui/logo.svg" alt="logo">
            To Do App    
        </a>
        <div class="mb-4">
            <form class="flex mt-4" action="{{ route('todo_edit_action', ['id' => $task->id]) }}" method="POST">
                @csrf
                <input class="shadow appearance-none border rounded w-full py-2 px-3 mr-4 text-grey-darker" placeholder={{ $task->todo }} name="todo">
                <button class="flex-no-shrink p-1 ml-2 mr-2 border-2 rounded text-white bg-primary-600 hover:bg-primary-700 focus:ring-4 focus:outline-none focus:ring-primary-300 font-medium rounded-lg text-sm px-2.5 py-2.5 text-center dark:bg-primary-600 dark:hover:bg-primary-700 dark:focus:ring-primary-800">Edit</button>
            </form>
        </div>
    </div>
</section>
@endsection