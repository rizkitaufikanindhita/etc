<?php

namespace Database\Seeders;
use App\Models\Users;
use App\Models\Todo;
// use Illuminate\Database\Console\Seeds\WithoutModelEvents;
use Illuminate\Database\Seeder;

class DatabaseSeeder extends Seeder
{
    /**
     * Seed the application's database.
     */
    public function run(): void
    {
        $users = Users::find(1);
        if(!$users){
            Users::factory(1)->create();
        }
        // Todo::factory(5)->create();
    }
}
