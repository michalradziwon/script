
  package gen;
  public class T_Gen74 {
  		@com.google.inject.Inject
  		public T_Gen74(T_Gen75 t_gen75){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + t_gen75 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  