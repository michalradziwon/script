
  package gen;
  public class L_Gen103 {
  		@com.google.inject.Inject
  		public L_Gen103(L_Gen104 l_gen104){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + l_gen104 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  