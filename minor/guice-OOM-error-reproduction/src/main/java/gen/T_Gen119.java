
  package gen;
  public class T_Gen119 {
  		@com.google.inject.Inject
  		public T_Gen119(T_Gen120 t_gen120){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + t_gen120 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  