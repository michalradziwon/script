
  package gen;
  public class T_Gen176 {
  		@com.google.inject.Inject
  		public T_Gen176(T_Gen177 t_gen177){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + t_gen177 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  