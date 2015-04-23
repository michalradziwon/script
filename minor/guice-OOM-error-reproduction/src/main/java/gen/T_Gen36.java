
  package gen;
  public class T_Gen36 {
  		@com.google.inject.Inject
  		public T_Gen36(T_Gen37 t_gen37){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + t_gen37 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  