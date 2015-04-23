
  package gen;
  public class L_Gen69 {
  		@com.google.inject.Inject
  		public L_Gen69(L_Gen70 l_gen70){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + l_gen70 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  