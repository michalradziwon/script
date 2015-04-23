
  package gen;
  public class P_Gen107 {
  		@com.google.inject.Inject
  		public P_Gen107(P_Gen108 p_gen108){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + p_gen108 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  