
  package gen;
  public class E_Gen2 {
  		@com.google.inject.Inject
  		public E_Gen2(E_Gen3 e_gen3){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + e_gen3 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  