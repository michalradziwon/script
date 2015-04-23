
  package gen;
  public class L_Gen168 {
  		@com.google.inject.Inject
  		public L_Gen168(L_Gen169 l_gen169){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + l_gen169 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  