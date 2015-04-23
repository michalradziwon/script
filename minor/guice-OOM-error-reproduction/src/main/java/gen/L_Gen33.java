
  package gen;
  public class L_Gen33 {
  		@com.google.inject.Inject
  		public L_Gen33(L_Gen34 l_gen34){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + l_gen34 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  