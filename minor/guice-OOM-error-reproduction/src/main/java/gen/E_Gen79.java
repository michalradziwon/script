
  package gen;
  public class E_Gen79 {
  		@com.google.inject.Inject
  		public E_Gen79(E_Gen80 e_gen80){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + e_gen80 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  