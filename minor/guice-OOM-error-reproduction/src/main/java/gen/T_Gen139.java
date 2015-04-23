
  package gen;
  public class T_Gen139 {
  		@com.google.inject.Inject
  		public T_Gen139(T_Gen140 t_gen140){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + t_gen140 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  