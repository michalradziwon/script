
  package gen;
  public class L_Gen111 {
  		@com.google.inject.Inject
  		public L_Gen111(L_Gen112 l_gen112){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + l_gen112 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  