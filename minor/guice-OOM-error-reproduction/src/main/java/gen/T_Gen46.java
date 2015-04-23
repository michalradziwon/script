
  package gen;
  public class T_Gen46 {
  		@com.google.inject.Inject
  		public T_Gen46(T_Gen47 t_gen47){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + t_gen47 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  