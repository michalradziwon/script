
  package gen;
  public class L_Gen94 {
  		@com.google.inject.Inject
  		public L_Gen94(L_Gen95 l_gen95){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + l_gen95 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  