
  package gen;
  public class E_Gen62 {
  		@com.google.inject.Inject
  		public E_Gen62(E_Gen63 e_gen63){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + e_gen63 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  