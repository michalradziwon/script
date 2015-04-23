
  package gen;
  public class E_Gen45 {
  		@com.google.inject.Inject
  		public E_Gen45(E_Gen46 e_gen46){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + e_gen46 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  