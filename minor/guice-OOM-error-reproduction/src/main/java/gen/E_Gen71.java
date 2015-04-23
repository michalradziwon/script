
  package gen;
  public class E_Gen71 {
  		@com.google.inject.Inject
  		public E_Gen71(E_Gen72 e_gen72){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + e_gen72 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  