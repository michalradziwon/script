
  package gen;
  public class E_Gen169 {
  		@com.google.inject.Inject
  		public E_Gen169(E_Gen170 e_gen170){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + e_gen170 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  