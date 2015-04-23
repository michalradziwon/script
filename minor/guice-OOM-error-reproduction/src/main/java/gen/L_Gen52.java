
  package gen;
  public class L_Gen52 {
  		@com.google.inject.Inject
  		public L_Gen52(L_Gen53 l_gen53){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + l_gen53 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  