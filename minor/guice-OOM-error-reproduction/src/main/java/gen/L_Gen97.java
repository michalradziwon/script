
  package gen;
  public class L_Gen97 {
  		@com.google.inject.Inject
  		public L_Gen97(L_Gen98 l_gen98){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + l_gen98 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  