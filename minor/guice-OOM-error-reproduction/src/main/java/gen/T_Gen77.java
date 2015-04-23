
  package gen;
  public class T_Gen77 {
  		@com.google.inject.Inject
  		public T_Gen77(T_Gen78 t_gen78){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + t_gen78 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  