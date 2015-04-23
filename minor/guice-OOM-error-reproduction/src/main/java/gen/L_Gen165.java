
  package gen;
  public class L_Gen165 {
  		@com.google.inject.Inject
  		public L_Gen165(L_Gen166 l_gen166){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + l_gen166 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  