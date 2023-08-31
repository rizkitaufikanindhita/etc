<?php

namespace App\Http\Controllers;

use App\Models\Users;
use App\Models\Todo;
use GuzzleHttp\RetryMiddleware;
use Illuminate\Http\Request;
use Illuminate\Support\Facades\Hash;
use Illuminate\Support\Facades\Session;
use Illuminate\Support\Str;

class UsersController extends Controller
{
    public function home(){
        return view('home');
    }
    public function login_form()
    {
        return view('login');    
    }

    public function login_action(Request $request)
    {
        $users = Users::where('name',$request->name)->first();
        if($users == null){
            return redirect()->back()->with('error','username tidak sesuai');
        }
        $db_password = $users->password;
        $hashed_password = Hash::check($request->password,$db_password);
        
        if($hashed_password){
            $users->token = Str::random(20);
            $users->save();
            $request->session()->put('token', $users->token);
            return to_route('todo_index');
        }else{
            return redirect()->back()->with('error','password tidak sesuai');
        }
    }

    public function logout_action(Request $request)
    {
        Users::where('token', $request->token)->update([
            'token' => NULL
        ]);
        
        Session::pull('token');   
        return to_route('login_form');
    }    
}
