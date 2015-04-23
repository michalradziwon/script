
  package gen;
  public class L_Gen45 {
  		@com.google.inject.Inject
  		public L_Gen45(L_Gen46 l_gen46){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + l_gen46 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  