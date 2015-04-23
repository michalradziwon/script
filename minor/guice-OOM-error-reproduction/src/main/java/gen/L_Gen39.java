
  package gen;
  public class L_Gen39 {
  		@com.google.inject.Inject
  		public L_Gen39(L_Gen40 l_gen40){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + l_gen40 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  