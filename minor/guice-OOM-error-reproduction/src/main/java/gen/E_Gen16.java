
  package gen;
  public class E_Gen16 {
  		@com.google.inject.Inject
  		public E_Gen16(E_Gen17 e_gen17){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + e_gen17 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  