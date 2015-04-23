
  package gen;
  public class L_Gen58 {
  		@com.google.inject.Inject
  		public L_Gen58(L_Gen59 l_gen59){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + l_gen59 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  