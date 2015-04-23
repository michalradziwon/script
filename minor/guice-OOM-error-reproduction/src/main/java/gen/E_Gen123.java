
  package gen;
  public class E_Gen123 {
  		@com.google.inject.Inject
  		public E_Gen123(E_Gen124 e_gen124){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + e_gen124 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  