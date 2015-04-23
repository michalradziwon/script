
  package gen;
  public class L_Gen16 {
  		@com.google.inject.Inject
  		public L_Gen16(L_Gen17 l_gen17){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + l_gen17 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  