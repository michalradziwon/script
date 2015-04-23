
  package gen;
  public class L_Gen53 {
  		@com.google.inject.Inject
  		public L_Gen53(L_Gen54 l_gen54){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + l_gen54 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  