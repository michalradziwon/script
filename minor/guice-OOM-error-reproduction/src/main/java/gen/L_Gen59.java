
  package gen;
  public class L_Gen59 {
  		@com.google.inject.Inject
  		public L_Gen59(L_Gen60 l_gen60){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + l_gen60 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  