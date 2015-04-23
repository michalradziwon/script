
  package gen;
  public class L_Gen72 {
  		@com.google.inject.Inject
  		public L_Gen72(L_Gen73 l_gen73){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + l_gen73 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  