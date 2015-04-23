
  package gen;
  public class T_Gen172 {
  		@com.google.inject.Inject
  		public T_Gen172(T_Gen173 t_gen173){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + t_gen173 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  