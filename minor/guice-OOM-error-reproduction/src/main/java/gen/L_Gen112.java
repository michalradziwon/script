
  package gen;
  public class L_Gen112 {
  		@com.google.inject.Inject
  		public L_Gen112(L_Gen113 l_gen113){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + l_gen113 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  