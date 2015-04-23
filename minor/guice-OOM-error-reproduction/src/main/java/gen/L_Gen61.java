
  package gen;
  public class L_Gen61 {
  		@com.google.inject.Inject
  		public L_Gen61(L_Gen62 l_gen62){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + l_gen62 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  