
  package gen;
  public class L_Gen49 {
  		@com.google.inject.Inject
  		public L_Gen49(L_Gen50 l_gen50){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + l_gen50 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  