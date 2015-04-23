
  package gen;
  public class L_Gen129 {
  		@com.google.inject.Inject
  		public L_Gen129(L_Gen130 l_gen130){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + l_gen130 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  