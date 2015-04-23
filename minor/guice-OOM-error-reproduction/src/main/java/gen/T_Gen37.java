
  package gen;
  public class T_Gen37 {
  		@com.google.inject.Inject
  		public T_Gen37(T_Gen38 t_gen38){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + t_gen38 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  