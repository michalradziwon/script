
  package gen;
  public class L_Gen175 {
  		@com.google.inject.Inject
  		public L_Gen175(L_Gen176 l_gen176){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + l_gen176 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  