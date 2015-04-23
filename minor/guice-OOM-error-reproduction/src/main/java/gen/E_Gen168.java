
  package gen;
  public class E_Gen168 {
  		@com.google.inject.Inject
  		public E_Gen168(E_Gen169 e_gen169){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + e_gen169 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  