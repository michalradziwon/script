
  package gen;
  public class P_Gen167 {
  		@com.google.inject.Inject
  		public P_Gen167(P_Gen168 p_gen168){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + p_gen168 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  