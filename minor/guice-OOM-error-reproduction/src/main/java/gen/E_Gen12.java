
  package gen;
  public class E_Gen12 {
  		@com.google.inject.Inject
  		public E_Gen12(E_Gen13 e_gen13){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + e_gen13 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  