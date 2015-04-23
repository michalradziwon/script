
  package gen;
  public class E_Gen183 {
  		@com.google.inject.Inject
  		public E_Gen183(E_Gen184 e_gen184){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + e_gen184 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  