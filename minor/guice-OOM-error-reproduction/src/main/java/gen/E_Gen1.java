
  package gen;
  public class E_Gen1 {
  		@com.google.inject.Inject
  		public E_Gen1(E_Gen2 e_gen2){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + e_gen2 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  