
  package gen;
  public class L_Gen174 {
  		@com.google.inject.Inject
  		public L_Gen174(L_Gen175 l_gen175){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + l_gen175 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  