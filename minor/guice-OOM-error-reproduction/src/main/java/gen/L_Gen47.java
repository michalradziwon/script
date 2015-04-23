
  package gen;
  public class L_Gen47 {
  		@com.google.inject.Inject
  		public L_Gen47(L_Gen48 l_gen48){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + l_gen48 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  