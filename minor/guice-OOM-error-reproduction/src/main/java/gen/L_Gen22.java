
  package gen;
  public class L_Gen22 {
  		@com.google.inject.Inject
  		public L_Gen22(L_Gen23 l_gen23){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + l_gen23 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  