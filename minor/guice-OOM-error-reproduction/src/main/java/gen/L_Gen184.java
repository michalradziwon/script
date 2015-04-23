
  package gen;
  public class L_Gen184 {
  		@com.google.inject.Inject
  		public L_Gen184(L_Gen185 l_gen185){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + l_gen185 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  