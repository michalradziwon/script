
  package gen;
  public class T_Gen120 {
  		@com.google.inject.Inject
  		public T_Gen120(T_Gen121 t_gen121){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + t_gen121 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  