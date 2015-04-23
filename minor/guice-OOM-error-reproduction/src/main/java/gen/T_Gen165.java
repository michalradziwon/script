
  package gen;
  public class T_Gen165 {
  		@com.google.inject.Inject
  		public T_Gen165(T_Gen166 t_gen166){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + t_gen166 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  