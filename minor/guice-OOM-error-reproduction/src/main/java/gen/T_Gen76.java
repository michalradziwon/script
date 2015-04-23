
  package gen;
  public class T_Gen76 {
  		@com.google.inject.Inject
  		public T_Gen76(T_Gen77 t_gen77){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + t_gen77 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  