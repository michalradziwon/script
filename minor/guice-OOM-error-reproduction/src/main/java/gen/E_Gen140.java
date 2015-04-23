
  package gen;
  public class E_Gen140 {
  		@com.google.inject.Inject
  		public E_Gen140(E_Gen141 e_gen141){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + e_gen141 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  