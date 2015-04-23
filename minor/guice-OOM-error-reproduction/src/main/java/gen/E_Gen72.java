
  package gen;
  public class E_Gen72 {
  		@com.google.inject.Inject
  		public E_Gen72(E_Gen73 e_gen73){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + e_gen73 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  