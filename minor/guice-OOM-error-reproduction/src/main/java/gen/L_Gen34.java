
  package gen;
  public class L_Gen34 {
  		@com.google.inject.Inject
  		public L_Gen34(L_Gen35 l_gen35){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + l_gen35 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  