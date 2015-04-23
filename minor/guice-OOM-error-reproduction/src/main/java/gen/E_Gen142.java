
  package gen;
  public class E_Gen142 {
  		@com.google.inject.Inject
  		public E_Gen142(E_Gen143 e_gen143){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + e_gen143 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  