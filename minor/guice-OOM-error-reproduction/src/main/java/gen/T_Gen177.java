
  package gen;
  public class T_Gen177 {
  		@com.google.inject.Inject
  		public T_Gen177(T_Gen178 t_gen178){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + t_gen178 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  