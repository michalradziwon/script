
  package gen;
  public class L_Gen88 {
  		@com.google.inject.Inject
  		public L_Gen88(L_Gen89 l_gen89){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + l_gen89 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  