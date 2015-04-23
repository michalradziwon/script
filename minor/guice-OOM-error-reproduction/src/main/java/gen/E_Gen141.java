
  package gen;
  public class E_Gen141 {
  		@com.google.inject.Inject
  		public E_Gen141(E_Gen142 e_gen142){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + e_gen142 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  