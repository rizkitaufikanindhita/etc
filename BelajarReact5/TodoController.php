<?php

namespace App\Http\Controllers;

use App\Models\Todo;
use App\Models\Users;
use Illuminate\Http\Request;
use Illuminate\Support\Facades\Session;

class TodoController extends Controller
{
    public function todo_index()
    {
        if(Session::has('token')){
            $todos = Todo::get();
            $userlogout = Users::where('token', Session::get('token'))->first(); 
            $users = Users::first();
            return view('todoapp',[
                'users' => $users,
                'userslogout' => $userlogout,
                'todos' => $todos,
            ]);
        }else{
            return to_route('login_form');
        }
    }

    public function todo_delete(Request $request)
    {
        Todo::find($request->id)->delete();
        return redirect()->back()->with('message','task berhasil dihapus');
    }
    
    public function todo_add(Request $request)
    {
        $request->validate([
            'todo' => ['required', 'max:255', 'min:1'],
        ]);
        $doing = Todo::create([
            'todo' => $request->todo,
        ]);
        if($doing){
            return redirect()->back()->with('message','task berhasil dibuat');
        } else {
            return redirect()->back()->with('message','task gagal dibuat');
        }
    }

    public function todo_edit($id)
    {
        $task = Todo::find($id);
        return view('edit',[
            'task' => $task,
        ]);
    }

    public function todo_edit_action(Request $request, $id)
    {
        $request->validate([
            'todo' => ['required', 'max:255', 'min:1'],
        ]);
    
        $todo = Todo::findOrFail($id);
    
        $result = $todo->update([
            'todo' => $request->todo,
        ]);
    
        if ($result) {
            return redirect()->route('todo_index')->with('message', 'Task berhasil diubah');
        } else {
            return redirect()->route('todo_index')->with('message', 'Task gagal diubah');
        }
    }
    

}
