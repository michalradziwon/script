
  package gen;
  public class E_Gen80 {
  		@com.google.inject.Inject
  		public E_Gen80(E_Gen81 e_gen81){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + e_gen81 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  