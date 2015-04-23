
  package gen;
  public class T_Gen121 {
  		@com.google.inject.Inject
  		public T_Gen121(T_Gen122 t_gen122){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + t_gen122 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  