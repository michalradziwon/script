
  package gen;
  public class E_Gen121 {
  		@com.google.inject.Inject
  		public E_Gen121(E_Gen122 e_gen122){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + e_gen122 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  