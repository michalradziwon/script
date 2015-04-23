
  package gen;
  public class L_Gen84 {
  		@com.google.inject.Inject
  		public L_Gen84(L_Gen85 l_gen85){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + l_gen85 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  