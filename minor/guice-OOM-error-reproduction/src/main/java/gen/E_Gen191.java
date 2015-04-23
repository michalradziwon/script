
  package gen;
  public class E_Gen191 {
  		@com.google.inject.Inject
  		public E_Gen191(E_Gen192 e_gen192){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + e_gen192 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  