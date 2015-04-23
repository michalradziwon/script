
  package gen;
  public class E_Gen52 {
  		@com.google.inject.Inject
  		public E_Gen52(E_Gen53 e_gen53){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + e_gen53 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  