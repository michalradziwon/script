
  package gen;
  public class L_Gen14 {
  		@com.google.inject.Inject
  		public L_Gen14(L_Gen15 l_gen15){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + l_gen15 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  