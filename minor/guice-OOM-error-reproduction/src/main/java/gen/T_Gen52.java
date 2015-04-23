
  package gen;
  public class T_Gen52 {
  		@com.google.inject.Inject
  		public T_Gen52(T_Gen53 t_gen53){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + t_gen53 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  