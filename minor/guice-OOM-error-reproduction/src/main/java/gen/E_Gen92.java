
  package gen;
  public class E_Gen92 {
  		@com.google.inject.Inject
  		public E_Gen92(E_Gen93 e_gen93){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + e_gen93 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  