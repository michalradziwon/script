
  package gen;
  public class E_Gen81 {
  		@com.google.inject.Inject
  		public E_Gen81(E_Gen82 e_gen82){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + e_gen82 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  