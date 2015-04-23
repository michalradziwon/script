
  package gen;
  public class L_Gen183 {
  		@com.google.inject.Inject
  		public L_Gen183(L_Gen184 l_gen184){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + l_gen184 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  