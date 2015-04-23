
  package gen;
  public class L_Gen90 {
  		@com.google.inject.Inject
  		public L_Gen90(L_Gen91 l_gen91){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + l_gen91 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  