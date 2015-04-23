
  package gen;
  public class E_Gen115 {
  		@com.google.inject.Inject
  		public E_Gen115(E_Gen116 e_gen116){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + e_gen116 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  