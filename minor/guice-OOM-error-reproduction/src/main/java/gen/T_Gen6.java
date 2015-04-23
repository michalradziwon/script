
  package gen;
  public class T_Gen6 {
  		@com.google.inject.Inject
  		public T_Gen6(T_Gen7 t_gen7){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + t_gen7 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  