
  package gen;
  public class L_Gen153 {
  		@com.google.inject.Inject
  		public L_Gen153(L_Gen154 l_gen154){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + l_gen154 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  