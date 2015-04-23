
  package gen;
  public class L_Gen166 {
  		@com.google.inject.Inject
  		public L_Gen166(L_Gen167 l_gen167){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + l_gen167 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  