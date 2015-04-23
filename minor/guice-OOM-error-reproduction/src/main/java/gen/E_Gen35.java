
  package gen;
  public class E_Gen35 {
  		@com.google.inject.Inject
  		public E_Gen35(E_Gen36 e_gen36){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + e_gen36 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  