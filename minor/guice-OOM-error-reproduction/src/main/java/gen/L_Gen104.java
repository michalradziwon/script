
  package gen;
  public class L_Gen104 {
  		@com.google.inject.Inject
  		public L_Gen104(L_Gen105 l_gen105){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + l_gen105 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  