
  package gen;
  public class E_Gen144 {
  		@com.google.inject.Inject
  		public E_Gen144(E_Gen145 e_gen145){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + e_gen145 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  