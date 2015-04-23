
  package gen;
  public class L_Gen15 {
  		@com.google.inject.Inject
  		public L_Gen15(L_Gen16 l_gen16){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + l_gen16 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  